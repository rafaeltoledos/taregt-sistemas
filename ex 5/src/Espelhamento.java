import java.util.Scanner;

public class Espelhamento {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a palavra que será espelhada:");
		String x = sc.next();
		String espelhamento = "";
		
		for(int i = x.length() - 1; i >=0; i--) {
			espelhamento = espelhamento + Character.toString(x.charAt(i));
		}
		System.out.println(espelhamento);
		sc.close();
	}
	
	}
