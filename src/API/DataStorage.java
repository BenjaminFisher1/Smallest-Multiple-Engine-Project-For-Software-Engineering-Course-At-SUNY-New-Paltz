package api;

@ProcessAPI
public interface DataStorage{
	String readUserInput(String source);
	void writeOutput(String destination, int computeResult);
}
