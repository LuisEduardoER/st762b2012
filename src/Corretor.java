
public class Corretor extends Funcionario
{
	private float bonusMes;
	
			public float getBonusMes()
			{
				return(bonusMes);
			}
			
			public void setBonusMes(float bonus)
			{
				bonusMes = bonus;
			}
			
			public void calcularSalario()
			{
				/* para cada novo contrato firmado em um m�s � gerada uma bonifica��o no
				sal�rio correspondente a 1% do valor de um m�s de aluguel (esta bonifica��o � adicionada ao sal�rio-base).*/
			}
			
			public void calcularSalario(int comissao,int total)
			{
			    bonusMes = (float) (comissao*0.01);
			    salario = salario + bonusMes;
			    
			}
}