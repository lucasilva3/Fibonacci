package application;

import java.util.Scanner;

public class RunApplication {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int a = 0, b = 1;

		System.out.print("Quantidade de termos: ");
		int termos = reader.nextInt();

		for (int i = termos; i > 0; i--) {
			System.out.print(a + " - ");
			int c = a + b;
			a = b;
			b = c;
		}
		
		/*
		 * ------------------------------------------------------------------------------------------------------------------------ *
		 * FOR
		 * ------------------------------------------------------------------------------------------------------------------------ *
		 * int i = termos     -> Quantidade de termos que o usuário quer ver na sequência
		 * i > 0              -> Continua até que não haja mais termos para mostrar (até 'i' chegar em 0)
		 * i--                -> A cada passo, subtraímos 1 do número de termos restantes avançando para o próximo da sequência
		 * ------------------------------------------------------------------------------------------------------------------------ *
		 * a = 0, b = 0       -> Dois primeiros números da sequência do Fibonacci
		 * println(a + " - ") -> Mostra o primeiro número da sequência na tela
		 * int c = a + b      -> Calcula o próximo número, somando os dois anteriores
		 * a = b              -> Mover o valor de 'b' para 'a' para gerarmos o próximo cálculo
		 * b = c              -> O novo valor calculado vai para 'b', para que seja usado no próximo cálculo
		 * ------------------------------------------------------------------------------------------------------------------------ *
		*/

		System.out.println("Fim!");

		reader.close();
	}
}
