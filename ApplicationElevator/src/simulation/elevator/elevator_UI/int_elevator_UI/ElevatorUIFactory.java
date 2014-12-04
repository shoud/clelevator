package simulation.elevator.elevator_UI.int_elevator_UI;

import simulation.elevator.elevator_UI.imp_elevator_UI.ElevatorUIFactoryImplementation;

public class ElevatorUIFactory {

	public static IElevatorUI createElevatorUI(){
		return ElevatorUIFactoryImplementation.createElevatorUI();
	}
}
