package dad.codesignal;

public class TheJourneyBegins {

	public int add(int a, int b) {
		return a + b;
	}

	public int centuryFromYear(int year) {
		int siglo = 0;
		if(year % 100 == 0)
			siglo = year /= 100;
		else
			siglo = (year /= 100) + 1;
		return siglo;
	}
	
	public boolean esPalindromo(String inputString) {
	    return new StringBuilder(inputString).reverse().toString().equals(inputString);
	}
	
}