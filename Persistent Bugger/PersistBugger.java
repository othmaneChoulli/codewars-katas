class Persist {
	public static int persistence(long n) {
		
    if ( n / 10 == 0)
      return 0;
      
    long digitsMultiplyer = 1; 
    
    for (long i = n; n != 0; n /= 10) {
      digitsMultiplyer *= (n % 10);
    }
    
    return persistence(digitsMultiplyer) + 1;
	}
}
