package hiss;


public class Program {

	public static void main(String[] args) throws InterruptedException {


		// up, enterFloor, toFloor
		Person booking1 = new Person(false, 7 , 0);
//		Person booking2 = new Person(false, 3 , 0);
		booking1.start();
//		sleep;2
//		booking2.start();

		// ELev elev = new elev();
		
		int requestedFloor = booking1.getEnterFloor();
		// up, currentFloor, requestedFloor, boolean openDdoor
		Elevator request = new Elevator(true, 0, requestedFloor, true);
		request.run();
		
		while (booking1.isAlive() || booking1.isAlive()){
			System.out.println("Main thread will be alive as long as any child thread is alive");
				Thread.sleep(2000);
		}
		System.out.println("Main thread is done running");
		
		
//		Elevator simpleThread1 = new Elevator(1000);
//		Elevator simpleThread2 = new Elevator(1322);
//		simpleThread1.start();   
//		simpleThread2.start();
				
		
	}

}
