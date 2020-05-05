import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
			float x, y, z;
			float soma; 
			float media ;
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Digite a primeira nota ");
			x = leitor.nextFloat();
			
			System.out.println("Digite a segunda nota ");
			y = leitor.nextFloat();
			
			System.out.println("Digite a terceira nota ");
			z = leitor.nextFloat();
			
			soma = x*2+y*3+z*5;
			media = soma/10;
			
				System.out.println("Sua media é " +media);
			
			if( media == 7 )
				System.out.print("Aluno aprovado ");
			
					
			else 
				System.out.print("Aluno reprovado ");
			
		}

	}


