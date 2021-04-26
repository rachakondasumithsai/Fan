public class DefaultFanFactory extends FanFactory{

	public DefaultFanFactory(){
		super();
	}
	
	@Override
	public IFan makeFan() {
		return new Fan();
	}

	@Override
	public IFan makeFan(long maxSpeed) {
		return new Fan(maxSpeed);
	}

	@Override
	public IFan makeFan(String direction) {
		return new Fan(direction);
	}

	@Override
	public IFan makeFan(long maxSpeed, String direction) {
		return new Fan(maxSpeed, direction);
	}
	

}
