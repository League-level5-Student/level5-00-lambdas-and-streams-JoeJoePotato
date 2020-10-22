package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String z=new String();
			String bleh=new String();
			for(int j=0; j<s.length(); j++) {
				 bleh=s.substring(s.length()-j-1, s.length()-j);
				z=z+bleh;
			}
			System.out.println(z);
		}, "hello my good rat star");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String z=new String();
		char bleh;
			for(int j=0; j<s.length(); j++) {
				 bleh=s.charAt(j);
				 if(j%3==2 || j%4==3) {
					
				 }
				z=z+bleh;
			}
			System.out.println(z);
		}, "hello my good rat star");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String z=new String();
			String bleh=new String();
			for(int j=0; j<s.length(); j++) {
				 bleh=s.substring(s.length()-j-1, s.length()-j);
				if(j>0) {
				 z=z+".";
				}
				 z=z+bleh;
			}
			System.out.println(z);
		}, "hello my good rat star");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String z=new String();
			char bleh;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j)!='a' && s.charAt(j)!='e' && s.charAt(j)!='i' && s.charAt(j)!='o' && s.charAt(j)!='u') {
				bleh=s.charAt(j);
				z=z+bleh;
				}
				
			}
			System.out.println(z);
		}, "hello my good rat star");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
		
	}
}
	
