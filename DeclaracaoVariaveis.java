public class DeclaracaoVariaveis {
	
	public static void main (String[] args) {
		String nome = "Joserverson";
		String dataDeNascimento = "16/09/1947", rg, sexo;
		rg = "12.345.668-9";
		sexo = "M";
		double salario = 12.123;
		
		System.out.printf ("O senhor(a) " + nome + 
		"portador do RG " + rg+ 
		", nascisdo em "+ dataDeNascimento + 
		", do sexo " + sexo + 
		", esta registrado com o salario de R$" + salario + "\n" + "\n"   );
		
		System.out.print ("O senhor(a) " + nome);
		System.out.print ("portador do RG " + rg);
		System.out.print ("nascisdo em "+ dataDeNascimento);
		System.out.print ("do sexo " + sexo);
		System.out.printf ("esta registrado com o salario de R$" + salario );
		System.out.print (".");
	}
}

