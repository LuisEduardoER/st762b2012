
public class Proprietario extends Pessoa
{	
	private int numeroConta;
	private int agencia;
	private String banco;
	
	public int getnumeroConta()
	{
		return(numeroConta);
	}
	
	public void setnumeroConta(int nConta)
	{
		numeroConta = nConta;
	}
	
	public int getAgencia()
	{
		return(agencia);
	}
	
	public void setAgencia(int agenciaProprietario)
	{
		agencia = agenciaProprietario;
	}
	
	public String getBanco()
	{
		return(banco);
	}
	
	public void setBanco(String bancoProprietario)
	{
		banco = bancoProprietario;
	}

}
