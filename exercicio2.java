import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		int x , y;
		int soma;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número ");
		x = leitor.nextInt();
		
		System.out.println("Digite o segundo número ");
		y = leitor.nextInt();
		
		
		soma= x+y;
		
		if(soma > 10) {
		System.out.println("A resposta é " +soma);
		}
		
		
		

	}

}
