import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proprietario extends Pessoa
{	
	List<Proprietario> ListProprietario = new ArrayList<Proprietario>();
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	private static int pIdProprietario;
	private int numeroConta;
	private int agencia;
	private String banco;
	
	public static Scanner leitor = new Scanner(System.in);
	
	public int getnumeroConta() {
		return(numeroConta);
	}
	
	public void setnumeroConta(int nConta) {
		numeroConta = nConta;
	}
	
	public int getAgencia() {
		return(agencia);
	}
	
	public void setAgencia(int agenciaProprietario) {
		agencia = agenciaProprietario;
	}
	
	public String getBanco() {
		return(banco);
	}
	
	public void setBanco(String bancoProprietario) {
		banco = bancoProprietario;
	}
	
	public static int getpIdProprietario() {
		return pIdProprietario;
	}

	public static void setpIdProprietario(int pIdProprietario) {
		Proprietario.pIdProprietario = pIdProprietario;
	}
	
	public void CadastrarProprietario() throws IOException {
		
		Proprietario Prop = new Proprietario();
		
		Prop.setpIdProprietario(pIdProprietario);
		System.out.println("Nome: ");
		Prop.nome = reader.readLine();
		System.out.println("CPF: ");
		Prop.CPF = reader.readLine();
		System.out.println("RG: ");
		Prop.RG = reader.readLine();
		System.out.println("Conta: ");
		Prop.setnumeroConta(Integer.parseInt(reader.readLine()));
		System.out.println("Agencia: ");
		Prop.setAgencia(Integer.parseInt(reader.readLine()));
		System.out.println("Banco: ");
		Prop.setBanco(reader.readLine());

		leitor.nextLine();
		
		ListProprietario.add(Prop);
		setpIdProprietario(getpIdProprietario() + 1);
		
		for (Proprietario bb : ListProprietario) {
			System.out.println(bb.nome);
			System.out.println(bb.RG);
			System.out.println(bb.CPF);
			System.out.println(bb.numeroConta);
			System.out.println(bb.agencia);
			System.out.println(bb.banco);
		}
	
	}
	
}
