
public class Imovel {
	private int     tipo;
	private int     areaUtil;
	private int     numeroQuartos;
	private int     numeroBanheiros;
	private int     numeroVagasGaragem;
	private int     numeroComodos;
	private boolean possuiAreaExterna;
	private boolean alugado;
	private int     idImovel;
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
	
    public void setTipo (int nTipo){
    	tipo = nTipo;
    }
    
    public int getAreaUtil (){
        return areaUtil;
    }
    
    public void setAreaUtil (int nAreaUtil){
    	areaUtil = nAreaUtil;
    }
    
    public int getNumeroQuartos (){
    	return numeroQuartos;
    }
    
    public void setNumeroQuartos (int nNumeroQuartos){
    	numeroQuartos = nNumeroQuartos;
    }
    
    public int getNumeroBanheiros (){
    	return numeroBanheiros;
    }
    
    public void setNumeroBanheiros (int nNumeroBanheiros){
    	numeroBanheiros = nNumeroBanheiros;
    }
    
    public int getNumeroVagasGaragem (){
    	return numeroVagasGaragem;
    }
    
    public void setNumeroVagasGaragem (int nNumeroVagasGaragem){
    	numeroVagasGaragem = nNumeroVagasGaragem;
    }
    
    public int getNumeroComodos (){
    	return numeroComodos;
    }
    
    public void setNumeroComodos (int nNumeroComodos){
    	numeroComodos = nNumeroComodos;
    }
    
    public boolean getPossuiuAreaExterna (){
    	return possuiAreaExterna;
    }
    
    public void setPossuiuAreaExterna (boolean nPossuiuAreaExterna){
    	possuiAreaExterna = nPossuiuAreaExterna;
    }
    
    public boolean getAlugado (){
    	return alugado;
    }
    
    public void setAlugado (boolean nAlugado){
    	alugado = nAlugado;
    }
    public int getIdImovel (){
    	return idImovel;
    }



}



