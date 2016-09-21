import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	
	@Test
	public void testFrame() throws BowlingException {
		Frame frame = new Frame(2,4);
	}
	
	@Test (expected = BowlingException.class)
	public void testFrameNegatives() throws BowlingException {
		Frame frame = new Frame(-2,3);
	}
	
	@Test (expected = BowlingException.class)
	public void testFrameTooLargeNumbers() throws BowlingException {
		Frame frame = new Frame(11,2);
	}
	
	
}
