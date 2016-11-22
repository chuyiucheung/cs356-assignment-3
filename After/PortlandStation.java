package TrainStateDemo.After;

public class PortlandStation implements TrainState{

	private String station = "**Portland Station**";

	@Override
	public String getStation(TrainOp Wrapper) {
		// TODO Auto-generated method stub
		return station;
	}
	
	@Override
	public void goNorth(TrainOp wrapper) {
		// TODO Auto-generated method stub
		wrapper.setStation(new PortlandStation());
		System.out.println("End of line reached. You cannot go further north.");
	}

	@Override
	public void goSouth(TrainOp wrapper) {
		// TODO Auto-generated method stub
		wrapper.setStation(new SanFranciscoStation());
	}
	
}
