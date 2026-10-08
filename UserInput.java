import java.utill.scanner;


public class UserInput{
	public static void main(String[] args){
		scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scan.nextline();
		
		System.out.print("Enter your gender: ");
		String gender = scan.next();
		
		System.out.print("Enter your address: ");
		String address = scan.nextline();
		
		System.out.print("Enter your age: ");
		int age = scan.nextint();
		
		Sytem.out.print(name + "Are you learning java (true/fulse); ");
		boolean answer = scan.nextBoolean();
		
	System.out.print("welcome %s to NIIT", name);
	System.out.printf("You are a %s and you are living in $s ",gender,address);
	System.out.printf("You are old. Nice meeting you%n" ,age);

	
		
		
		
		
		
		
	}
}