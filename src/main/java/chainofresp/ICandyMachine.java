package chainofresp;

public abstract class ICandyMachine {
	int valor =0;
	
	
	abstract void setNextChain(ICandyMachine nextChain);
	
	
	abstract void dispense(ProductsMachine productsMachine);
	
	int buyProducts(ProductsMachine productsMachine, double price) {
		
		double money= productsMachine.getMoney();
		
		while(money >= price) {
			money-=price;
			valor++;
		}
		
		return valor;
	}
	

}
