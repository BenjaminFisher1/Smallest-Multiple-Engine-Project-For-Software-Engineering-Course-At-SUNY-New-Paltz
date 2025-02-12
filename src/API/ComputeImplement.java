package api;

import project.annotations.NetworkAPI;

@NetworkAPI
public interface ComputeImplement {
    int userInputInt(int n);

    public static int getUserInput(){
        return 1;   //placeholder
    }

}
