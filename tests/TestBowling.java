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
	
	@Test
	public void testScore() throws BowlingException {
		//Arrange
		Frame frame = new Frame(2,4);
		//Act
		int score = frame.score();
		//Assert
		assertEquals("Score incorrect", 6, score);
		
	}
	
	@Test
	public void testScoreFirstThrowStrike() throws BowlingException {
		//Arrange
		Frame frame = new Frame(10,0);
		int score = frame.score();
		assertEquals("Score incorrect", 10, score);
	}
	
	@Test
	public void test10Frames() throws BowlingException {
		BowlingGame bowling = new BowlingGame();
		
		bowling.addFrame(new Frame(1,5));
		bowling.addFrame(new Frame(3,6));
		bowling.addFrame(new Frame(7,2));
		bowling.addFrame(new Frame(3,6));
		bowling.addFrame(new Frame(4,4));
		bowling.addFrame(new Frame(5,3));
		bowling.addFrame(new Frame(3,3));
		bowling.addFrame(new Frame(4,5));
		bowling.addFrame(new Frame(8,1));
		bowling.addFrame(new Frame(2,6));
	}
	
	@Test
	public void testScoreOf10Frames() throws BowlingException {
		BowlingGame bowling = new BowlingGame();
		
		bowling.addFrame(new Frame(1,5));
		bowling.addFrame(new Frame(3,6));
		bowling.addFrame(new Frame(7,2));
		bowling.addFrame(new Frame(3,6));
		bowling.addFrame(new Frame(4,4));
		bowling.addFrame(new Frame(5,3));
		bowling.addFrame(new Frame(3,3));
		bowling.addFrame(new Frame(4,5));
		bowling.addFrame(new Frame(8,1));
		bowling.addFrame(new Frame(2,6));
		
		int score = bowling.score();
		
		assertEquals("Score incorrect", 81, score);
	}
	
	@Test
	public void testScoreOf10FramesStrike() throws BowlingException {
		BowlingGame bowling = new BowlingGame();
		
		bowling.addFrame(new Frame(10,0));
		bowling.addFrame(new Frame(3,6));
		bowling.addFrame(new Frame(7,2));
		bowling.addFrame(new Frame(3,6));
		bowling.addFrame(new Frame(4,4));
		bowling.addFrame(new Frame(5,3));
		bowling.addFrame(new Frame(3,3));
		bowling.addFrame(new Frame(4,5));
		bowling.addFrame(new Frame(8,1));
		bowling.addFrame(new Frame(2,6));
		
		int score = bowling.score();
		
		assertEquals("Score incorrect", 94, score);
	}

	@Test
	public void testScoreOf10FramesSpare() throws BowlingException {
		BowlingGame bowling = new BowlingGame();
		
		bowling.addFrame(new Frame(1,9));
		bowling.addFrame(new Frame(3,6));
		bowling.addFrame(new Frame(7,2));
		bowling.addFrame(new Frame(3,6));
		bowling.addFrame(new Frame(4,4));
		bowling.addFrame(new Frame(5,3));
		bowling.addFrame(new Frame(3,3));
		bowling.addFrame(new Frame(4,5));
		bowling.addFrame(new Frame(8,1));
		bowling.addFrame(new Frame(2,6));
		
		int score = bowling.score();
		
		assertEquals("Score incorrect", 88, score);
	}
	
	@Test
	public void testScoreOf10FramesStrikeAndSpare() throws BowlingException {
		BowlingGame bowling = new BowlingGame();
		
		bowling.addFrame(new Frame(10,0));
		bowling.addFrame(new Frame(4,6));
		bowling.addFrame(new Frame(7,2));
		bowling.addFrame(new Frame(3,6));
		bowling.addFrame(new Frame(4,4));
		bowling.addFrame(new Frame(5,3));
		bowling.addFrame(new Frame(3,3));
		bowling.addFrame(new Frame(4,5));
		bowling.addFrame(new Frame(8,1));
		bowling.addFrame(new Frame(2,6));
		
		int score = bowling.score();
		
		assertEquals("Score incorrect", 103, score);
	}
	
	@Test
	public void testScoreOf10FramesTwoStrikeRow() throws BowlingException {
		BowlingGame bowling = new BowlingGame();
		
		bowling.addFrame(new Frame(10,0));
		bowling.addFrame(new Frame(10,0));
		bowling.addFrame(new Frame(7,2));
		bowling.addFrame(new Frame(3,6));
		bowling.addFrame(new Frame(4,4));
		bowling.addFrame(new Frame(5,3));
		bowling.addFrame(new Frame(3,3));
		bowling.addFrame(new Frame(4,5));
		bowling.addFrame(new Frame(8,1));
		bowling.addFrame(new Frame(2,6));
		
		int score = bowling.score();
		
		assertEquals("Score incorrect", 112, score);
	}
	
	@Test
	public void testScoreOf10FramesTwoSparesRow() throws BowlingException {
		BowlingGame bowling = new BowlingGame();
		
		bowling.addFrame(new Frame(8,2));
		bowling.addFrame(new Frame(5,5));
		bowling.addFrame(new Frame(7,2));
		bowling.addFrame(new Frame(3,6));
		bowling.addFrame(new Frame(4,4));
		bowling.addFrame(new Frame(5,3));
		bowling.addFrame(new Frame(3,3));
		bowling.addFrame(new Frame(4,5));
		bowling.addFrame(new Frame(8,1));
		bowling.addFrame(new Frame(2,6));
		
		int score = bowling.score();
		
		assertEquals("Score incorrect", 98, score);
	}
	
	@Test
	public void testScoreOf10FramesSpareAsLastFrame() throws BowlingException {
		BowlingGame bowling = new BowlingGame();
		
		bowling.addFrame(new Frame(1,5));
		bowling.addFrame(new Frame(3,6));
		bowling.addFrame(new Frame(7,2));
		bowling.addFrame(new Frame(3,6));
		bowling.addFrame(new Frame(4,4));
		bowling.addFrame(new Frame(5,3));
		bowling.addFrame(new Frame(3,3));
		bowling.addFrame(new Frame(4,5));
		bowling.addFrame(new Frame(8,1));
		bowling.addFrame(new Frame(2,8));
		
		int score = bowling.score();
		
		assertEquals("Score incorrect", 90, score);
	}	
	
	
	
	
}
