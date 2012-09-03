import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Portifolio 
{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	List<Imovel> ListImovel = new ArrayList<Imovel>();
	List<Inquilino> ListInquilino = new ArrayList<Inquilino>();
	List<Proprietario> ListProprietario = new ArrayList<Proprietario>();
	List<Fiador> ListFiador = new ArrayList<Fiador>();
	
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
	
	public void CadastrarImovel() throws NumberFormatException, Exception 
    {
				
    	int idProp;
    	Endereco nEndereco = new Endereco();
    	Imovel imoveis = new Imovel();
				
					//verificar se já existe o proprietario
					try {
						System.out.println("Id do Proprietario: ");
						idProp = Integer.parseInt(reader.readLine());
						System.out.println("Tipo do imovel: ");
						imoveis.setTipo(Integer.parseInt(reader.readLine()));
						System.out.println("Area util: ");
						imoveis.setAreaUtil(Integer.parseInt(reader.readLine()));
						System.out.println("Quartos: ");
						imoveis.setNumeroQuartos(Integer.parseInt(reader.readLine()));
						System.out.println("Banheiros: ");
						imoveis.setNumeroBanheiros(Integer.parseInt(reader.readLine()));
						System.out.println("Vagas na garagem: ");
						imoveis.setNumeroVagasGaragem(Integer.parseInt(reader.readLine()));
						System.out.println("Comodos: ");
						imoveis.setNumeroComodos(Integer.parseInt(reader.readLine()));
						System.out.println("Possui area externa 1-Sim / 0-Nao: ");
						imoveis.setPossuiuAreaExterna(Integer.parseInt(reader.readLine()));
						
						nEndereco.CadastrarEndereco();
						
						ListImovel.add(imoveis);
					} 
					catch (IOException e) {
						e.printStackTrace();
					} 								
    		}

	public void CadastrarInquilino() {
	
			Inquilino Inq = new Inquilino();
			
			//Inq.setpIdInquilino(ListInquilino);
			System.out.println("Nome: ");
			try {
				Inq.SetPessoa(reader.readLine());
				System.out.println("CPF: ");
				Inq.SetCPF(reader.readLine());
				System.out.println("RG: ");
				Inq.SetRG(reader.readLine());
				System.out.println("Possui restrições? 1-Sim / 2-Não");
				Inq.setpossuiRestricoes(Integer.parseInt(reader.readLine()));
				if (Inq.getpossuiRestricoes() == 1)
				{
					System.out.println("Restrições: ");
					Inq.setRestricoes(reader.readLine());
				}
				
				Inq.setpIdInquilino(Inq.getpIdInquilino()+1);
				ListInquilino.add(Inq);
		
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public void CadastrarProprietario() {
		
		Proprietario Prop = new Proprietario();
	
		try {
//			Prop.setpIdProprietario(pIdProprietario);
			System.out.println("Nome: ");
			Prop.SetPessoa(reader.readLine());
			System.out.println("CPF: ");
			Prop.SetCPF(reader.readLine());
			System.out.println("RG: ");
			Prop.SetRG(reader.readLine());
			System.out.println("Conta: ");
			Prop.setnumeroConta(Integer.parseInt(reader.readLine()));
			System.out.println("Agencia: ");
			Prop.setAgencia(Integer.parseInt(reader.readLine()));
			System.out.println("Banco: ");
			Prop.setBanco(reader.readLine());
			
			ListProprietario.add(Prop);
		//	setpIdProprietario(getpIdProprietario() + 1);	

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void CadastrarFiador() {
		
		Fiador F = new Fiador();
		
		try {
			//F.setpIdFiador(pIdFiador);
			System.out.println("Nome: ");
			F.SetPessoa(reader.readLine());
			System.out.println("CPF: ");
			F.SetCPF(reader.readLine());
			System.out.println("RG: ");
			F.SetRG(reader.readLine());
			System.out.println("Renda: ");
			F.setrendaComprovada(Integer.parseInt(reader.readLine()));
			
			ListFiador.add(F);
			//setpIdFiador(getpIdFiador() + 1);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void ListarImovel() {
		
		if(ListImovel.size() == 0) {
			System.out.println("Não há imoveis cadastrados");
		}
		else {
			for (Imovel i : ListImovel) {
				System.out.println("Tipo do Imovel : " + i.getTipo());
				
			}
		}
	}
	
	public void ListarAlugados() {
		
		if(ListImovel.size() == 0) {
			System.out.println("Não há imoveis cadastrados");
		}
		else {
			for (Imovel i : ListImovel) {
				if(i.getAlugado() == true)
					System.out.println("Tipo do Imovel : " + i.getTipo());
			}
		}
	}
	
	public void ListarDisponiveis() {
		
		if(ListImovel.size() == 0) {
			System.out.println("Não há imoveis cadastrados");
		}
		else {
			for (Imovel i : ListImovel) {
				if(i.getAlugado() == false)
					System.out.println("Tipo do Imovel : " + i.getTipo());
			}
		}
	}

}