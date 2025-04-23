import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import api.ComputeRequest;

public class TestBenchmark{
	@Test
	public void benchmark() throws IOException {
		
		MultiNetworker fastNetworker = new MultiNetworker();
		SlowNetworker slowNetworker = new  SlowNetworker();
		
		ComputeRequest testInputs = new ComputeRequest("test/speedTestInputs.txt");
		
		long timeFast = fastNetworker.computeSpeed(testInputs);
		System.out.println("Fast speed: " );
		System.out.println(timeFast);
		
		

		long timeSlow = slowNetworker.computeSpeed(testInputs);			///revisit	
		System.out.println("Slow speed: ");
		System.out.println(timeSlow);
		
		//if less than 10 % speed increase
		if((timeSlow - timeFast) / (1.0*timeSlow) < .1) {
			fail("Fast Networker is not at least 10% faster than slow networker");
		}
		
	}
}