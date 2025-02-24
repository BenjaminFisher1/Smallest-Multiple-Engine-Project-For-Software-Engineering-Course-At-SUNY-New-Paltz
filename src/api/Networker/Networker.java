package api;

import project.annotations.NetworkAPI;

@NetworkAPI
public interface Networker {
		ComputeResult compute(ComputeRequest request);
    }


