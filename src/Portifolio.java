import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

import org.w3c.dom.ls.LSInput;

public class Portifolio 
{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	List<Imovel> ListImovel = new ArrayList<Imovel>();
	List<Inquilino> ListInquilino = new ArrayList<Inquilino>();
	List<Proprietario> ListProprietario = new ArrayList<Proprietario>();
	List<Fiador> ListFiador = new ArrayList<Fiador>();
	List<Contrato> ListContrato = new ArrayList<Contrato>();
	
	private int totalDeContratos;
	private int totalContratosAssinados;
	private int totalImoveisVagos;
	private static TrataErro erro = new TrataErro();
	
	Portifolio (){
		totalDeContratos = 0;
		totalContratosAssinados = 0;
		totalImoveisVagos = 0;
	}
	
	public int getTotalDeContratos (){
		return totalDeContratos;
	}
	
	public int getTotalContratosAssinados (){
		return totalContratosAssinados;
	}
	
	public int getTotalImoveisVagos(){
		return totalImoveisVagos;
	}
	
	
	
	public void NovoContrato(Funcionario corretor)throws Exception{
	    int idProprietario;
	    Contrato contrato;
		if (!corretor.getCargo().equalsIgnoreCase("Corretor")){
	    	erro.mostraErro("Funcionario não é um corretor");
	    }
	    System.out.println("Id do Proprietario: ");
	    idProprietario = Integer.parseInt(reader.readLine());
	    for (Proprietario pr : ListProprietario){
	    	if (pr.getpIdProprietario() == idProprietario){
	    		if (pr.getImovel() == null){
	    			erro.mostraErro("Proprietario sem Imovel Cadastrado");
	    		}
	    		contrato = new Contrato((Corretor) corretor,pr);
	    		System.out.println("Digite o Valor do contrato");
	    		contrato.setValorContrato(Integer.parseInt(reader.readLine()));
	    		ListContrato.add(contrato);
	    		
	    		totalDeContratos++;
	    	}
	    }
	    
	}
	
	public void AlterarContrato(int idContrato) throws Exception{
		if (ListContrato.size() != 0){
			for (Contrato c: ListContrato){
				if (c.getIdContrato() == idContrato){
		    		System.out.println("Digite o Valor do contrato");
		    		c.setValorContrato(Integer.parseInt(reader.readLine()));
				}
			}
		}
	}
	
	public void ListarContratos(){
		if (ListContrato.size() == 0) {
			System.out.println("Não Existem Contratos");
		}else{
			for (Contrato c: ListContrato){
				System.out.println("ID: " + c.getIdContrato() + "/t Imovel " + c.getProprietario().getImovel().getIdImovel() + "/t Corretor" + c.getCorretor().getPessoa());
			}
		}
	}
	
	public void DetalharContrato(int idContrato){
		if (ListContrato.size() != 0){
			for (Contrato c: ListContrato){
				if (c.getIdContrato() == idContrato){
					System.out.println("ID: " + c.getIdContrato());
					System.out.println("Imovel: " + c.getProprietario().getImovel().getIdImovel());
					System.out.println("Proprietario: " + c.getProprietario().getPessoa());
					System.out.println("Corretor: " + c.getCorretor().getPessoa());
					System.out.println("Valor: " + c.getValorContrato());
					System.out.println("Data Assinatura: " + c.getDataAssinatura().toString());
				}
			}
		}
	}
	
	public void ExcluirContrato(int idContrato){
		Contrato temp = null;
		if (ListContrato.size() != 0){
			for (Contrato c: ListContrato){
				if (c.getIdContrato() == idContrato){
					temp = c;
				}
			}
		temp.getProprietario().getImovel().setAlugado(false);	
		ListContrato.remove(temp);	
		totalContratosAssinados --;
		totalDeContratos --;
		totalImoveisVagos ++;
		}
		
	}
	
	public void ListarContratosAssinadosMes(){
		Date hoje = new Date();
		
		if (ListContrato.size() == 0) {
			System.out.println("Não Existem Contratos");
		}else{
			for (Contrato c: ListContrato){
				if (c.getDataAssinatura().getMonth() == hoje.getMonth()){
					System.out.println("ID: " + c.getIdContrato() + "/t Imovel " + c.getProprietario().getImovel().getIdImovel() + "/t Corretor" + c.getCorretor().getPessoa());	
				}
			}
		}
	}
	
	public int SomarContratosCorretorMes(int idCorretor){
		int retorno = 0;
		Date hoje = new Date();
		
		if (ListContrato.size() == 0) {
			retorno = 0;
		}else{
			for (Contrato c: ListContrato){
				if ((c.getCorretor().getIDFuncional() == idCorretor)&&(c.getDataAssinatura().getMonth() == hoje.getMonth())){
					retorno = retorno + c.getValorContrato();
				}
			}
		}
		return retorno;
	}
	
	public int ObterResultadoMes(){
		int retorno = 0;
		Date hoje = new Date();
		
		if (ListContrato.size() == 0) {
			retorno = 0;
		}else{
			for (Contrato c: ListContrato){
				if (c.getDataAssinatura().getMonth() == hoje.getMonth()){
					retorno = retorno + c.getValorContrato();
				}
			}
		}
		return retorno;
	}
	
	public int SomarContratos(){
		int retorno = 0;
		
		if (ListContrato.size() == 0) {
			retorno = 0;
		}else{
			for (Contrato c: ListContrato){
					retorno = retorno + c.getValorContrato();
			}
		}
		return retorno;
	}
	
	public void AssinarContrato() throws Exception{
		int idContrato;
		System.out.println("Id do Contrato: ");
	    idContrato = Integer.parseInt(reader.readLine());
	    for (Contrato c: ListContrato){
	    	if (c.getIdContrato() == idContrato){
	    		c.assinarContrato();
	    	}
	    }
	    totalContratosAssinados++;
	    totalImoveisVagos--;
	}
	
	public void CadastrarImovel() throws Exception 
    {
				
    	int idProp;
    	Endereco nEndereco = new Endereco();
    	Imovel imoveis = new Imovel();
    	Proprietario proprietario = null;
				
					//verificar se já existe o proprietario
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
						
						for (Proprietario p : ListProprietario){
							if (p.getpIdProprietario() == idProp){
								proprietario = p;
							}
						}
						
						if (proprietario == null){
							erro.mostraErro("Proprietario Inexistente");
						}
						
						proprietario.setImovel(imoveis);
						
						nEndereco.CadastrarEndereco();
						
						ListImovel.add(imoveis);
					} 								
    		

	public void CadastrarInquilino() throws Exception{
	
			Inquilino Inq = new Inquilino();
            int idImovel;			
			//Inq.setpIdInquilino(ListInquilino);
			System.out.println("Nome: ");
				Inq.SetPessoa(reader.readLine());
				System.out.println("CPF: ");
				Inq.SetCPF(Integer.parseInt(reader.readLine()));
				System.out.println("RG: ");
				Inq.SetRG(reader.readLine());
				System.out.println("Possui restrições? 1-Sim / 2-Não");
				Inq.setpossuiRestricoes(Integer.parseInt(reader.readLine()));
				if (Inq.getpossuiRestricoes() == 1)
				{
					System.out.println("Restrições: ");
					Inq.setRestricoes(reader.readLine());
				}
				
				System.out.println("Id imovel: ");
				idImovel = Integer.parseInt(reader.readLine());
				
				for (Imovel i: ListImovel){
					if (i.getIdImovel() == idImovel){
						i.setInquilino(Inq);
					}
				}
				
				Inq.setpIdInquilino(Inq.getpIdInquilino()+1);
				ListInquilino.add(Inq);
		
			
	}
	
	public void CadastrarProprietario() throws Exception{
		
		Proprietario Prop = new Proprietario();
	
	
//			Prop.setpIdProprietario(pIdProprietario);
			System.out.println("Nome: ");
			Prop.SetPessoa(reader.readLine());
			System.out.println("CPF: ");
			Prop.SetCPF(Integer.parseInt(reader.readLine()));
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

		
	}
	
	public void CadastrarFiador() throws Exception{
		
		Fiador F = new Fiador();
		
		
			//F.setpIdFiador(pIdFiador);
			System.out.println("Nome: ");
			F.SetPessoa(reader.readLine());
			System.out.println("CPF: ");
			F.SetCPF(Integer.parseInt(reader.readLine()));
			System.out.println("RG: ");
			F.SetRG(reader.readLine());
			System.out.println("Renda: ");
			F.setrendaComprovada(Integer.parseInt(reader.readLine()));
			
			ListFiador.add(F);
			//setpIdFiador(getpIdFiador() + 1);

		
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
	
	public void ExcluirImovel() throws Exception{
		
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
	
	public void ExcluirInquilino() throws Exception{
		
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

	public void ExcluirProprietario() throws Exception{
		
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
	
	public void AlterarDadosImovel(int idimovel) throws Exception{
		
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
	
	public void AlterarDadosInquilino(int idinquilino) throws Exception {
		
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
						inq.SetCPF(Integer.parseInt(reader.readLine()));
						
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
	
public void AlterarDadosProprietario(int idproprietario) throws Exception {
		
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
						prop.SetCPF(Integer.parseInt(reader.readLine()));
						
					case 4:
						System.out.println("Novo banco: ");
						prop.setBanco(reader.readLine());
					
					case 5:
						System.out.println("Nova agencia: ");
						prop.setAgencia(Integer.parseInt(reader.readLine()));
					
					case 6:
						System.out.println("Nova conta: ");
						prop.setnumeroConta(Integer.parseInt(reader.readLine()));
				}
			}
		}
	}




}