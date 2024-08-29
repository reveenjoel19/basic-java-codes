import java.util.Scanner;

public class IOBasic {
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.print("Name :");
			String name = sc.nextLine();
			System.out.print("Age :");
			int age = sc.nextInt();
			System.out.println("Hello , " + name + ". You are "+ age +" years old.");
			sc.close();
		}
}
