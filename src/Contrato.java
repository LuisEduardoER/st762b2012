import java.util.Date;


public class Contrato {
     private int idContrato;
     private int valorContrato;
     private Date dataAssinatura;
     private Inquilino inquilino;
     private Imovel imovel;
     private Corretor corretor;
     private static int pIdContrato; // variavel de auto-incremento para gerra PK
     
     public int getIdContrato (){
    	 return idContrato;
     }
     
     public int getValorContrato (){
    	 return valorContrato;
     }
     
     public void setValorContrato (int nValorContrato){
    	 valorContrato = nValorContrato;
     }
     
     public Date getDataAssinatura (){
    	 return dataAssinatura;
     }
     
     public void setDataAssinatura (Date nDataAssinatura){
    	 dataAssinatura = nDataAssinatura;
     }
     
     
}
