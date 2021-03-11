

;

public class RemoveDuplicates {

	public static boolean PrimeNumber(int number){		
		for(int i=2; i<=number/2; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String a[]){
		System.out.println("Is 17 prime number? "+PrimeNumber(17));
		System.out.println("Is 19 prime number? "+PrimeNumber(19));
		System.out.println("Is 15 prime number? "+PrimeNumber(15));
		System.out.println("Is 15 prime number? "+PrimeNumber(2));
		System.out.println("Is 15 prime number? "+PrimeNumber(21));
		System.out.println("Is 15 prime number? "+PrimeNumber(3));
	}
}