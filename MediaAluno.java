package MediaAluno;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner nota = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		
		
		
		
		
		System.out.print("Nota 1:");
		n1= nota.nextDouble();
		
		System.out.print("Nota 2:");
		n2 = nota.nextDouble();
		
		System.out.print("Nota 3:");
		n3 = nota.nextDouble();
		
		System.out.print("Nota 4:");
		n4 = nota.nextDouble();
		
		media = (n1 + n2 + n3 + n4)/ 4;
		if (media > 10 || media < 0) {
			System.out.print("Valores inválidos! Inserir notas entre 0 e 10");
		} else if (media >= 6) {
			System.out.print("Média: " + media + "\nParabéns!! Aprovado");
			
		} else {
			System.out.print("Media: " + media + "\nReprovado");
			
		}
/*
	Scanner ent = new Scanner(System.in);
	int nota = 0;
	int media, i;
	
	while( nota < 4 nota++) {
		
				
		System.out.println("Digite a nota: " + nota );
		nota = ent.nextInt();
		
		media = (nota++)/4;
		System.out.println("Média: " + media);
	*/	
		
	}

	private static void nextDouble(double n1) {
		// TODO Auto-generated method stub
		
	}

	}


