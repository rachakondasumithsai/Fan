public class Fan implements IFan{
	private long currentFanSpeed;
	private String currentFanDirection;
	private static final String FORWARD = "FORWARD";
	private static final String REVERSE = "REVERSE";
	private long maxSpeed;

    public Fan(){
        this.currentFanSpeed = 0;
        this.currentFanDirection = FORWARD;
        this.setMaxSpeed(3);
        System.out.println("Fan is installed and powered on. Max Speed is "
                + (this.getMaxSpeed()-1) + " Current Direction is " + this.getCurrentFanDirection());
    }
    
    public Fan(long maxSpeed){
        this.currentFanSpeed = 0;
        this.currentFanDirection = FORWARD;
        this.setMaxSpeed(maxSpeed);
        System.out.println("Fan is installed and powered on. Max Speed is "
                + (this.getMaxSpeed()-1) + " Current Direction is " + this.getCurrentFanDirection());
    }
    
    public Fan(long maxSpeed, String direction){
        this.currentFanSpeed = 0;
        this.setMaxSpeed(maxSpeed);
        if(direction.equalsIgnoreCase(FORWARD)||direction.equalsIgnoreCase(REVERSE)){
        	this.setCurrentFanDirection(direction.toUpperCase());
        }
        else {
        	System.out.println("Invalid input, Setting default direction FORWARD");
        	this.setCurrentFanDirection(FORWARD);
        }
    	System.out.println("Fan is installed and powered on. Max Speed is "
        + (this.getMaxSpeed()-1) + " Current Direction is " + this.getCurrentFanDirection());
    }
    
    public Fan(String direction){
        this.currentFanSpeed = 0;
        this.setMaxSpeed(maxSpeed);
        if(direction.equalsIgnoreCase(FORWARD)||direction.equalsIgnoreCase(REVERSE)){
        	this.setCurrentFanDirection(direction.toUpperCase());
        }
        else {
        	System.out.println("Invalid input, Setting default direction FORWARD");
        	this.setCurrentFanDirection(FORWARD);
        }
        System.out.println("Fan is installed and powered on. Max Speed is "
                + (this.getMaxSpeed()-1) + " Current Direction is " + this.getCurrentFanDirection());
    }

    @Override
    public long getCurrentFanSpeed() {
        return currentFanSpeed;
    }

    @Override
    public void setCurrentFanSpeed(long currentFanSpeed) {
        this.currentFanSpeed = currentFanSpeed;
    }
    
    @Override
    public String getCurrentFanDirection() {
        return currentFanDirection;
    }
    
    @Override
    public void setCurrentFanDirection(String currentFanDirection) {
        this.currentFanDirection = currentFanDirection;
    }


    @Override
    public void changeFanSpeed(){
        long currentSpeed = this.getCurrentFanSpeed();
    	this.setCurrentFanSpeed(((++currentSpeed) % maxSpeed));
    }

    
    @Override
    public void changeFanDirection(){
        if (this.getCurrentFanDirection().equals(FORWARD)) {
			this.setCurrentFanDirection(REVERSE);
		}
        else {
        	this.setCurrentFanDirection(FORWARD);
        }
    }
    
    @Override
    public void printSpeed() {
    	System.out.println();
    	if(this.getCurrentFanSpeed() == 0) {
    		System.out.print("Current Speed: OFF");
    	}
    	else {
    		System.out.print("Current Speed: " + this.getCurrentFanSpeed());
    	}
    }
    
    @Override
    public void printDirection() {
    	System.out.println("\tCurrent Direction: " + this.getCurrentFanDirection());
    	System.out.println();
    }

    @Override
    public long getMaxSpeed() {
		return maxSpeed;
	}

	@Override
	public void setMaxSpeed(long maxSpeed) {
		if(maxSpeed>0) {
			this.maxSpeed = ++maxSpeed;
		}
		else {
			System.out.println("Invalid max speed, setting max speed to default 3");
			this.maxSpeed = 4;
		}
	}

	@Override
	public void setDefaults() {
		this.maxSpeed = 3;
		this.currentFanSpeed = 0;
		this.currentFanDirection = Fan.FORWARD;
		
	}

}
