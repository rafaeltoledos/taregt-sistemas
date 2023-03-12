
public class Main {

	public static void main(String[] args) {
		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double Outros = 19849.53;
		
		double soma = SP + RJ + MG + ES + Outros;
		String vsp = String.format("%.2f", SP / soma * 100) ;
		String vrj = String.format("%.2f", RJ / soma * 100) ;
		String vmg = String.format("%.2f", MG / soma * 100) ;
		String ves = String.format("%.2f", ES / soma * 100) ;
		String voutros = String.format("%.2f", Outros / soma * 100) ;
		
		System.out.println("O percentual de faturamento mensal para o estado de São Paulo é " + vsp + "%");
		System.out.println("O percentual de faturamento mensal para o estado do Rio de Janeiro é " + vrj + "%");
		System.out.println("O percentual de faturamento mensal para o estado de Minas Gerais é " + vmg + "%");
		System.out.println("O percentual de faturamento mensal para o estado do Espírito Santo é " + ves + "%");
		System.out.println("O percentual de faturamento mensal para os demais estados é " + voutros + "%");

	}

}
