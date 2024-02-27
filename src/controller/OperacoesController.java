package controller;

public class OperacoesController {
	public OperacoesController() {
		// TODO Auto-generated constructor stub
	}
	
	boolean positivo = true;
	
	public int resto(int dividendo, int divisor) {
		
		if(dividendo < divisor)
			return dividendo;
		
		dividendo -= divisor;
		
		return resto(dividendo, divisor);

	}
}
