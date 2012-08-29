import java.util.Scanner;

public class Principal {
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args)
	{		
      
	   boolean sair = false;
	   String comando;
	   String mComando[];
		
	   while (!sair){
		   System.out.printf("imobiliaria pagou morou > ");
		   comando = leitor.next();
		   mComando = comando.split(" ");
		   
		   if ((mComando[0].toUpperCase() == "HELP")||((mComando[0].toUpperCase() == "AJUDA"))){
			   System.out.printf("sistema paga alugueis de casas \n");
			   System.out.printf("\n");
			   System.out.printf("Comandos \n");
			   System.out.printf("Ajuda: Mostra essa tela\n");
		   }else if ((mComando[0].toUpperCase() == "SAIR")||(mComando[0].toUpperCase() == "EXIT")){
			   sair = true;
		   }
		   /*try{
				  
	       }
	       catch (Exception erro){
	    	   System.out.printf(erro.getMessage());
	       } */  
	   }
      

	}
}
