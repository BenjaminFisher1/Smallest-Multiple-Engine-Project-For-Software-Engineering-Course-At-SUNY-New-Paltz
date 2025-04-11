import java.io.IOException;
import java.util.concurrent.TimeUnit;

import api.ComputeRequest;
import api.ComputeResult;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.protobuf.services.ProtoReflectionService;
import networkerServer.NetworkerServer;
import networkerServer.NetworkerServer.serverResponse;
import networkerServer.networkerServiceGrpc.networkerServiceImplBase;
//hi

public class NetworkerServerJ{
	private Server server;
	
	//start server
	private void start() throws IOException {
		int port = 50051;
		
		//assign to server val a new grpc server built using specified port & insecure creds (we are local machine only)
		server = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create())
				.addService(new NetworkerServerImpl())
				.addService(ProtoReflectionService.newInstance())
				.build()
				.start();
		
		System.out.println("Server hosted at port " + port);
		
		//shutdown hook taken from inclass example
		Runtime.getRuntime().addShutdownHook(new Thread() {
	          @Override
	          public void run() {
	            System.err.println("*** shutting down gRPC server since JVM is shutting down");
	            try {
	                if (server != null) {
	                  server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
	                }
	            } catch (InterruptedException e) {
	              e.printStackTrace(System.err);
	            }
	            System.err.println("*** server shut down");
	          }
	        });
	}
	
		private void blockUntilShutdown() throws InterruptedException{
			if (server != null) {
				server.awaitTermination();
			}
		}
		
		public static void main(String[] args) throws Exception {
			NetworkerServerJ server = new NetworkerServerJ();
			server.start();
			server.blockUntilShutdown();
		}
	
	class NetworkerServerImpl extends networkerServiceImplBase{
		
		/*This is not as evil as it looks. Basically, we are making sort of constructor taking in a request
		 * and an observer that waits for a server response. looks ugly because we have to import stuff.
		 */
		public void networkerServiceProcess(networkerServer.NetworkerServer.clientRequest request, 
				io.grpc.stub.StreamObserver<NetworkerServer.serverResponse> responseObserver) {
				MultiNetworker multiNetworker = new MultiNetworker();
				
				try {
					String filename = request.getFilename();
					ComputeRequest localRequest = new ComputeRequest(filename);
					ComputeResult localResult;
					localResult = multiNetworker.compute(localRequest);
					
					serverResponse response = serverResponse.newBuilder().setWrittenFileLocation(request.getOutputFileName()).build();
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				
		}
	}
}