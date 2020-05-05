import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args){
		
		int x;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número ");
		x = leitor.nextInt();
		
		if(x % 2 == 0){
			System.out.print("Par ");
		}
		else {
			System.out.print("Ímpar ");
		}

	}
}