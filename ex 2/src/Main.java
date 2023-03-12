import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n0 = 0;
		int n1 = 1;
		int soma = 0;
		System.out.print("Digite o valor de entrada: ");
		int x = sc.nextInt();
		
		System.out.println(n0);
		System.out.println(n1);
		
		for(int i = 1; i<=x; i++) {
			soma = n0 + n1;
			n0 = n1;
			n1 = soma;
			
			if (soma == x) {
				System.out.println(soma + "(O número informado pertence a sequência de Fibonacci.)");
			} else {
				System.out.println(soma);
			}
			} 
		sc.close();	
	}
	}