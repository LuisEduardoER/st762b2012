
public class TrataErro {

	private static Exception _err;
	
	public static void mostraErro (String Mensagem) throws Exception{
		_err = new Exception(Mensagem);
		throw _err;
	}
	
}

//TurnMeOnDeadMan
