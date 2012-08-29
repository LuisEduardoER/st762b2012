
public class Imovel {
	private static TrataErro erro = new TrataErro();
	
	private int       tipo;
	private int       areaUtil;
	private int       numeroQuartos;
	private int       numeroBanheiros;
	private int       numeroVagasGaragem;
	private int       numeroComodos;
	private boolean   possuiAreaExterna;
	private boolean   alugado;
	private int       idImovel;
	
	private static int pIdImovel;
	
	private Endereco  endereco;
	private Inquilino inquilino;
	/********************************************************
	 * tipo:                                                *
	 * 1 = Casa;                                            *
	 * 2 = Apartamento                                      *
	 * 3 = Chacara                                          *
	 * 4 = Kitnete ?                                        *
	 ********************************************************/
	 
	public int getTipo (){
		return tipo;
	}

    public int getAreaUtil (){
        return areaUtil;
    }
    
    public int getNumeroQuartos (){
    	return numeroQuartos;
    }
    
    public int getNumeroBanheiros (){
    	return numeroBanheiros;
    }
    
    public int getNumeroVagasGaragem (){
    	return numeroVagasGaragem;
    }
    
    public int getNumeroComodos (){
    	return numeroComodos;
    }
    
    public boolean getPossuiuAreaExterna (){
    	return possuiAreaExterna;
    }
     
    public boolean getAlugado (){
    	return alugado;
    }
    
    public int getIdImovel (){
    	return idImovel;
    }

    public Endereco getEndereco(){
    	return endereco;
    }
    
    public Inquilino getInquilino() throws Exception{
    	if (inquilino == null){
    		erro.mostraErro("Inquilino não cadastrado");
    	}
    	return inquilino;
    }
    
    
    public void setTipo (int nTipo) throws Exception{
    	if ((nTipo < 1)||(nTipo > 4)){
    		erro.mostraErro("Tipo Invalido");
    	}
    	tipo = nTipo;
    }
    
    public void setAreaUtil (int nAreaUtil){
    	areaUtil = nAreaUtil;
    }
    
    public void setNumeroQuartos (int nNumeroQuartos){
    	numeroQuartos = nNumeroQuartos;
    }
    
    public void setNumeroBanheiros (int nNumeroBanheiros){
    	numeroBanheiros = nNumeroBanheiros;
    }
    
    public void setNumeroVagasGaragem (int nNumeroVagasGaragem){
    	numeroVagasGaragem = nNumeroVagasGaragem;
    }
    
    public void setNumeroComodos (int nNumeroComodos){
    	numeroComodos = nNumeroComodos;
    }
    
    public void setPossuiuAreaExterna (boolean nPossuiuAreaExterna){
    	possuiAreaExterna = nPossuiuAreaExterna;
    }
    
    public void setAlugado (boolean nAlugado){
    	alugado = nAlugado;
    } 
    
    public void setEndereco (Endereco nEndereco){
    	endereco = nEndereco;
    }
    
    public void setInquilino (Inquilino nInquilino)throws Exception{
    	if (!alugado){
    		erro.mostraErro("antes de incluir um inquilino, altere o status para alugado");
    	}
    	inquilino = nInquilino;
    }

    public Imovel(int      nTipo,
    		      int      nAreaUtil,
    		      int      nNumeroQuartos,
    		      int      nNumeroBanheiros,
    		      int      nNumeroVagasGaragem,
    		      int      nNumeroComodos,
    		      boolean  nPossuiuAreaExterna,
    		      Endereco nEndereco) throws Exception{
    	
    	
    	setTipo(nTipo);
    	setAreaUtil(nAreaUtil);
    	setNumeroQuartos(nNumeroQuartos);
    	setNumeroBanheiros(nNumeroBanheiros);
    	setNumeroVagasGaragem(nNumeroVagasGaragem);
    	setNumeroComodos(nNumeroComodos);
    	setPossuiuAreaExterna(nPossuiuAreaExterna);
    	setEndereco(nEndereco);
    	
    	alugado = false;
    	pIdImovel++;
    	idImovel = pIdImovel;
    }
}



