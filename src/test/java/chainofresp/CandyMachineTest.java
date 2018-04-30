package chainofresp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyMachineTest {

	@Test
	void validateCandyMachineChains() {
		
		ICandyMachine c1= new GansitoImpl();
		ICandyMachine c2= new NitoImpl();
		ICandyMachine c3= new LollilopImpl();
		
		c1.setNextChain(c2);
		c2.setNextChain(c3);
		
	//	double myMoney= 100;
		ProductsMachine productsMachine= new ProductsMachine();
		productsMachine.setMoney(1119);
		
		c1.dispense(productsMachine);
		
		System.out.println(String.format("Gansitos:  %d", productsMachine.getGansitos()));
		System.out.println(String.format("Nitos:  %d", productsMachine.getNitos()));
		System.out.println(String.format("Paletas:  %d", productsMachine.getPaletas() ));
		System.out.println(String.format("Money:  %f", productsMachine.getMoney()));
		
		
		assertEquals(159, productsMachine.getGansitos());
		assertEquals(1, productsMachine.getPaletas());
		assertEquals(1, productsMachine.getNitos());
		assertEquals(0, productsMachine.getMoney());
	}
	
}
