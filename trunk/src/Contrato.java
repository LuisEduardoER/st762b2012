import java.util.Date;
//teste

public class Contrato {
     private int idContrato;
     private int valorContrato;
     private Date dataAssinatura;
     
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
