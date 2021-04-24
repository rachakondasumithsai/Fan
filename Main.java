import java.util.*;

public class Main {

	private static Fan fan;
	
	public static void main(String[] args) {
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Application Started\nThis Fan has two cords 1 and 2"
				+ "\nPulling Cord-1 will change the Speed and Cord-2 will change the direction");
		System.out.println("Please Pull cord 1 or 2");
		System.out.println("To exit press 0");
		System.out.println("-------------------------------------------------------------------------------");

		Scanner sc = new Scanner(System.in);
		
		fan = Fan.getInstance();
		
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
	        		System.exit(0);
	            }
	            else{
	                System.out.println("Please Enter either 1 or 2\n");
	            }
	        }
			
		}
		catch(Exception e) {
        	System.err.println("Error Caught! Please Restart Application!");
        	e.printStackTrace();
        	sc.close();
        	System.exit(0);
        }
		finally {
			sc.close();
		}
	}

}
