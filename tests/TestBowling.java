import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testFrame() {
		Frame frame = new Frame(2,4);
		frame.setFirstThrow(2);
		frame.setSecondThrow(4);
	}
	
	@Test
	public void testFrameNegativeValues() {
		Frame frame = new Frame(-2,0);
		frame.setFirstThrow(-2);
		frame.setSecondThrow(0);
	}

}
