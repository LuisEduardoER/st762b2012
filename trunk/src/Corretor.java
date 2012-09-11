
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
				/* para cada novo contrato firmado em um mês é gerada uma bonificação no
				salário correspondente a 1% do valor de um mês de aluguel (esta bonificação é adicionada ao salário-base).*/
			}
			
			public void calcularSalario(int comissao,int total)
			{
			    bonusMes = (float) (comissao*0.01);
			    salario = salario + bonusMes;
			    
			}
}