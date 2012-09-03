import java.util.*;

public class Inquilino extends Pessoa
{
	List<Inquilino> ListInquilino = new ArrayList<Inquilino>();
	
	private int possuiRestricoes;
	private String restricoes;
	private static int pIdInquilino;
	
	public static Scanner leitor = new Scanner(System.in);
	
	public int getpossuiRestricoes() {
		return (possuiRestricoes);
	}
	
	public String getrestricoes() {
		return (restricoes);
	}
	
	public void setRestricoes (String restricoesInquilino) {
		restricoes = restricoesInquilino;
	}
	
	public void setpossuiRestricoes (int possuiRestricoesInquilino) {
		possuiRestricoes = possuiRestricoesInquilino;
	}
	
	public static int getpIdInquilino() {
		return pIdInquilino;
	}

	public static void setpIdInquilino(int pIdInquilino) {
		Inquilino.pIdInquilino = pIdInquilino;
	}
	
	public void CadastrarInquilino() {
			
			Inquilino Inq = new Inquilino();
			
			Inq.setpIdInquilino(pIdInquilino);
			System.out.println("Nome: ");
			Inq.nome = leitor.nextLine();
			System.out.println("CPF: ");
			Inq.CPF = leitor.nextLine();
			System.out.println("RG: ");
			Inq.RG = leitor.nextLine();
			System.out.println("Possui restrições? 1-Sim / 2-Não");
			Inq.setpossuiRestricoes(leitor.nextInt());
			if (Inq.getpossuiRestricoes() == 1)
			{
				System.out.println("Restrições: ");
				Inq.restricoes = leitor.nextLine();
			}
				
			leitor.nextLine();
				
			ListInquilino.add(Inq);
			setpIdInquilino(getpIdInquilino() + 1);
	}
}
