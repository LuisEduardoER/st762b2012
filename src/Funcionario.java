import java.util.Scanner;

public class Funcionario extends Pessoa
{	
	private int idFuncional=0;
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
			
			public void setIDFuncional(int idfunc)
			{
				idFuncional = idfunc;
			}
			
			public void calcularSalario()
			{
				//implementar			
			}			
}
