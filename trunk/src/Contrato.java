import java.util.Date;


public class Contrato {
     private static TrataErro erro = new TrataErro();
	
	 private int idContrato;
     private int valorContrato;
     private Date dataAssinatura;
     private boolean assinado;
     
     private Proprietario proprietario;
     private Corretor corretor;
     private Fiador fiador;
     
     private static int pIdContrato; // variavel de auto-incremento para gerar PK
     
     public Contrato (Corretor     nCorretor,
    		          Proprietario nProprietario) throws Exception {

    	 if (nCorretor == null){
    		 erro.mostraErro("Corretor Invalido");
    	 }
    	 if (nProprietario == null){
    		 erro.mostraErro("Proprietario Invalido");
    	 }
    	 
    	 assinado = false;
    	 corretor = nCorretor;
    	 proprietario = nProprietario;
    	 pIdContrato++;
    	 idContrato = pIdContrato;
     }
     
 
     public int getIdContrato (){
    	 return idContrato;
     }
     
     public int getValorContrato (){
    	 return valorContrato;
     }
     
     
     public Date getDataAssinatura (){
    	 return dataAssinatura;
     }
     
     public void setValorContrato (int nValorContrato) throws Exception{
    	 if (assinado){
    		 erro.mostraErro("Contrato ja assinado");
    	 }
    	 valorContrato = nValorContrato;
     }
     
     
     public Proprietario getProprietario(){
    	 return proprietario;
     }
     /*IMPLEMENTAR BY MY WAY (ou nao)
     public Inquilino getInquilino(){
    	 return inquilino;
     }*/
     
     public Corretor getCorretor(){
    	 return corretor;
     }
     
    /* public Imovel getImovel(){
    	 return imovel;
     } AGguardando proprietario*/
     
     public Fiador getFiador() throws Exception{
    	 if (fiador == null){
    		 erro.mostraErro("fiador ainda nao cadastrado");
    	 }
    	 return fiador;
     }
     
     public void assinarContrato(){
    	 dataAssinatura = new Date();
    	 assinado = true;
     }
     
     
     public void modificarDadosFiador(String nome,String RG, String CPF, int rendaComprovada){
    	 //Implementar... antes verificar detalhes do fiador, beijos
     }
     
}
