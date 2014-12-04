/**
 * LogicalView/simulation/elevator/moveOptimizer/imp_moveOptimizer/MoveOptimizer.java
 *
 * File generated from the Ascenseur::LogicalView::simulation.elevator::moveOptimizer::imp_moveOptimizer::MoveOptimizer uml Class
 * Generated by the Acceleo UML 2.1 to Java generator module (Obeo)
 * $ Date : 24/11/14 15:55:30 (24 novembre 2014) $
 */
package simulation.elevator.moveOptimizer.imp_moveOptimizer;

// Start of user code to add imports for MoveOptimizer
 
import java.util.ArrayList;

import simulation.elevator.commonType.Direction;
import simulation.elevator.elevator.int_elevator.IElevator;
import simulation.elevator.elevator_UI.imp_elevator_UI.ElevatorUI;
import simulation.elevator.moveOptimizer.int_moveOptimizer.IMoveOptimizer;

// End of user code

/**
 * Description of the class MoveOptimizer..
 *
 */

public class DummyMoveOptimizer implements IMoveOptimizer {

	IElevator elevator;
	ArrayList<DummyRequetCall> listCallLevel;
	
	public DummyMoveOptimizer(IElevator elevator) {
		listCallLevel = new ArrayList<DummyRequetCall>();
		this.elevator = elevator;
	}
	
	@Override
	public void registerCallLevel(int level, Direction direction){
		System.out.println("Bonjour je suis dans moveOptimizer  " + listCallLevel.isEmpty());
		listCallLevel.add(new DummyRequetCall(level, direction));
		System.out.println("Bonjour je suis dans moveOptimizer  " + listCallLevel.isEmpty());
	}

	@Override
	public void updatePosition(){
		//elevatorInfo = new ElevatorInfoFactory().createElevatorInfo(elevatorCommand);
		//elevatorInfo.setDirection(Direction.DOWN);
		//elevatorInfo.setElevatorState(ElevatorState.MOVING);
	}

	@Override
	public ElevatorUI getElevatorUI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setElevatorUI(ElevatorUI elevatorUI) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trigger(long t) {
		//System.out.println("Bonjour je suis dans moveOptimizer  " + listCallLevel.isEmpty());
		
		if(!listCallLevel.isEmpty())
		{
			//for(DummyRequetCall rq : listCallLevel)
				//System.out.println("Appel de l'ascenseur de l'�tage : " + rq.getLevel() + " De direction = " + rq.getDirection());
		}
		
	}

}