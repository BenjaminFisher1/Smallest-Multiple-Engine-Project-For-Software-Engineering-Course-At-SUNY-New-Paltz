import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import dataStorageServer.DataStorageServer.fetchRequest;
import dataStorageServer.DataStorageServer.storeRequest;
import dataStorageServer.fetchDataStorageServiceGrpc;
import dataStorageServer.fetchDataStorageServiceGrpc.fetchDataStorageServiceBlockingStub;
import dataStorageServer.storeDataStorageServiceGrpc;
import dataStorageServer.storeDataStorageServiceGrpc.storeDataStorageServiceBlockingStub;
import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

public class DataStorageClient{
	private final storeDataStorageServiceBlockingStub blockingStub;
	private final fetchDataStorageServiceBlockingStub fetchblockingStub;
	
	public DataStorageClient(Channel channel) {
		blockingStub = storeDataStorageServiceGrpc.newBlockingStub(channel);
		fetchblockingStub = fetchDataStorageServiceGrpc.newBlockingStub(channel);
	}
	
	public void storeRequest(ArrayList<Long> al, String filename) {
		storeRequest storeReq = storeRequest.newBuilder()
					.setInputLong(0, al.get(3))
					.setFileName(filename).build();
		try {
			blockingStub.storeDataStorageServiceProcess(storeReq);
		} catch (StatusRuntimeException e) {
			e.printStackTrace();
			return;
		}
	
	
	}
	
	public void fetchRequest(ArrayList<Long> al, String outputFilename) {
		fetchRequest fetchReq = fetchRequest.newBuilder()
					.setOutputLong(0, al.get(1))
					.setFileName(outputFilename).build();
		try {
			fetchblockingStub.fetchDataStorageServiceProcess(fetchReq);
		} catch (StatusRuntimeException e) {
			e.printStackTrace();
			return;
		}
		
	
	}
	
	public static void main(String[] args) throws Exception{
		String target = "localhost:50052";
		ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create()).build();
		try {
			DataStorageClient dsclient = new DataStorageClient(channel);
		}catch (Exception e){
			System.out.println("Failed to store");	
		} finally {
			channel.shutdown().awaitTermination(5,  TimeUnit.SECONDS);
		}
	}
	
	
	
}