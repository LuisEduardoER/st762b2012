
public class Corretor extends Funcionario
{
	private int bonusMes;
	
			public int getBonusMes()
			{
				return(bonusMes);
			}
			
			public void setBonusMes(int bonus)
			{
				bonusMes = bonus;
			}
			
			public void calcularSalario()
			{
				/* para cada novo contrato firmado em um mês é gerada uma bonificação no
				salário correspondente a 1% do valor de um mês de aluguel (esta bonificação é adicionada ao salário-base).*/
			}
}