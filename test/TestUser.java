
import api.ComputeRequest;
import api.ComputeResult;




public class TestUser {
  
   // TODO 3: change the type of this variable to the name you're using for your
   // @NetworkAPI interface; also update the parameter passed to the constructor
   private final MultiNetworker coordinator;


   public TestUser(MultiNetworker coordinator) {
      this.coordinator = coordinator;
   }
   
   


   public void run(String outputPath) {
//      char delimiter = ';';
      String inputPath = "./test/testInputFile.test.txt";
      ComputeRequest inputRequest = new ComputeRequest(inputPath, outputPath);
      // TODO 4: Call the appropriate method(s) on the coordinator to get it to
      try {
    	  ComputeResult outputResult = coordinator.compute(inputRequest);
      } catch (Exception e) {
    	  System.err.println("File reader exception in TestUser.java");
      }
      
      
      

      // run the compute job specified by inputPath, outputPath, and delimiter
   }


}
