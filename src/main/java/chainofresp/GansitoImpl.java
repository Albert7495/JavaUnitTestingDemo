package chainofresp;

public class GansitoImpl extends ICandyMachine {

	private ICandyMachine chain;
	 private double price= 7;
	
	
	@Override
	public void setNextChain(ICandyMachine nextChain) {	
		this.chain=nextChain;
	}

	@Override
	public void dispense (ProductsMachine productsMachine) {
		ICandyMachine c= new GansitoImpl();
		
	
		c.buyProducts(productsMachine, price);
				
		 double money=productsMachine.getMoney();
		 productsMachine.setMoney(money);
		
		if(this.chain !=null) {
			this.chain.dispense(productsMachine);
		}

		
	}

}
