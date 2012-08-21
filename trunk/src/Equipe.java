import java.util.Scanner;

public class Equipe 
{
	private int numeroTotalFuncionarios=0;
	private int numeroCorretores;
	private int numeroSocios;
	private Funcionario f; 
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
				System.out.println("Total de funcionários: ");
				this.numeroTotalFuncionarios = leitor.nextInt();
				System.out.println("Total de corretores: ");
				this.numeroCorretores = leitor.nextInt();
				System.out.println("Total de sócios: ");
				this.numeroSocios = leitor.nextInt();				
			}
}
