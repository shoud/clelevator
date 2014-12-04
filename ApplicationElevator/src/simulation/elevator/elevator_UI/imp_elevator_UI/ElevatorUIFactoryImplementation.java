package simulation.elevator.elevator_UI.imp_elevator_UI;

import simulation.elevator.elevator_UI.int_elevator_UI.IElevatorUI;


public class ElevatorUIFactoryImplementation {
	public static IElevatorUI createElevatorUI(){
		return new ElevatorUI();
	}

}
