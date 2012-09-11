import java.util.Scanner;

public class Funcionario extends Pessoa
{	
	private int idFuncional=0;
	protected	float salario;
	private String cargo; 	
	public static Scanner leitor = new Scanner(System.in);	
	
	
			public float getSalario()
			{
				return(salario);
			}
			
			public void setSalario(float salariofunc)
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
			
			public void calcularSalario(int comissao,int total)
			{
				//sobrecarregar nas classes filhas		
			}			
}
