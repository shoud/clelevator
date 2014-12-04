package simulation.elevator.traffic.imp_traffic;

import simulation.elevator.elevator_UI.int_elevator_UI.IElevatorUI;
import simulation.elevator.traffic.int_traffic.ITraffic;

public class TrafficFactoryImplementation {
	
	public static ITraffic createTraffic(IElevatorUI elevatorUI){
		return new DummyTraffic(elevatorUI);
	}

}
