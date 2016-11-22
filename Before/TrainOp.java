package TrainStateDemo.Before;

public class TrainOp {
	
	private String station;
	
	public TrainOp() {
		station = "Los Angeles Station";
	}
	
	public String getStation() {
		return station;
	}
	
	public void goNorth() {
		if (station.equals("Los Angeles Station")) {
			station = "San Francisco Station";
		} else if (station.equals("San Francisco Station")) {
			System.out.println("End of line reached. You cannot go further north.");
		} else if (station.equals("San Diego Station")) {
			station = "Los Angeles Station";
		}
	}
	
	public void goSouth() {
		if (station.equals("Los Angeles Station")) {
			station = "San Diego Station";
		} else if (station.equals("San Francisco Station")) {
			station = "Los Angeles Station";
		} else if (station.equals("San Diego Station")) {
			System.out.println("End of line reached. You cannot go further south.");
		}
	}
}
