import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Portifolio 
{
	public static Scanner leitor = new Scanner(System.in);
	List<Imovel> ListImovel = new ArrayList<Imovel>();
	List<Contrato> ListContrato = new ArrayList<Contrato>();
	public Imovel im = new Imovel();
	
	private int totalDeContratos;
	private int totalContratosAssinados;
	private int totalImoveisVagos;
	
	public int getTotalDeContratos (){
		return totalDeContratos;
	}
	
	public int getTotalContratosAssinados (){
		return totalContratosAssinados;
	}
	
	public int getTotalImoveisVagos(){
		return totalImoveisVagos;
	}
}
