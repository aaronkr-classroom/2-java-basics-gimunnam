import java.util.Scanner;

public class example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Type your name:");
		String name = s.nextLine();
		System.out.println("welcome," + name + "!");
		
		System.out.println("Type your age:");
		int age = s.nextInt();
		System.out.println("your age:" +age);
	}

}
