import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score() throws BowlingException{
		//to be implemented: should return game score
		int score = 0;
		boolean apu = false;
		for(int i = 0; i < 10; i++){
			Frame n = frames.get(i);
			apu = true;
			//Test if strike
			if(n.getFirstThrow() == 10){
				//What happens if Frame n is the last frame?
				Frame x = frames.get(i+1);
				score = score + n.score() + x.score();
				apu = false;
			}
/*			//Test if spare
			if(n.score() == 10 && n.getFirstThrow() != 10){
				Frame x = frames.get(i+1);
				score = score + n.score() + x.getFirstThrow();
				apu = false;
			} */
			//Jos ei strike tai spare
			if(apu) score = score + n.score();
		}
		
		return score;
	}
	
}
