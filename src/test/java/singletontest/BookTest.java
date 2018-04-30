package singletontest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

	
	@Test
	void singletonTestOne() {
		Book book = Book.getInstance();
		book.setNombre("Alberto");
		assertEquals( "Alberto",book.getNombre());
		
		
		Book book1 = Book.getInstance();
		book1.setNombre("Alberto");		
		assertEquals( "Alberto",book1.getNombre());
		
		Book book2 = Book.getInstance();
		book2.setNombre("Alberto");		
		assertEquals( "Alberto",book2.getNombre());
		
		
	}
}
