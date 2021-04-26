import java.util.*;

public class Main {

	private static Scanner sc;
	
	public static void main(String[] args) {
		
		IFan fan;
		
		configureFactories();
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Application Started\nThis Fan has two cords 1 and 2"
				+ "\nPulling Cord-1 will change the Speed and Cord-2 will change the direction");
		System.out.println("Please Pull cord 1 or 2");
		System.out.println("To exit press 0");
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Please enter maximum speed of fan 1, 2, 3 etc.\n");
		long maxSpeed = sc.nextLong();
		System.out.println("Please enter direction of fan FORWARD or REVERSE");
		String direction = sc.next();
		
		if(direction.isEmpty() && maxSpeed < 0) {
			fan = FanFactory.instance().makeFan();
		}
		else if(direction.isEmpty() && maxSpeed > 0) {
			fan = FanFactory.instance().makeFan(maxSpeed);
		}
		else {
			fan = FanFactory.instance().makeFan(maxSpeed, direction);
		}
		
		fan.printSpeed();
		fan.printDirection();

		
		try{ 
			while(true) {
		        System.out.print("Enter Cord Number: ");
		        
		        String cord = sc.next();
	        	
	        	if(cord.equals("1")){
	                fan.changeFanSpeed();
	                fan.printSpeed();
					fan.printDirection();
	            }
	            else if (cord.equals("2")){
	                fan.changeFanDirection();
	                fan.printSpeed();
					fan.printDirection();
	            }
	            else if (cord.equals("0")) {
	            	System.out.println("Exiting Application");
	        		break;
	            }
	            else{
	                System.out.println("Please Enter either 1 or 2\nTo exit press 0\n");
	            }
	        }
			
		}
		catch(Exception e) {
        	System.err.println("Error Caught! Please Restart Application!");
        	e.printStackTrace();
        	sc.close();
        }
		finally {
			sc.close();
			System.out.println("Application Exited");
		}
	}
	
	private static void configureFactories()
	{
		FanFactory.setFanFactory(new DefaultFanFactory());
		sc = new Scanner(System.in);
	}

}
