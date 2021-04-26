public abstract class FanFactory {
	private static FanFactory uniqueInstance;

	protected FanFactory(){
	}

	public static FanFactory instance(){
		return uniqueInstance;
	}
	
	public static void setFanFactory(FanFactory factory){
		uniqueInstance = factory;
	}
	
	public abstract IFan makeFan();
    public abstract IFan makeFan(long maxSpeed);
    public abstract IFan makeFan(String direction);
    public abstract IFan makeFan(long maxSpeed, String direction);

}
