package api;

import java.io.IOException;

import project.annotations.NetworkAPI;

@NetworkAPI
public interface Networker {
		ComputeResult compute(ComputeRequest request) throws IOException;
    }
    //comment




