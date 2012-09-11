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
			
			System.out.println("* IMOBILI�RIA PAGOU MOROU *\n\n");
			System.out.println("1) Contratos");
			System.out.println("2) Fiador");
			System.out.println("3) Funcion�rios");
			System.out.println("4) Im�veis");
			System.out.println("5) Inquilino");
			System.out.println("6) Propriet�rio");
			System.out.println("7) Obter Resultados M�s");
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
				
				case 3: //Funcion�rios
				{		System.out.println("Home > Funcion�rios\n\n");		
						System.out.println("1) Novo Funcionario");
						System.out.println("2) Alterar Funcionario");
						System.out.println("3) Excluir Funcionario");
						System.out.println("4) Listar Funcionario");
						System.out.println("5) Detalhar Funcionario");
						System.out.println("6) Recalcular Salarios");
						escolha = leitor.nextInt();
						
						switch(escolha)
						{
							case 1: //Novo funcion�rio
									try
									{
										System.out.println("Home > Funcion�rios > Novo Funcion�rio\n\n");	
										e.contratarFuncionario();
									}
									catch(Exception ex)
									{
										System.out.println(ex.getMessage());
									}								
									break;
									
							case 2:	//Alterar Funcion�rio	
									try 
									{
										System.out.println("Home > Funcion�rios > Alterar Funcion�rio\n\n");
										System.out.println("Digite o ID do funcion�rio que deseja alterar: ");	
										e.alterarDadosFuncionario(leitor.nextInt());
									} 
									catch (Exception ex)
									{
										System.out.println(ex.getMessage());	
									}
									break;
									
							case 3: // Excluir Funcion�rio
									try 
									{
										System.out.println("Home > Funcion�rios > Excluir Funcion�rio\n\n");
										e.despedirFuncionario();
									} 
									catch (Exception ex) 
									{
										System.out.println(ex.getMessage());
									}
									break;
									
							case 4://Listar Funcion�rios
									System.out.println("Home > Funcion�rios > Listar Funcion�rio\n\n");
									try
									{
										e.listarFuncionarios();
									} 
									catch (Exception ex) 
									{
										System.out.println(ex.getMessage());
									}
									break;
									
							case 5: //Detalhar Funcion�rios
									System.out.println("Home > Funcion�rios > Detalhar Funcion�rio\n\n");
									try
									{
										System.out.println("Digite o ID do funcion�rio que deseja detalhar: ");	
										e.detalharFuncionarios(leitor.nextInt());
									}
									catch (Exception ex)
									{
										System.out.println(ex.getMessage());
									}
									break;	
							case 6: //Detalhar Funcion�rios
								System.out.println("Home > Funcion�rios > Recalcular Salariosn\n");
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
				case 4: //Im�veis			
				{	
						System.out.println("Home > Im�veis\n\n");		
						System.out.println("1) Novo Im�vel");
						System.out.println("2) Alterar Im�vel");
						System.out.println("3) Excluir Im�vel");
						System.out.println("4) Listar Im�vel (todos)");
						System.out.println("5) Listar Im�veis Alugados");
						System.out.println("6) Listar Im�veis Dispon�veis");
						System.out.println("7) Detalhar Im�vel");
						escolha = leitor.nextInt();
						
						try 
						{
							switch(escolha)
							{
								
								case 1: //Novo Im�vel
										System.out.println("Home > Im�vel > Novo Im�vel\n\n");
										p.CadastrarImovel();									
										break;
										
								case 2: //Alterar Im�vel
										System.out.println("Home > Im�vel > Alterar Im�vel\n\n");
										System.out.println("Digite o ID do im�vel que deseja detalhar: ");	
										p.AlterarDadosImovel(leitor.nextInt());
										break;
										
								case 3: //Excluir Im�vel
										System.out.println("Home > Im�vel > Excluir Im�vel\n\n");									
										p.ExcluirImovel();	
										break;
										
								case 4: //Listar todos os Im�veis
										System.out.println("Home > Im�vel > Listar todos os Im�veis\n\n");	
										p.ListarImovel();
										break;
										
								case 5: //Listar todos os Im�veis
										System.out.println("Home > Im�vel > Listar todos os Im�veis alugados\n\n");	
										p.ListarAlugados();
										break;
									
								case 6: //Listar todos os Im�veis
										System.out.println("Home > Im�vel > Listar todos os Im�veis dispon�veis\n\n");	
										p.ListarDisponiveis();
										break;
										
								case 7: //Detalhar Im�vel
										System.out.println("Home > Im�vel > Detalhar Im�vel\n\n");
										System.out.println("Digite o ID do im�vel que deseja detalhar: ");	
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
				
				case 6: //Propriet�rio
				{
					System.out.println("Home > Propriet�rios\n\n");		
					System.out.println("1) Novo Propriet�rio");
					System.out.println("2) Alterar Propriet�rio");
					System.out.println("3) Excluir Propriet�rio");
					System.out.println("4) Listar Propriet�rio");				
					System.out.println("7) Detalhar Propriet�rio");
					escolha = leitor.nextInt();
					
					try 
					{
						switch(escolha)
						{
							case 1: //Novo Propriet�rio
									System.out.println("Home > Propriet�rio > Novo Propriet�rio\n\n");
									p.CadastrarProprietario();
									break;
									
							case 2: //Alterar Propriet�rio
									System.out.println("Home > Propriet�rio > Alterar Propriet�rio\n\n");
									System.out.println("Digite o ID do propriet�rio que deseja alterar: ");	
									p.AlterarDadosProprietario(leitor.nextInt());
									break;
									
							case 3: //Excluir Propriet�rio
									System.out.println("Home > Propriet�rio > Excluir Propriet�rio\n\n");
									p.ExcluirProprietario();
									break;
									
							case 4: //Listar Propriet�rio
									System.out.println("Home > Propriet�rio > Listar Propriet�rio\n\n");
									p.ListarProprietarios();
									break;
									
							case 5: //Detalhar Propriet�rio
									System.out.println("Home > Propriet�rio > Detalhar Propriet�rio\n\n");
									System.out.println("Digite o ID do propriet�rio que deseja detalhar: ");	
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
