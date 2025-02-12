package api;

@ProcessAPI
public interface DataStorageAPI{
	String readUserInput(String source);
	void writeOutput(String destination, int computeResult);
}
