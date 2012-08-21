import java.util.Scanner;

public class Funcionario extends Pessoa
{	
	private int idFuncional;
	private	int salario;
	private String cargo; 		
	public static Scanner leitor = new Scanner(System.in);
	
	
			public int getSalario()
			{
				return(salario);
			}
			
			public void setSalario(int salariofunc)
			{
				salario = salariofunc;
			}
			
			public String getCargo()
			{
				return(cargo);
			}
			
			public void setCargo(String cargofunc)
			{
				cargo = cargofunc;
			}
			
			public int getIDFuncional()
			{
				return(idFuncional);
			}
			
			public void setIDFuncional(int idfunc )
			{
				idFuncional = idfunc;
			}
			
			public void calcularSalario()
			{
				//implementar			
			}
			
			public void Cadastrar()
			{
				System.out.println("Nome: ");
				this.nome = leitor.nextLine();
				System.out.println("CPF: ");
				this.CPF = leitor.nextLine();
				System.out.println("RG: ");
				this.RG = leitor.nextLine();
				System.out.println("Cargo: ");
				this.cargo = leitor.nextLine();	
				System.out.println("ID: ");
				this.idFuncional = leitor.nextInt();
				System.out.println("Salario: ");
				this.salario = leitor.nextInt();
			
			}
		
}
