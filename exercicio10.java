import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		double altura, M, F;
		String sexo;
		
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.printf("Digite sua altura ");
		altura = leitor.nextDouble();
		
		System.out.printf("Digite seu sexo [M] ou [F] ");
		sexo = leitor.next();
		
		M = ((72.7 * altura) - 58.0);
		F = ((62.1 * altura) - 44.7);
		
		if(sexo.equals("M"))
			System.out.printf("Sexo masculino e seu peso ideal é " +M);
		
		else
			System.out.printf("Sexo feminino e seu peso ideal é " +F);
		
		
	}

}
