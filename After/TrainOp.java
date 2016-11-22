package TrainStateDemo.After;

public class TrainOp {

	private TrainState station;
		
	public TrainOp() {
		station = new LosAngelesStation();
	}
	
	public void setStation (TrainState station) {
		this.station = station;
	}
	
	public String getStation() {
		return station.getStation(this);
	}
	
	public void goNorth() {
		station.goNorth(this);
	}
	
	public void goSouth() {
		station.goSouth(this);
	}
	
}
