import java.util.Scanner;

public class Pessoa 
{
	protected String nome;
	protected String CPF;
	protected String RG;
	
	public static Scanner leitor = new Scanner(System.in);
	
	public String getPessoa() {
		return(nome);
	}
	
	public void SetPessoa(String pessoa) {
		nome = pessoa;
	}
	
	public String getCPF() {
		return(CPF);
	}
	
	public String getRG() {
		return(RG);
	}
}
