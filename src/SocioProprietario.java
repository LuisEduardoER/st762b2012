
public class SocioProprietario extends Funcionario
{
		private int porcentagemDaEmpresa;		
	
			public int getPorcentagemEmpresa()
			{
				return(porcentagemDaEmpresa);
			}
			
			public void setPorcentagemEmpresa(int porcentagemempresa)
			{
				porcentagemDaEmpresa = porcentagemempresa;
			}
			
			public void calcularSalario(int comissao,int total)
			{
				salario =  (float) (((float)total)*0.1*((float)porcentagemDaEmpresa/(float)100));
			}	
}
