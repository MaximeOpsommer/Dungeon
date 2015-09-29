package dungeon;


public class TrapRoom extends Room {

	/**
	 * A trap Room
	 */
	public TrapRoom() {
		super();
	}
	
	public TrapRoom(boolean locked) {
		super(locked);
	}
	
	@Override
	public boolean canBeLeft() {
		return false;
	}
	
	@Override
	public String getDescription() {
		return "a trap!";
	}
}
