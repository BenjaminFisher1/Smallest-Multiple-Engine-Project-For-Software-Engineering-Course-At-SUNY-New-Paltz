import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import api.ComputeRequest;
import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import networkerServer.NetworkerServer.clientRequest;
import networkerServer.NetworkerServer.serverResponse;
import networkerServer.networkerServiceGrpc;
import networkerServer.networkerServiceGrpc.networkerServiceBlockingStub;

public class Client{
	private final networkerServiceBlockingStub blockingStub;
	
	public Client(Channel channel) {
		blockingStub = networkerServiceGrpc.newBlockingStub(channel);
	}
	
	public void sendRequest(ComputeRequest computeRequest) {
		
		//build ComputeRequest object into a grpc request:)
		clientRequest req = clientRequest.newBuilder()
				.setFilename(computeRequest.getFileName())
				.setOutputFileName(computeRequest.getOutputFileName()).build();
		
		serverResponse res;
		
		try {
			res = blockingStub.networkerServiceProcess(req);
		} catch (StatusRuntimeException e) {
			e.printStackTrace();
			return;
			
		}
		
		System.out.println("outputted to file: " + res.getWrittenFileLocation());
	}
	
	public static void main(String[] args) throws Exception {
		String target = "localhost:50051";
		ManagedChannel channel = Grpc.newChannelBuilder(target,InsecureChannelCredentials.create()).build();
		
		System.out.println("Welcome. Enter number corresponding to desired input type.");
		System.out.println("1: File name");
		System.out.println("2: Manual Number Entry");
		int desiredFileType;
		
		Scanner scanner = new Scanner(System.in);
		try {
			desiredFileType = scanner.nextInt();
		} catch (Exception e) {
			desiredFileType = 1;
		}
		
		//evil default: this is to prevent from overwriting an existing user output.
		String userEnteredFileName = "4203jsjr093tempoutput9";
		
		
		//get input file, or make one from user entered nums
		if(desiredFileType == 1) {
			//input from a filename
			System.out.println("Enter Filename with .txt");
			try {
				userEnteredFileName = scanner.next();
			} catch (Exception e) {
				System.out.println("error with filename entry");
			}
		} else {
			//input from a bunch of user inputted numbers (evil!)
			ArrayList<Integer> inputArrayList = new ArrayList<>();
			
			System.out.println("Enter numbers manually, end input with character -");
			while(!scanner.next().equals("-")) {
				if(scanner.hasNextInt()) {
					inputArrayList.add(scanner.nextInt());
				}
			}
			
			try (FileWriter writer = new FileWriter(userEnteredFileName)) {	
	            writeToFile(inputArrayList, userEnteredFileName);
	        } catch (IOException e) {
	            System.out.println("Error writing result to file: " + e.getMessage());
	        }	
				
				
		}
		String userEnteredOutputName = "defaultOutput";
		//now we have a filename, user must specify output path.
		System.out.println("Enter output file name with .txt");
		try {
			 userEnteredOutputName = scanner.next();
		} catch (Exception e) {
			System.out.println("error with assigning output file name");
		}
		
		//build a ComputeRequest off of the entered filename and output name
		ComputeRequest computeRequest = new ComputeRequest(userEnteredFileName, userEnteredOutputName);
		System.out.println("computeRequest built with: " + computeRequest.getFileName() + ", " + computeRequest.getOutputFileName());
		
		//send to network
		try {
			Client client = new Client(channel);
			try {
				client.sendRequest(computeRequest);
			} catch (Exception e) {
				System.out.println("Failed to send request");
			}
			
			
		} finally {
			
			channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		}
		
		
		
		
		
	}
	public static void writeToFile(ArrayList<Integer> list, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Integer num : list) {
                writer.write(num);
                writer.newLine(); // Add a new line after each item
            }
        }
    }
}







