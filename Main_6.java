import java.util.Scanner;

public class Main_6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String frase = leitor.nextLine();
		String reverso = new StringBuilder(frase).reverse().toString();
		System.out.println(reverso);
		leitor.close();
	}

}
