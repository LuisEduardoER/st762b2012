import java.util.Scanner;

public class Equipe 
{
	private int numeroTotalFuncionarios=0;
	private int numeroCorretores=0;
	private int numeroSocios=0;
	private int escolha; 
	private Funcionario f; 
	private SocioProprietario socio;
	
	public static Scanner leitor = new Scanner(System.in);
	
			public Equipe()
			{
				f = new Funcionario();
				Funcionario f[] = new Funcionario[numeroTotalFuncionarios];
			}
			
			public int getTotalFuncionarios()
			{
				return(numeroTotalFuncionarios);
			}
			
			public void setTotalFuncionarios(int qtdfuncionarios)
			{
				numeroTotalFuncionarios = qtdfuncionarios;
			}
			
			public int getNumeroCorretores()
			{
				return(numeroCorretores);
			}
			
			public void setNumeroCorretores(int qtdcorretores)
			{
				numeroCorretores = qtdcorretores;
			}
			
			public int getNumeroSocios()
			{
				return(numeroSocios);
			}
			
			public void setNumeroSocios(int qtdsocios)
			{
				numeroSocios = qtdsocios;
			}
			
			public void contratarFuncionario()
			{
				f.Cadastrar();
				this.numeroTotalFuncionarios++;
			}
			
			public void despedirFuncionario()
			{
				//implementar
			}
			
			public void CalcularSalarios()
			{
				//implementar
			}
			
			public void alterarDadosFuncionario(int idFuncional)
			{
				//implementar
			}
			
			public void listarFuncionarios()
			{
				//implementar
			}
			
			public void detalharFuncionarios(int idFuncional)
			{
				//implementar
			}
			
			public void ObterResultadosDoMes()
			{
				//precisa de portfólio
			}
			
			public void CadastrarEquipe()
			{
				System.out.println("**Funcionarios**");
				System.out.println("1) Cadastrar novo");
				System.out.println("2) Alterar cadastro");
				System.out.println("3) Excluir");
				this.escolha = leitor.nextInt();
				
				switch(escolha)
				{
					case 1: //cadastro de funcionários 
							System.out.println("1)Cadastrar Corretor");
							System.out.println("2)Cadastrar Sócio");
							this.escolha = leitor.nextInt();
							
							switch(escolha)
							{
								case 1: //corretor
										f.Cadastrar();
										this.numeroCorretores++;
										this.numeroTotalFuncionarios++;
										break;
										
								case 2: //sócio									
										f.Cadastrar();
										this.numeroSocios++; 
										this.numeroTotalFuncionarios++;
										System.out.println("Porcentagem da empresa: ");										   		     
										
									    break;										 									
							}	
					case 2: // alterar cadastro
					case 3: // excluir cadastro
				}				
			}
		}
