package TrainStateDemo.After;

public interface TrainState {
	
	public String getStation(TrainOp Wrapper);
	public void goNorth(TrainOp wrapper);
	public void goSouth(TrainOp wrapper);
	
}
