package TrainStateDemo.After;

public class SanDiegoStation implements TrainState{

	private String station = "**San Diego Station**";
	
	@Override
	public String getStation(TrainOp Wrapper) {
		// TODO Auto-generated method stub
		return station;
	}
	
	@Override
	public void goNorth(TrainOp wrapper) {
		// TODO Auto-generated method stub
		wrapper.setStation(new LosAngelesStation());
	}

	@Override
	public void goSouth(TrainOp wrapper) {
		// TODO Auto-generated method stub
		wrapper.setStation(new SanDiegoStation());
		System.out.println("End of line reached. You cannot go further south.");
	}
	
}
