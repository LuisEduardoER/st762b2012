import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.*;

public class Equipe 
{
	private int numeroTotalFuncionarios;
	private int numeroCorretores=0;
	private int numeroSocios=0;
	private int escolha;		
		
//	List<Funcionario> listsocio = new ArrayList<Funcionario>(); // lista de funcionários
	List<SocioProprietario> listsocio = new ArrayList<SocioProprietario>(); //lista para porcentagem empresa
	
	//Para entrada teclado
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	SocioProprietario funcionario = new SocioProprietario();
	
	public static Scanner leitor = new Scanner(System.in);
	
			public Equipe()
			{				
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
			
			public void contratarFuncionario() //Cadastro de funcionários
			{	
					try 
					{	
					//	Funcionario f = new Funcionario();
						SocioProprietario f = new SocioProprietario();								
				
						System.out.println("Nome: ");
						f.SetPessoa(reader.readLine());	
						System.out.println("CPF: ");
						f.SetCPF(Integer.parseInt(reader.readLine()));
						System.out.println("RG: ");
						f.SetRG(reader.readLine());		
						System.out.println("ID do funcionário: ");
						f.setIDFuncional(Integer.parseInt(reader.readLine()));
						System.out.println("Cargo: ");
						f.setCargo(reader.readLine());				
						System.out.println("Salario: ");
						f.setSalario(Integer.parseInt(reader.readLine()));							
											
						if(f.getCargo().equalsIgnoreCase("socio"))
						{
							setNumeroSocios(numeroSocios+1);
							System.out.println("Porcentagem da empresa: ");											
							f.setPorcentagemEmpresa(Integer.parseInt(reader.readLine()));								
						}						
						else
						{
							setNumeroCorretores(numeroCorretores+1);								
						}	
						
						listsocio.add(f); // adiciona funcionário na lista	
					}
					catch (IOException e) 
					{
						System.out.println(e.toString());
					}						 
			}		
			
			public void despedirFuncionario()
			{			
				SocioProprietario excluir = new SocioProprietario(); // para exclusão do funcionário - remove() fora da iteração.
				setTotalFuncionarios(numeroTotalFuncionarios-1);					
				
				if(listsocio.size() == 0)
				{
					System.out.println("Não há mais funcionários para excluir!");
				}
				else
				{	
					System.out.println("Digite o identificador (ID) do funcionário que deseja excluir: ");					
					funcionario.setIDFuncional(leitor.nextInt());
					
					for (SocioProprietario fa : listsocio) 
					{
						if(fa.getIDFuncional() == funcionario.getIDFuncional())
						{
							excluir = fa;							
							System.out.println("Funcionário excluído!");						
						}
					}
					listsocio.remove(excluir);
				}			
			}				
			
			public void alterarDadosFuncionario(int idFuncional)
			{
				for (SocioProprietario fa : listsocio) 
				{
					if(fa.getIDFuncional() == funcionario.getIDFuncional())
					{
						System.out.println("Dados para conferência do funcionário de ID: " + idFuncional);
						detalharFuncionarios(fa.getIDFuncional());
						System.out.println("Campo que deseja alterar:");
						System.out.println("1) Nome");
						System.out.println("2) CPF");
						System.out.println("3) RG");
						System.out.println("4) Cargo");
						System.out.println("5) Salario");
						System.out.println("6) Sair");						
						
						try 
						{
							escolha = leitor.nextInt();
							
							switch(escolha)
							{
								case 1: //Alterar Nome
										System.out.println("Digite o novo nome: ");
										fa.SetPessoa(reader.readLine());
										break;
										
								case 2: //Alterar CPF
										System.out.println("Digite o novo CPF: ");
										fa.SetCPF(Integer.parseInt(reader.readLine()));
										break;
										
								case 3: //Alterar RG									
										System.out.println("Digite o novo RG: ");
										fa.SetRG(reader.readLine());
										break;
										
								case 4: //Alterar Cargo
										System.out.println("Digite o novo cargo: ");
										fa.setCargo(reader.readLine());
										break;
										
								case 5: //Alterar Salário
										System.out.println("Digite o novo salário: ");
										fa.setSalario(Integer.parseInt(reader.readLine()));
										break;
								
								case 6:
										CadastrarEquipe();
										break;
								
								default:
										System.out.println("Opção inexistente!");
										break;
							}					
						} 
						catch (IOException e) 
						{
							System.out.println(e.toString());
						}							
					}
				}				
			}
			
			public void listarFuncionarios() //Mostra todos os funcionários
			{
				if(listsocio.size() == 0)
				{
					System.out.println("Não há funcionários cadastrados!");
				}
				else
				{
					for (SocioProprietario fa : listsocio) //percorre a lista de funcionários e os lista
					{ 					
						System.out.println(fa.getPessoa());			
					}
				}				
			}
			
			public void detalharFuncionarios(int idFuncional) //Informações detalhadas sobre cada um
			{				
				for (SocioProprietario fa : listsocio) //percorre a lista de funcionários para procura do ID
				{ 	
					if(fa.getIDFuncional() == idFuncional)
					{
						System.out.println("ID funcionário: "+fa.getIDFuncional());
						System.out.println("Nome:"+fa.getPessoa());
						System.out.println("CPF:"+fa.getCPF());
						System.out.println("RG:"+fa.getRG());
						System.out.println("Cargo:"+fa.getCargo());
						System.out.println("Salario:"+fa.getSalario());		
						
						if(fa.getCargo().equals("socio"))
						{
							System.out.println("Porcentagem da empresa:"+fa.getPorcentagemEmpresa());
						}						
					}
				}
			}
			
			public void CalcularSalarios()
			{
				//implementar
			}
			
			public void ObterResultadosDoMes()
			{
				//precisa de portfólio
			}
			
			public void CadastrarEquipe()
			{				
				System.out.println("1) Cadastrar Funcionário");
				System.out.println("2) Alterar Dados do Funcionário");
				System.out.println("3) Excluir Funcionário");
				System.out.println("4) Listar Funcionários");
				System.out.println("5) Detalhar Funcionários");				
				
				escolha = leitor.nextInt();
				
				switch(escolha)
				{
					case 1: //Contratar Funcionário (Cadastro)
							setTotalFuncionarios(numeroTotalFuncionarios+1);									
							contratarFuncionario();										
							break;										
								
					case 2: //Alterar cadastro
							System.out.println("Digite o identificador (ID) do funcionário que deseja alterar: ");
							funcionario.setIDFuncional(leitor.nextInt());	
							alterarDadosFuncionario(funcionario.getIDFuncional());
							break;
					
					case 3: //Despedir Funcionário (Excluir Cadastro)
							despedirFuncionario();							
							break;
						
					case 4: //Listar Funcionários
							listarFuncionarios();
							break;
							
					case 5: //Detalhar Funcionários
							System.out.println("Digite o identificador (ID) do funcionário: ");
							funcionario.setIDFuncional(leitor.nextInt());
							detalharFuncionarios(funcionario.getIDFuncional());
							break;
							
					default:
							System.out.println("Opção inexistente!");
							break;
				}				
			}
		}
