package Projeto.Projeto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClasseAmostraTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testSquare() {
		ClasseAmostra test=new ClasseAmostra();
		int output=test.square(5);
		assertEquals(25, output);
	}
	
	@Test
	public void testSum() {
		ClasseAmostra test=new ClasseAmostra();
		int output=test.sum(5);
		assertEquals(10, output);
	}


}
