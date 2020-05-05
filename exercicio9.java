import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		
		
		float produto, produto30, produto45;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.printf("Digite o valor do produto ");
		produto = leitor.nextFloat();
		
		produto30 = (float) (produto * 1.3);
		produto45 = (float) (produto * 1.45);
		
		if(produto > 20)
			System.out.printf("Valor do produto " +produto30);
		
		else
			System.out.printf("Valor do produto " +produto45);
		
		
	}

}
