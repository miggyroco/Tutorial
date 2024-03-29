class Machine{
	
	public void start() {
		System.out.println("Machine Started");
		
	}
	
}


class Camera extends Machine{


	public void start() {
		System.out.println("Camera Started");
	}
	
	public void snap(){
		System.out.println("Photo Taken !");
	}	
}

public class AppUpcastingAndDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		
		//Upcasting
//		Machine machine2 = new Camera();
		Machine machine2 = camera1;
		machine2.start();
		
		//variable will decide what methods is available
//		machine2.snap(); will not work because the type is Machine
		
		//Downcasting
		Machine machine3 = new Camera();
		Camera camera2 = (Camera) machine3;
		camera2.start();
		camera2.snap();
		
		
//		Doesn't Work -- Runtime Error
//		Machine machine4 = new Machine();
//		Camera camera3 = (Camera)machine4;
//		camera3.start();
//		camera3.snap();
		
	}

}
