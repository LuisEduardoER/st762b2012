
public class Inquilino extends Pessoa
{
	private int possuiRestricoes;
	private int restricoes;
	
	public int getpossuiRestricoes()
	{
		return (possuiRestricoes);
	}
	
	public int getrestricoes()
	{
		return (restricoes);
	}
	
	public void setRestricoes (int restricoesInquilino)
	{
		restricoes = restricoesInquilino;
	}
	
	public void setpossuiRestricoes (int possuiRestricoesInquilino)
	{
		possuiRestricoes = possuiRestricoesInquilino;
	}
}
