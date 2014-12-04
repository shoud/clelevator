package simulation.elevator.traffic.int_traffic;

import simulation.elevator.elevator_UI.int_elevator_UI.IElevatorUI;
import simulation.elevator.traffic.imp_traffic.TrafficFactoryImplementation;


public class TrafficFactory {

		
		/**
		 */
		public static ITraffic createTraffic(IElevatorUI elevatorUI){
			return TrafficFactoryImplementation.createTraffic(elevatorUI);
		}

}
