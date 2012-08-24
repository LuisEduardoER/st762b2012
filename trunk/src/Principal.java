public class Principal {

	public static void main(String[] args)
	{		
       try{
		   Equipe e = new Equipe();		
		   e.CadastrarEquipe();
		   e.contratarFuncionario();
       }
       catch (Exception erro){
    	   System.out.printf(erro.getMessage());
       }
	}
}
