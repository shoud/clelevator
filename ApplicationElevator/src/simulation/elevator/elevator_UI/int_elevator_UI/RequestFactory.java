package simulation.elevator.elevator_UI.int_elevator_UI;

import simulation.elevator.elevator_UI.imp_elevator_UI.requestFactoryImplementation;



public class RequestFactory {

		
		/**
		 */
		public static IRequest createRequest(){
			return requestFactoryImplementation.createRequest();
		}

}
