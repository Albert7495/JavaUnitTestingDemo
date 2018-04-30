package chainofresp;

public class LollilopImpl extends ICandyMachine {

	private ICandyMachine chain;
	private double price= 1;
	
	@Override
	public void setNextChain(ICandyMachine nextChain) {
	
		this.chain=nextChain;
		
	}

	@Override
	public void dispense( ProductsMachine productsMachine) {
		
//		int paletas=0;
//		double money= productsMachine.getMoney();
//		
//		while(money >= this.price) {
//			money-=this.price;
//			paletas++;
//		}
//		
//		productsMachine.setPaletas(paletas);
//		productsMachine.setMoney(money);
		
		
		ICandyMachine c= new LollilopImpl();
	
		c.buyProducts(productsMachine, price);
		
		 double money=productsMachine.getMoney();
		productsMachine.setMoney(money);
		
		if(this.chain !=null) {
			this.chain.dispense(productsMachine);
		}
	}

}
