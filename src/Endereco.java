import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Endereco {

	   private static TrataErro erro = new TrataErro();
	   public static Scanner leitor = new Scanner(System.in);
	   	
       private String rua;
       private String bairro;
       private String complemento;
       private String numero;
       private String cep;
       private String cidade;
       private String estado;
       
       Endereco(){
    	   //construtor sem parametros
       }
       
       
       public String getRua () {
    	   return rua;
       }
       
       public String getBairro () {
    	   return bairro;
       }
       
       public String getComplemento () {
    	   return complemento;
       }
       
       public String getNumero () {
    	   return numero;
       }
       
       public String getCep () {
    	   return cep;
       }
       
       public String getCidade () {
    	   return cidade;
       }
       
       public String getEstado () {
    	   return estado;
       }
       
       public void setRua (String nRua) throws Exception {
    	   if (nRua.trim() == ""){
    		   erro.mostraErro("Rua Deve ser preenchida");
    	   }
    	   rua = nRua;
       }
       
       public void setBairro (String nBairro) throws Exception{
    	   if (nBairro.trim() == ""){
    		   erro.mostraErro("Bairro Deve ser preenchido");
    	   }
    	   bairro = nBairro;
       }
       
       public void setComplemento (String nComplemento) {
    	   complemento = nComplemento;
       }
       
       public void setNumero (String nNumero) {
    	   if (nNumero.trim() == ""){
    		   numero = "s/n";
    	   }
    	   numero = nNumero;
       }
       
       public void setCep (String nCep) throws Exception {
    	   if (nCep.trim() == ""){
    		   erro.mostraErro("CEP Deve ser preenchido");
    	   }
    	   cep = nCep;
       }
       
       public void setCidade (String nCidade) throws Exception {
    	   if (nCidade.trim() == ""){
    		   erro.mostraErro("Cidade Deve ser preenchida");
    	   }
    	   cidade = nCidade;
       }
       
       public void setEstado (String nEstado) throws Exception {
    	   if (nEstado.trim() == ""){
    		   erro.mostraErro("Estado Deve ser preenchido");
    	   }
    	   estado = nEstado;
       }
       
       public Endereco(String nRua,
    		           String nBairro,
    		           String nNumero,
    		           String nComplemento,
    		           String nCep,
    		           String nCidade,
    		           String nEstado) throws Exception {

    	   //Construtor da Classe
    	   setRua(nRua);
    	   setBairro(nBairro);
    	   setNumero(nNumero);
    	   setComplemento(nComplemento);
    	   setCep(nCep);
    	   setCidade(nCidade);
    	   setEstado(nEstado);
       }
       
       public void CadastrarEndereco()
       {
    	
    	   String rua, bairro, comp, cep, cidade, numero, estado;
    	   
    	   System.out.println("Rua: ");
   		   rua = leitor.nextLine();
   		   System.out.println("Numero: ");
		   numero = leitor.nextLine();
		   System.out.println("Bairro: ");
   		   bairro = leitor.nextLine();
   		   System.out.println("Complemento: ");
		   comp = leitor.nextLine();
		   System.out.println("CEP: ");
   		   cep = leitor.nextLine();
   		   System.out.println("Cidade: ");
		   cidade = leitor.nextLine();
		   System.out.println("Estado: ");
   		   estado = leitor.nextLine();
   		   
   		   try {
   			   	   Endereco end = new Endereco(rua, bairro, numero, comp, cep, cidade, estado);
   		   	   } 
   		   catch (Exception e) {
   			   					    e.printStackTrace();
   			   				   }
    	    	   
       }
}
