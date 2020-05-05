import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		String nom1, nom2;
		int x, y;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome ");
		nom1 = leitor.next();
		
		System.out.println("Qual sua idade? ");
		x = leitor.nextInt();
		
		System.out.println("Digite seu nome ");
		nom2 = leitor.next();
		
		System.out.println("Qual sua idade? ");
		y = leitor.nextInt();
		
		if(x > y)
				System.out.print(nom1+ " " +x+ "anos");
		
			else
				System.out.print(nom2+ " " +y+ "anos");

	}

}
