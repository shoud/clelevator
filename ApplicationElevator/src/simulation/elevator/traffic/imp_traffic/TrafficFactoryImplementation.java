package simulation.elevator.traffic.imp_traffic;

import simulation.elevator.traffic.int_traffic.ITraffic;

public class TrafficFactoryImplementation {
	
	public static ITraffic createTraffic(){
		return new DummyTraffic();
	}

}
