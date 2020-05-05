import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número ");
		x = leitor.nextInt();
		
		if(x > 0) 
		System.out.println("Positivo");
		
		else if(x < 0)
		System.out.println("Negativo");

	}

}
