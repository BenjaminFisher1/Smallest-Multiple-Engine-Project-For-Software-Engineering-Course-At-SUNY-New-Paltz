
public static class smallestMult{
	public static void main(String[] args) {

		long k = 20;
		System.out.println(getSmallestMult(k));
	}
	
	public static long getSmallestMult(long n) {
		long smallMult = 1;
		long i = 1;
		while(i <= n) {
			smallMult = (smallMult * i)/greatestCommonDenom(smallMult, i);
            i++;
		}
		return smallMult;
	}
	
	public static long greatestCommonDenom(long x, long y) {
		if(y == 0) {
			return x;
		} else {
			return greatestCommonDenom(y, x % y);
		}
	}
}