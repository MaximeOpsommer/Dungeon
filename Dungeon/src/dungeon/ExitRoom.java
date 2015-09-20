package dungeon;


public class ExitRoom extends Room{

	public ExitRoom() {
		super();
	}
	
	@Override
	public boolean canBeLeft() {
		return true;
	}
	
	@Override
	public String getDescription() {
		return "This is the exit!";
	}
}