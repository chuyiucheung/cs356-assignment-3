package TrainStateDemo.After;

public class SanFranciscoStation implements TrainState{

	private String station = "**San Francisco Station**";
	

	@Override
	public String getStation(TrainOp Wrapper) {
		// TODO Auto-generated method stub
		return station;
	}
	
	@Override
	public void goNorth(TrainOp wrapper) {
		// TODO Auto-generated method stub
		wrapper.setStation(new PortlandStation());
	}

	@Override
	public void goSouth(TrainOp wrapper) {
		// TODO Auto-generated method stub
		wrapper.setStation(new LosAngelesStation());
	}

}
