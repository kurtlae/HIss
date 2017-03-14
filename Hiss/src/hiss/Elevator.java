package hiss;

public class Elevator implements Runnable {

	boolean directionUp;
	int currentFloor;
	int noOfFloors = 10;
	int requestedFloor;
	boolean openDoor = false;
	boolean running;

	public Elevator(boolean direction, int currentFloor, int requestedFloor, boolean openDoor) {
		this.directionUp = direction;
		this.currentFloor = currentFloor;
		this.requestedFloor = requestedFloor;
		this.openDoor = openDoor;
	}

	@Override
	public void run() {
		System.out.println("Hissen är på våning " + currentFloor + " och kommer snart till " + requestedFloor);

			
		if (requestedFloor > currentFloor) {
			try {
				for (int i = 0; i <= requestedFloor; i++) {
					System.out.println("Floor " + i);
					currentFloor = i;
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.out.println("My sleep was interrupted");
			} finally {
			}
			System.out.println("Hissen är framme");
			while (openDoor) {
				try {
					System.out.println("Dörren öppnas");
					Thread.sleep(1000);
					openDoor = false;
					System.out.println("Öppen");
					System.out.println("Person går in i hissen");
					Thread.sleep(3000);
					
					} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}


		}
		
		for (int i = current0; i <= target; i++) {
			System.out.println("Floor " + i);
			currentFloor = i;
			Thread.sleep(1000);
		}
		System.out.println("SimpleThread is done running");
	}

	public boolean getDirection() {
		return directionUp;
	}

	public void setDirection(boolean direction) {
		this.directionUp = direction;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public boolean getDoor() {
		return openDoor;
	}

	public void setDoor(boolean openDoor) {
		this.openDoor = openDoor;
	}

//	Queue<Person> pQueue = new LinkedList<Person>();
//	move 
	// whilequeue!empty
	//Person p pQueue.remove();
//	synchronized(elev)
//	hiss.moveme(this)
	
}
