import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import dataStorageServer.fetchDataStorageServiceGrpc.fetchDataStorageServiceImplBase;
import dataStorageServer.storeDataStorageServiceGrpc.storeDataStorageServiceImplBase;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.protobuf.services.ProtoReflectionService;

public class DataStorageServer{
	private Server server;
	
	//start server
	private void start() throws IOException{
		int port = 50052;
		
		//make a new grpc server built using specified port & insecure creds
		server = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create())
				.addService(new fetchDataStorageServerImpl())
				.addService(new storeDataStorageServerImpl())
				.addService(ProtoReflectionService.newInstance())
				.build()
				.start();
		
		System.out.println("Data Storage Server hosted at port " + port);
		

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
		
		public static void main(String[] args) throws Exception{
			DataStorageServer server = new DataStorageServer();
			server.start();
			server.blockUntilShutdown();
		}
	
		
	
	
	
	
	 
	class storeDataStorageServerImpl extends storeDataStorageServiceImplBase{
		
		public void storeDataStorageServer(dataStorageServer.DataStorageServer.storeRequest storeReq,
				io.grpc.stub.StreamObserver<dataStorageServer.DataStorageServer.emptyMessage> responseObserver) {
				
				RealDataStorage realDataStorage = new RealDataStorage();
				ArrayList<Long> tempList = new ArrayList<>(storeReq.getInputLongList());
				realDataStorage.storeAll(tempList);
				
				responseObserver.onNext(null);
				responseObserver.onCompleted();
		}
		
	}
	
class fetchDataStorageServerImpl extends fetchDataStorageServiceImplBase{
		
		public void fetchDataStorageService(dataStorageServer.DataStorageServer.fetchRequest fetch, 
				io.grpc.stub.StreamObserver<dataStorageServer.DataStorageServer.emptyMessage> responseObserver) {
			RealDataStorage realDataStorage = new RealDataStorage();
			ArrayList<Long> tempList = new ArrayList<>(fetch.getOutputLongList());
			
			responseObserver.onNext(null);
			responseObserver.onCompleted();
			
			
		}
		
	}
}