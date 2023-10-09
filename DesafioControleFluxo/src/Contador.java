import java.util.Scanner;

public class Contador {
public static void main(String[] args) {
    try (Scanner terminal = new Scanner(System.in)) {
        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (java.util.InputMismatchException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro"); 
		}
    }
		
	}

private static void contar(int parametroUm, int parametroDois) throws java.util.InputMismatchException {
    if (parametroUm > parametroDois){
        throw new java.util.InputMismatchException("O segundo parâmetro deve ser maior que o primeiro");
    }

    int contagem = parametroDois - parametroUm ;
    for (int i = 1; i <= contagem; i++) {
        System.out.println("Imprimindo o número " + i);
}
	
	}
}

