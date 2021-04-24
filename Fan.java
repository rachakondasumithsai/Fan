public class Fan {
	private static Fan instance;
	private int currentFanSpeed;
	private String currentFanDirection;
	private static final String FORWARD = "FORWARD";
	private static final String REVERSE = "REVERSE";

    private Fan(){
        this.currentFanSpeed = 0;
        this.currentFanDirection = FORWARD;
    	System.out.println("Fan is installed and powered on");
    }

    public static Fan getInstance() {
    	if(instance == null){
            instance = new Fan();
        }
        return instance;
    }
    
    private int getCurrentFanSpeed() {
        return currentFanSpeed;
    }

    private void setCurrentFanSpeed(int currentFanSpeed) {
        this.currentFanSpeed = currentFanSpeed;
    }
    
    private String getCurrentFanDirection() {
        return currentFanDirection;
    }
    
    private void setCurrentFanDirection(String currentFanDirection) {
        this.currentFanDirection = currentFanDirection;
    }


    public void changeFanSpeed(){
        int currentSpeed = this.getCurrentFanSpeed();
    	this.setCurrentFanSpeed(((++currentSpeed) % 4));
    }

    
    public void changeFanDirection(){
        if (this.getCurrentFanDirection().equals(FORWARD)) {
			this.setCurrentFanDirection(REVERSE);
		}
        else {
        	this.setCurrentFanDirection(FORWARD);
        }
    }
    
    public void printSpeed() {
    	System.out.println();
    	if(this.getCurrentFanSpeed() == 0) {
    		System.out.print("Current Speed: OFF");
    	}
    	else {
    		System.out.print("Current Speed: " + this.getCurrentFanSpeed());
    	}
    }
    
    public void printDirection() {
    	System.out.println("\tCurrent Direction: " + this.getCurrentFanDirection());
    	System.out.println();
    }

}
