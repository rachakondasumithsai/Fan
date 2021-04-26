public interface IFan {
	public void setDefaults();
	public long getCurrentFanSpeed();
	public void setCurrentFanSpeed(long currentFanSpeed);
	public String getCurrentFanDirection();
	public void setCurrentFanDirection(String currentFanDirection);
	public long getMaxSpeed();
	void setMaxSpeed(long maxSpeed);
	public void changeFanSpeed();
	public void changeFanDirection();
	public void printSpeed();
	public void printDirection();

}
