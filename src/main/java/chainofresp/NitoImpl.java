package chainofresp;

public class NitoImpl extends ICandyMachine {

	private ICandyMachine chain;
	private double price= 5;
	
	
	@Override
	public void setNextChain(ICandyMachine nextChain) {
		
		this.chain=nextChain;
		
	}

	@Override
	public void dispense(ProductsMachine productsMachine) {
		
//		int nitos=0;
//		double money= productsMachine.getMoney();
//		
//		while(money >= this.price) {
//			money-=this.price;
//			nitos++;
//		}
//		
//		productsMachine.setNitos(nitos);
//		productsMachine.setMoney(money);
		
		ICandyMachine c= new NitoImpl();
		c.buyProducts(productsMachine, price);
				
		 double money=productsMachine.getMoney();
		productsMachine.setMoney(money);
		
		
		
		if(this.chain !=null) {
			this.chain.dispense(productsMachine);
		}
		
	}

}
