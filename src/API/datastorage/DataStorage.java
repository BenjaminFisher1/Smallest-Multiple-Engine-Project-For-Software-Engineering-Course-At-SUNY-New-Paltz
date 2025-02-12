package datastorage;

import project.annotations.NetworkAPI;

@ProcessAPI
public interface DataStorage{
	String readUserInput(String source);
	void writeOutput(String destination, int computeResult);
}
