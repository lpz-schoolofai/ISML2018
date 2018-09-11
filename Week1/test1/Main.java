import java.util.Scanner;
public class Main {
	static Scanner lee = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("¿Cuál es tu nombre? ");
		String nombre = lee.nextLine();
		System.out.println("Hello world!");
		System.out.println(nombre + ", bienvenido al curso ISML.");
		for (int k = 0; k< nombre.length(); k++){
			System.out.println( nombre.charAt(k));
		}
	}
}
