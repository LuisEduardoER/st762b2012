
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
				/* para cada novo contrato firmado em um m�s � gerada uma bonifica��o no
				sal�rio correspondente a 1% do valor de um m�s de aluguel (esta bonifica��o � adicionada ao sal�rio-base).*/
			}
}