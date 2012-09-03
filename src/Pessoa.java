
public class Pessoa 
{
	protected String nome;
	protected int CPF;
	protected String RG;
	
	public String getPessoa()
	{
		return(nome);
	}
	
	public void SetPessoa(String pessoa)
	{
		nome = pessoa;
	}
	
	public int getCPF()
	{
		return(CPF);
	}
	
	public void SetCPF(int numeroCPF)
	{
		CPF = numeroCPF;
	}
	
	public String getRG()
	{
		return(RG);
	}
	
	public void SetRG(String numeroRG)
	{
		RG = numeroRG;
	}
}
