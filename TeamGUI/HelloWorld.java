//public class Scanner {
import java.util.Scanner;
public class HelloWorld {
	
	
	public static void main(String[] args) {
		while(true) {
		System.out.println("WHAT... is your name?");
		Scanner scname = new Scanner(System.in);
		String name = scname.nextLine();
		System.out.println("Hello " + name);
		System.out.println("WHAT... is your quest?");
		Scanner scquest = new Scanner(System.in);
		String quest = scquest.nextLine();
		System.out.println(quest + " is a shitty quest. \nPlease try again.\n");
		}
		//System.out.println("HALLO");
		//System.out.println(args[1]);
		
	}
}
