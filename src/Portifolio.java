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
	
	public void ListarProprietarios() {
		
		if(ListProprietario.size() == 0) {
			System.out.println("Não há proprietarios cadastrados");
		}
		else {
			for (Proprietario prop : ListProprietario) {
					System.out.println("Proprietario : " + prop.getPessoa());
			}
		}
	}
	
	public void ListarInquilinos() {
		
		if(ListInquilino.size() == 0) {
			System.out.println("Não há inquilinos cadastrados");
		}
		else {
			for (Inquilino inq : ListInquilino) {
					System.out.println("Inquilino : " + inq.getPessoa());
			}
		}
	}
	
	public void DetalharImovel(int idimovel) {
	
			for (Imovel i : ListImovel) {
				if (i.getIdImovel() == idimovel) {
					System.out.println("IMOVEL");
					System.out.println("ID imovel: " + i.getIdImovel());
					System.out.println("Tipo do imovel: " + i.getTipo());
					System.out.println("Area util: " + i.getAreaUtil());
					System.out.println("Numero de comodos: " + i.getNumeroComodos());
					System.out.println("Numero de banheiros: " + i.getNumeroBanheiros());
					System.out.println("Numero de quartos: " + i.getNumeroQuartos());
					System.out.println("Numero de vagas de garagem: " + i.getNumeroVagasGaragem());
					System.out.println("Possui area externa?: " + i.getPossuiuAreaExterna());
					System.out.println("Endereco:");
					System.out.println("Rua: " + i.getEndereco().getRua());
					System.out.println("Numero: " + i.getEndereco().getNumero());
					System.out.println("Complemento: " + i.getEndereco().getComplemento());
					System.out.println("Bairro: " + i.getEndereco().getBairro());
					System.out.println("CEP: " + i.getEndereco().getCep());
					System.out.println("Cidade: " + i.getEndereco().getCidade());
					System.out.println("Estado: " + i.getEndereco().getEstado());
				}
			}
	}

	public void DetalharInquilino(int idinquilino) {
		
		for (Inquilino inq : ListInquilino) {
			if (inq.getpIdInquilino() == idinquilino) {
				System.out.println("INQUILINO");
				System.out.println("ID inquilino: " + inq.getpIdInquilino());
				System.out.println("Nome: " + inq.getPessoa());
				System.out.println("RG: " + inq.getRG());
				System.out.println("CPF: " + inq.getCPF());
				System.out.println("Possui restrições?: " + inq.getpossuiRestricoes());
				System.out.println("Restrições: " + inq.getrestricoes());	
			}
		}
}
	
	public void DetalharProprietario(int idproprietario) {
		
		for (Proprietario prop : ListProprietario) {
			if (prop.getpIdProprietario() == idproprietario) {
				System.out.println("PROPRIETARIO");
				System.out.println("ID proprietario: " + prop.getpIdProprietario());
				System.out.println("Nome: " + prop.getPessoa());
				System.out.println("RG: " + prop.getRG());
				System.out.println("CPF: " + prop.getCPF());
				System.out.println("Banco: " + prop.getBanco());
				System.out.println("Agencia: " + prop.getAgencia());
				System.out.println("Conta: " + prop.getnumeroConta());
				
			}
		}

    }
	
	public void ExcluirImovel() {
		
		int idfunc;
		Imovel exclusao = new Imovel();
		
		if (ListImovel.size() == 0) {
			System.out.println("Não há imoveis cadastrados");
		}
		else {
			System.out.println("Digite ID do imovel a ser excluido: ");
			idfunc = Integer.parseInt(reader.readLine());
			
			for (Imovel im : ListImovel) {
				if(im.getIdImovel() == idfunc) {
					exclusao = im;
				}
			}
			
			ListImovel.remove(exclusao);
		}		
	}
	
	public void ExcluirInquilino() {
		
		int idinq;
		Inquilino exclusao = new Inquilino();
		
		if (ListInquilino.size() == 0) {
			System.out.println("Não há inquilino cadastrados");
		}
		else {
			System.out.println("Digite ID do inquilino a ser excluido: ");
			idinq = Integer.parseInt(reader.readLine());
			
			for (Inquilino inq : ListInquilino) {
				if(inq.getpIdInquilino() == idinq) {
					exclusao = inq;
				}
			}
			
			ListInquilino.remove(exclusao);
		}		
	}

	public void ExcluirProprietario() {
		
		int idprop;
		Proprietario exclusao = new Proprietario();
		
		if (ListProprietario.size() == 0) {
			System.out.println("Não há proprietarios cadastrados");
		}
		else {
			System.out.println("Digite ID do proprietario a ser excluido: ");
			idprop = Integer.parseInt(reader.readLine());
			
			for (Proprietario prop : ListProprietario) {
				if(prop.getpIdProprietario() == idprop) {
					exclusao = prop;
				}
			}
			
			ListProprietario.remove(exclusao);
		}		
	}
	
	public void AlterarDadosImovel(int idimovel) {
		
		int alteracao;
		
		for(Imovel im: ListImovel) {
			
			if(im.getIdImovel() == idimovel) {
			
				System.out.println("Funcionario - ID " + idimovel);
				DetalharImovel(im.getIdImovel());
				System.out.println("Campos para alteração: ");
				System.out.println("1) Tipo do imovel");
				System.out.println("2) Area util");
				System.out.println("3) Numero de comodos");
				System.out.println("4) Numero de banheiros");
				System.out.println("5) Numero de quartos");
				System.out.println("6) Numero de vagas de garagem");
				System.out.println("7) Possui area externa?");
				System.out.println("8) Rua");
				System.out.println("9) Numero");
				System.out.println("10) Complemento");
				System.out.println("11) Bairro");
				System.out.println("12) CEP");
				System.out.println("13) Cidade");
				System.out.println("14) Estado");
				
				alteracao = Integer.parseInt(reader.readLine());
				
				switch(alteracao)
				{
					case 1:
						System.out.println("Novo tipo: ");
						im.setTipo(Integer.parseInt(reader.readLine()));
					
					case 2:
						System.out.println("Nova area util: ");
						im.setAreaUtil(Integer.parseInt(reader.readLine()));
						
					case 3:
						System.out.println("Novo numero de comodos: ");
						im.setNumeroComodos(Integer.parseInt(reader.readLine()));
						
					case 4:
						System.out.println("Novo numero de banheiros: ");
						im.setNumeroBanheiros(Integer.parseInt(reader.readLine()));
					
					case 5:
						System.out.println("Novo numero de quartos: ");
						im.setNumeroQuartos(Integer.parseInt(reader.readLine()));
						
					case 6:
						System.out.println("Novo numero vagas de garagem: ");
						im.setNumeroVagasGaragem(Integer.parseInt(reader.readLine()));
						
					case 7:
						System.out.println("Possui area externa? ");
						im.setPossuiuAreaExterna(Integer.parseInt(reader.readLine()));
					
					case 8:
						System.out.println("Nova rua: ");
						im.getEndereco().setRua(reader.readLine());
						
					case 9:
						System.out.println("Novo numero: ");
						im.getEndereco().setNumero(reader.readLine());
						
					case 10:
						System.out.println("Novo complemento: ");
						im.getEndereco().setComplemento(reader.readLine());
					
					case 11:
						System.out.println("Novo bairro: ");
						im.getEndereco().setBairro(reader.readLine());
						
					case 12:
						System.out.println("Novo CEP: ");
						im.getEndereco().setCep(reader.readLine());
						
					case 13:
						System.out.println("Novo cidade: ");
						im.getEndereco().setCidade(reader.readLine());
						
					case 14:
						System.out.println("Novo estado: ");
						im.getEndereco().setEstado(reader.readLine());
				}
			}
		}
	}
	
	public void AlterarDadosInquilino(int idinquilino) {
		
		int alteracao;
		
		for(Inquilino inq: ListInquilino) {
			
			if(inq.getpIdInquilino() == idinquilino) {
			
				System.out.println("Inquilino - ID " + idinquilino);
				DetalharInquilino(inq.getpIdInquilino());
				System.out.println("Campos para alteração: ");
				System.out.println("1) Nome");
				System.out.println("2) RG");
				System.out.println("3) CPF");
				System.out.println("4) Possui restrições?");
				System.out.println("5) Restrições");
				
				alteracao = Integer.parseInt(reader.readLine());
				
				switch(alteracao)
				{
					case 1:
						System.out.println("Novo nome: ");
						inq.SetPessoa(reader.readLine());
					
					case 2:
						System.out.println("Novo RG: ");
						inq.SetRG(reader.readLine());
						
					case 3:
						System.out.println("Novo CPF: ");
						inq.SetCPF(reader.readLine());
						
					case 4:
						System.out.println("Possui restrições?");
						inq.setpossuiRestricoes(Integer.parseInt(reader.readLine()));
					
					case 5:
						System.out.println("Novas restrições: ");
						inq.setRestricoes(reader.readLine());
				}
			}
		}
	}
	
public void AlterarDadosProprietario(int idproprietario) {
		
		int alteracao;
		
		for(Proprietario prop: ListProprietario) {
			
			if(prop.getAgencia() == idproprietario) {
			
				System.out.println("Proprietario - ID " + idproprietario);
				DetalharProprietario(prop.getpIdProprietario());
				System.out.println("Campos para alteração: ");
				System.out.println("1) Nome");
				System.out.println("2) RG");
				System.out.println("3) CPF");
				System.out.println("4) Banco");
				System.out.println("5) Agencia");
				System.out.println("6) Conta");
				
				alteracao = Integer.parseInt(reader.readLine());
				
				switch(alteracao)
				{
					case 1:
						System.out.println("Novo nome: ");
						prop.SetPessoa(reader.readLine());
					
					case 2:
						System.out.println("Novo RG: ");
						prop.SetRG(reader.readLine());
						
					case 3:
						System.out.println("Novo CPF: ");
						prop.SetCPF(reader.readLine());
						
					case 4:
						System.out.println("Novo banco: ");
						prop.setBanco(reader.readLine());
					
					case 5:
						System.out.println("Nova agencia: ");
						prop.setAgencia(reader.readLine());
					
					case 6:
						System.out.println("Nova conta: ");
						prop.setnumeroConta(reader.readLine());
				}
			}
		}
	}


}