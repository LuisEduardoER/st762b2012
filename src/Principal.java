import java.util.Scanner;

public class Principal 
{
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception
	{	
		Imovel im = new Imovel();
		int escolha;
		int portifolio;
		int menu;
		
		do
		{
			System.out.println ("1) Cadastros");
			System.out.println ("2) Portifólio");
			System.out.println ("3) Sair");
			menu = leitor.nextInt();
			
			switch (menu)
			{
				case 1: // cadastrar
					System.out.println ("1) Cadastrar Proprietario");
					System.out.println ("2) Cadastrar Inquilino");
					System.out.println ("3) Cadastrar Fiador");
					System.out.println ("4) Cadastrar Imóvel");
					escolha = leitor.nextInt();
					
					switch(escolha)
					{
						case 1: //cadastrar proprietario
							Proprietario p = new Proprietario();
							p.CadastrarProprietario();
							break;
							
						case 2: //cadastrar inquilino
							Inquilino i = new Inquilino();
							i.CadastrarInquilino();
							break;
							
						case 3: //cadastrar fiador
							Fiador f = new Fiador();
							f.CadastrarFiador();
							break;
							
						case 4: //cadastrar novo imovel
							im.CadastrarImovel();
							break;						
					}
					
					case 2:
					{
						Portifolio port = new Portifolio();
						int id;
						System.out.println("1) Listar imóveis");
						System.out.println("2) Listar imoveis alugados");
						System.out.println("3) Listar imoveis disponiveis");
						System.out.println("4) Detalhar imovel");
						portifolio = leitor.nextInt();
						
						switch(portifolio)
						{
							case 1:
								im.ListarTodos();
								break;
								
							case 2:
								im.ListarAlugados();
								break;
								
							case 3:
								im.ListarDisponiveis();
								break;
							case 4:
								System.out.println("ID: ");
								id = leitor.nextInt();
								im.DetalharImovel(id);
								break;
						}
				     }
					
			}
		} while (menu != 2 );
	}
}
