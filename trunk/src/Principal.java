import java.util.Scanner;

public class Principal 
{
	public static Scanner leitor = new Scanner(System.in);
	private static int escolha;
	
	public static void main(String[] args)
	{		
		Portifolio p = new Portifolio();
		Fiador fi = new Fiador();
		Equipe e = new Equipe();
		int id;
		
		do
		{			
			
			System.out.println("* IMOBILIÁRIA PAGOU MOROU *\n\n");
			System.out.println("1) Contratos");
			System.out.println("2) Fiador");
			System.out.println("3) Funcionários");
			System.out.println("4) Imóveis");
			System.out.println("5) Inquilino");
			System.out.println("6) Proprietário");
			System.out.println("7) Obter Resultados Mês");
			System.out.println("8) Sair");
			escolha = leitor.nextInt();		
			
			switch(escolha)
			{
				case 1:
				{		
					try{
					System.out.println("1) Novo Contrato");
					System.out.println("2) Listar Contratos");
					System.out.println("3) Listar Contratos Assinados no Mes");
					System.out.println("4) Detalhar Contrato");
					System.out.println("5) Alterar Contrato");
					System.out.println("6) Excluir Contrato");
					
					id = leitor.nextInt();
					
					switch (id) {
					case 1: // Novo Contrato
						System.out.println("Home > Contratos > Novo Contrato");
						System.out.println("Digite o Id do Corretor");
						p.NovoContrato(e.getFuncionario(leitor.nextInt()));
						break;
					case 2: // Listar Contratos
						System.out.println("Home > Contratos > Listar Contratos");
						p.ListarContratos();
						break;
					case 3: // Listar Contratos Assinados no Mes
						System.out.println("Home > Contratos > Listar Contratos Assinados no Mes");
						p.ListarContratosAssinadosMes();
						break;
					case 4: // Detalhar Contrato
						System.out.println("Home > Contratos > Detalhar Contrato");
						System.out.println("Digite o Id do Contrato que deseja detalhar");
						p.DetalharContrato(leitor.nextInt());
						break;
					case 5: //Alterar Contrato
						System.out.println("Home > Contratos > Alterar Contrato");
						System.out.println("Digite o Id do Contrato que deseja alterar");
						p.AlterarContrato(leitor.nextInt());
						break;
					case 6: // Excluir Contrato
						System.out.println("Home > Contratos > Excluir Contrato");
						System.out.println("Digite o Id do Contrato que deseja excluir");
						p.ExcluirContrato(leitor.nextInt());
						break;
					}
					
					}catch(Exception ex){
						System.out.println(ex.getMessage());
					}
						
													
						} // segundo switch
				break;
			
					
				case 2: //Fiador
				{		System.out.println("Home > Fiador > Cadastrar Fiador\n\n");
						fi.CadastrarFiador();
						break;
				}
				
				case 3: //Funcionários
				{		System.out.println("Home > Funcionários\n\n");		
						System.out.println("1) Novo Funcionario");
						System.out.println("2) Alterar Funcionario");
						System.out.println("3) Excluir Funcionario");
						System.out.println("4) Listar Funcionario");
						System.out.println("5) Detalhar Funcionario");
						System.out.println("6) Recalcular Salarios");
						escolha = leitor.nextInt();
						
						switch(escolha)
						{
							case 1: //Novo funcionário
									try
									{
										System.out.println("Home > Funcionários > Novo Funcionário\n\n");	
										e.contratarFuncionario();
									}
									catch(Exception ex)
									{
										System.out.println(ex.getMessage());
									}								
									break;
									
							case 2:	//Alterar Funcionário	
									try 
									{
										System.out.println("Home > Funcionários > Alterar Funcionário\n\n");
										System.out.println("Digite o ID do funcionário que deseja alterar: ");	
										e.alterarDadosFuncionario(leitor.nextInt());
									} 
									catch (Exception ex)
									{
										System.out.println(ex.getMessage());	
									}
									break;
									
							case 3: // Excluir Funcionário
									try 
									{
										System.out.println("Home > Funcionários > Excluir Funcionário\n\n");
										e.despedirFuncionario();
									} 
									catch (Exception ex) 
									{
										System.out.println(ex.getMessage());
									}
									break;
									
							case 4://Listar Funcionários
									System.out.println("Home > Funcionários > Listar Funcionário\n\n");
									try
									{
										e.listarFuncionarios();
									} 
									catch (Exception ex) 
									{
										System.out.println(ex.getMessage());
									}
									break;
									
							case 5: //Detalhar Funcionários
									System.out.println("Home > Funcionários > Detalhar Funcionário\n\n");
									try
									{
										System.out.println("Digite o ID do funcionário que deseja detalhar: ");	
										e.detalharFuncionarios(leitor.nextInt());
									}
									catch (Exception ex)
									{
										System.out.println(ex.getMessage());
									}
									break;	
							case 6: //Detalhar Funcionários
								System.out.println("Home > Funcionários > Recalcular Salariosn\n");
								try
								{
									e.CalcularSalarios(p);
									System.out.println("Salarios Recalculados");
									
								}
								catch (Exception ex)
								{
									System.out.println(ex.getMessage());
								}
								break;	
						} //terceiro switch
					break;
				}
				case 4: //Imóveis			
				{	
						System.out.println("Home > Imóveis\n\n");		
						System.out.println("1) Novo Imóvel");
						System.out.println("2) Alterar Imóvel");
						System.out.println("3) Excluir Imóvel");
						System.out.println("4) Listar Imóvel (todos)");
						System.out.println("5) Listar Imóveis Alugados");
						System.out.println("6) Listar Imóveis Disponíveis");
						System.out.println("7) Detalhar Imóvel");
						escolha = leitor.nextInt();
						
						try 
						{
							switch(escolha)
							{
								
								case 1: //Novo Imóvel
										System.out.println("Home > Imóvel > Novo Imóvel\n\n");
										p.CadastrarImovel();									
										break;
										
								case 2: //Alterar Imóvel
										System.out.println("Home > Imóvel > Alterar Imóvel\n\n");
										System.out.println("Digite o ID do imóvel que deseja detalhar: ");	
										p.AlterarDadosImovel(leitor.nextInt());
										break;
										
								case 3: //Excluir Imóvel
										System.out.println("Home > Imóvel > Excluir Imóvel\n\n");									
										p.ExcluirImovel();	
										break;
										
								case 4: //Listar todos os Imóveis
										System.out.println("Home > Imóvel > Listar todos os Imóveis\n\n");	
										p.ListarImovel();
										break;
										
								case 5: //Listar todos os Imóveis
										System.out.println("Home > Imóvel > Listar todos os Imóveis alugados\n\n");	
										p.ListarAlugados();
										break;
									
								case 6: //Listar todos os Imóveis
										System.out.println("Home > Imóvel > Listar todos os Imóveis disponíveis\n\n");	
										p.ListarDisponiveis();
										break;
										
								case 7: //Detalhar Imóvel
										System.out.println("Home > Imóvel > Detalhar Imóvel\n\n");
										System.out.println("Digite o ID do imóvel que deseja detalhar: ");	
										p.DetalharImovel(leitor.nextInt());
										break;									
							} //quarto switch
							
						} // fim try
						catch (Exception ex) 
						{
							System.out.println(ex.getMessage());
						}
					
					break;
				} // fim case 4
				
				case 5: //Inquilinos
				{
					System.out.println("Home > Inquilinos\n\n");		
					System.out.println("1) Novo Inquilino");
					System.out.println("2) Alterar Inquilino");
					System.out.println("3) Excluir Inquilino");
					System.out.println("4) Listar Inquilino");				
					System.out.println("7) Detalhar Inquilino");
					escolha = leitor.nextInt();
					
					try 
					{
						switch(escolha)
						{
							case 1: //Novo Inquilino
									System.out.println("Home > Inquilino > Novo Inquilino\n\n");
									p.CadastrarInquilino();
									break;
									
							case 2: //Alterar Inquilino
									System.out.println("Home > Inquilino > Alterar Inquilino\n\n");
									System.out.println("Digite o ID do inquilino que deseja alterar: ");	
									p.AlterarDadosInquilino(leitor.nextInt());
									break;
									
							case 3: //Excluir Inquilino
									System.out.println("Home > Inquilino > Excluir Inquilino\n\n");
									p.ExcluirInquilino();
									break;
									
							case 4:	//Listar Inquilino
									System.out.println("Home > Inquilino > Listar Inquilino\n\n");
									p.ListarInquilinos();
									break;
									
							case 5: //Detalhar Inquilino
									System.out.println("Home > Inquilino > Detalhar Inquilino\n\n");
									System.out.println("Digite o ID do inquilino que deseja detalhar: ");	
									p.DetalharInquilino(leitor.nextInt());
									break;
						}
					}
					catch(Exception ex)
					{
						System.out.println(ex.getMessage());
					}
				} // case 5
				
				case 6: //Proprietário
				{
					System.out.println("Home > Proprietários\n\n");		
					System.out.println("1) Novo Proprietário");
					System.out.println("2) Alterar Proprietário");
					System.out.println("3) Excluir Proprietário");
					System.out.println("4) Listar Proprietário");				
					System.out.println("7) Detalhar Proprietário");
					escolha = leitor.nextInt();
					
					try 
					{
						switch(escolha)
						{
							case 1: //Novo Proprietário
									System.out.println("Home > Proprietário > Novo Proprietário\n\n");
									p.CadastrarProprietario();
									break;
									
							case 2: //Alterar Proprietário
									System.out.println("Home > Proprietário > Alterar Proprietário\n\n");
									System.out.println("Digite o ID do proprietário que deseja alterar: ");	
									p.AlterarDadosProprietario(leitor.nextInt());
									break;
									
							case 3: //Excluir Proprietário
									System.out.println("Home > Proprietário > Excluir Proprietário\n\n");
									p.ExcluirProprietario();
									break;
									
							case 4: //Listar Proprietário
									System.out.println("Home > Proprietário > Listar Proprietário\n\n");
									p.ListarProprietarios();
									break;
									
							case 5: //Detalhar Proprietário
									System.out.println("Home > Proprietário > Detalhar Proprietário\n\n");
									System.out.println("Digite o ID do proprietário que deseja detalhar: ");	
									p.DetalharProprietario(leitor.nextInt());
									break;								
						}
					}
					catch(Exception ex)
					{
						System.out.println(ex.getMessage());
					}				
				} // case 6	
				case 7:{
					System.out.println("Home > Obter Resultados Mes\n\n");
					System.out.println("Resultados Mensal: " + p.ObterResultadoMes());
				}
					
					
			}//primeiro switch	
		} while(escolha != 8);
	}//main	
}
