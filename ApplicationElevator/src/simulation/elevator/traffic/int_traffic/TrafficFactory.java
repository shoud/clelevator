package simulation.elevator.traffic.int_traffic;

import simulation.elevator.traffic.imp_traffic.TrafficFactoryImplementation;


public class TrafficFactory {

		
		/**
		 */
		public static ITraffic createTraffic(){
			return TrafficFactoryImplementation.createTraffic();
		}

}
