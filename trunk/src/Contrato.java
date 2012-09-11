import java.util.Date;


public class Contrato {
     private static TrataErro erro = new TrataErro();
	
	 private int idContrato;
	 private int valorContrato;
     private Date dataAssinatura;
     private boolean assinado;
     
     private final Object cadeadoIdContrato = new Object();
     private final Object cadeadoValorContrato = new Object();
     private final Object cadeadoDataAssinatura = new Object();
     private final Object cadeadoAssinado = new Object();
     
     private Proprietario proprietario;
     private Corretor corretor;
     private Fiador fiador;
     
     private final Object cadeadoProprietario = new Object();
     private final Object cadeadoCorretor = new Object();
     private final Object cadeadoFiador = new Object();
     
     private static int pIdContrato; // variavel de auto-incremento para gerar PK
     
     private static final Object cadeadoPIdContrato = new Object();
     
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
    	 synchronized (cadeadoPIdContrato) {
    		 pIdContrato++;
        	 idContrato = pIdContrato;
		 }
     }
     
 
     public int getIdContrato (){
    	 synchronized (cadeadoIdContrato) {
    		 return idContrato;	
		}
     }
     
     public int getValorContrato (){
    	 synchronized (cadeadoValorContrato) {
    		 return valorContrato;	
		}
     }
     
     
     public Date getDataAssinatura (){
    	 synchronized (cadeadoDataAssinatura) {
    		 return dataAssinatura;
		}
    	 
     }
     
     public void setValorContrato (int nValorContrato) throws Exception{
    	 synchronized (cadeadoValorContrato) {
    		 if (assinado){
    			 erro.mostraErro("Contrato ja assinado");
    		 }
    		 valorContrato = nValorContrato;
    	 }
     }
     
     
     public Proprietario getProprietario(){
    	 synchronized (cadeadoProprietario) {
    		 return proprietario;
		}
     }
     
     public Inquilino getInquilino() throws Exception{
    	 synchronized (cadeadoProprietario) {
    		 return proprietario.getImovel().getInquilino();	
		}
     }
     
     public Corretor getCorretor(){
    	 synchronized (cadeadoCorretor) {
    		 return corretor;
		}
     }
     
    public Imovel getImovel(){
        synchronized (cadeadoProprietario) {
        	return proprietario.getImovel();
		}	 
     }
     
     public Fiador getFiador() throws Exception{
    	 synchronized (cadeadoFiador) {
    		 if (fiador == null){
        		 erro.mostraErro("fiador ainda nao cadastrado");
        	 }
        	 return fiador;
		}
     }
     
     public void assinarContrato() throws Exception{
    	 synchronized (cadeadoProprietario) {
    		 if (proprietario.getImovel().getAlugado()){
    			 erro.mostraErro("Imovel já esta alugado");
    		 }
    		 proprietario.getImovel().setAlugado(true);
    	 }
    	 synchronized (cadeadoDataAssinatura) { 
    		 dataAssinatura = new Date();
    	 }
    	 synchronized (cadeadoAssinado) {
    		 assinado = true;
		}
     }
          
     //public void modificarDadosFiador(String nome,String RG, String CPF, int rendaComprovada){
    	 //Implementar... antes verificar detalhes do fiador, beijos
     //} oi?
}
