import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fiador extends Pessoa
{	
	List<Fiador> ListFiador = new ArrayList<Fiador>();
	
	private int rendaComprovada;
	private static int pIdFiador;

	public static Scanner leitor = new Scanner(System.in);
	
	public int getrendaComprovada() {
		return(rendaComprovada);
	}
	
	public void setrendaComprovada(int rendaComprovadaFiador) {
		rendaComprovada = rendaComprovadaFiador;
	}
	
	public static int getpIdFiador() {
		return pIdFiador;
	}

	public static void setpIdFiador(int pIdFiador) {
		Fiador.pIdFiador = pIdFiador;
	}
	
	public void CadastrarFiador() {
		
		Fiador F = new Fiador();
		
		F.setpIdFiador(pIdFiador);
		System.out.println("Nome: ");
		F.nome = leitor.nextLine();
		System.out.println("CPF: ");
		F.CPF = leitor.nextLine();
		System.out.println("RG: ");
		F.RG = leitor.nextLine();
		System.out.println("Renda: ");
		F.setrendaComprovada(leitor.nextInt());
		
		ListFiador.add(F);
		setpIdFiador(getpIdFiador() + 1);
	}
}
