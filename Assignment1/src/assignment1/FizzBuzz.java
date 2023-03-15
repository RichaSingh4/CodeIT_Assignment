package assignment1;

public class FizzBuzz {

	public static void main(String[] args) {
		//calling method...
		
		multiple();
		

	}
	//method for finding multiple....
	public static void multiple() {
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				System.out.println("Fizz"+" "+i);
			}
			if(i%5==0) {
				System.out.println("Buzz"+" "+i);
			}
			 if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz"+" "+i);
			}
		}
	}

}
