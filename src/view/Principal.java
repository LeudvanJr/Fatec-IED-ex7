package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController opController = new OperacoesController();
		int dividendo = 104, divisor = 5;
		int resto = opController.resto(dividendo, divisor);
		
		System.out.println(resto);

	}

}
