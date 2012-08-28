
public class Imovel {
	private int       tipo;
	private int       areaUtil;
	private int       numeroQuartos;
	private int       numeroBanheiros;
	private int       numeroVagasGaragem;
	private int       numeroComodos;
	private boolean   possuiAreaExterna;
	private boolean   alugado;
	private int       idImovel;
	
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

    
    
    public void setTipo (int nTipo){
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

}



