package TrainStateDemo.After;

public class LosAngelesStation implements TrainState{

	private String station = "**Los Angeles Station**";
	
	@Override
	public String getStation(TrainOp Wrapper) {
		// TODO Auto-generated method stub
		return station;
	}
	
	@Override
	public void goNorth(TrainOp wrapper) {
		// TODO Auto-generated method stub
		wrapper.setStation(new SanFranciscoStation());
	}

	@Override
	public void goSouth(TrainOp wrapper) {
		// TODO Auto-generated method stub
		wrapper.setStation(new SanDiegoStation());
	}

}
