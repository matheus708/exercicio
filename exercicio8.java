import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		String senha;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a senha ");
		senha = leitor.next();
		
		if(senha.equals("AEDB"))
			System.out.println("Acesso permitido");
		
		else
			System.out.println("Você não tem acesso ao sistema ");
		
		
				
				
			

	}

}
