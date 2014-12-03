package simulation.elevator.elevator_UI.int_elevator_UI;

import simulation.elevator.elevator_UI.imp_elevator_UI.PushableButtonFactoryImplementation;


public class PushableButtonFactory {

		
		/**
		 */
		public static IPushableButton createPushableButton(){
			return PushableButtonFactoryImplementation.createPushableButton();
		}

}
