package simulation.elevator.elevator_UI.int_elevator_UI;

import simulation.elevator.elevator_UI.imp_elevator_UI.ConfigElevatorUIFactoryImplementation;


public class ConfigElevatorUIFactory {

		
		/**
		 */
		public static IConfigElevatorUI createConfigElevatorUI(){
			
			return ConfigElevatorUIFactoryImplementation.createConfigElevatorUI();
		}

}
