package hiss;

public class Person extends Thread implements Runnable {
	
	int enterFloor;
	int toFloor;
	boolean directionUp;
	
	public Person(boolean direction, int enterFloor, int toFloor) { // Elev ele
		this.directionUp = direction;
		this.enterFloor = enterFloor;
		this.toFloor = toFloor;
	}
	
	@Override
	public void run() {
		System.out.println("Jag vill ha hiss till " + enterFloor);
	}

	//Private Elevator elevator;
		

//df
	
	
	public boolean getDirection() {
		return directionUp;
	}
	public void setDirection(boolean direction) {
		this.directionUp = direction;
	}
		
	public int getEnterFloor() {
		return enterFloor;
	}
	public void setEnterFloor(int enterFloor) {
		this.enterFloor = enterFloor;
	}
	public int getToFloor() {
		return toFloor;
	}
	public void setToFloor(int toFloor) {
		this.toFloor = toFloor;
	}









}
