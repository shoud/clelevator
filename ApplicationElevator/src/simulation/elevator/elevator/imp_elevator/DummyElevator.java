/**
 * LogicalView/simulation/elevator/elevator/imp_elevator/Elevator.java
 *
 * File generated from the Ascenseur::LogicalView::simulation.elevator::elevator::imp_elevator::Elevator uml Class
 * Generated by the Acceleo UML 2.1 to Java generator module (Obeo)
 * $ Date : 24/11/14 15:55:30 (24 novembre 2014) $
 */
package simulation.elevator.elevator.imp_elevator;

// Start of user code to add imports for Elevator
 
import java.util.ArrayList;

import simulation.elevator.elevator.int_elevator.IElevatorConfigurator;
import simulation.elevator.elevator.int_elevator.IElevatorCommand;
import simulation.elevator.elevator.int_elevator.IElevatorInfo;
import simulation.elevator.moveOptimizer.int_moveOptimizer.ElevatorInfoFactory;
import simulation.elevator.traffic.int_traffic.IUser;
import simulation.elevator.elevator_UI.int_elevator_UI.ConfigElevatorUIFactory;
import simulation.elevator.elevator_UI.int_elevator_UI.IConfigElevatorUI;

// End of user code

/**
 * Description of the class Elevator.
 */

public class DummyElevator implements IElevatorCommand, IElevatorConfigurator{

	@Override
	public void setParam() {
		// TODO Auto-generated method stub
		
		ElevatorInfoFactory.createElevatorInfo(this);
		
	}

	
	@Override
	public void move(Object direction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopNextLevel() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @uml.property  name="iElevatorInfo1"
	 * @uml.associationEnd  inverse="dummyElevator:simulation.elevator.elevator.int_elevator.IElevatorInfo"
	 */
	private IElevatorInfo iElevatorInfo1;

	/**
	 * Getter of the property <tt>iElevatorInfo1</tt>
	 * @return  Returns the iElevatorInfo1.
	 * @uml.property  name="iElevatorInfo1"
	 */
	public IElevatorInfo getIElevatorInfo1() {
		return iElevatorInfo1;
	}


	/**
	 * Setter of the property <tt>iElevatorInfo1</tt>
	 * @param iElevatorInfo1  The iElevatorInfo1 to set.
	 * @uml.property  name="iElevatorInfo1"
	 */
	public void setIElevatorInfo1(IElevatorInfo iElevatorInfo1) {
		this.iElevatorInfo1 = iElevatorInfo1;
	}

	/**
	 * @uml.property   name="iconfigElevatorUI1"
	 * @uml.associationEnd   inverse="dummyElevator:simulation.elevator.elevator_UI.int_elevator_UI.IConfigElevatorUI"
	 */
	private IConfigElevatorUI iconfigElevatorUI1;

	/**
	 * Getter of the property <tt>iconfigElevatorUI1</tt>
	 * @return  Returns the iconfigElevatorUI1.
	 * @uml.property  name="iconfigElevatorUI1"
	 */
	public IConfigElevatorUI getIconfigElevatorUI1() {
		return iconfigElevatorUI1;
	}


	/**
	 * Setter of the property <tt>iconfigElevatorUI1</tt>
	 * @param iconfigElevatorUI1  The iconfigElevatorUI1 to set.
	 * @uml.property  name="iconfigElevatorUI1"
	 */
	public void setIconfigElevatorUI1(IConfigElevatorUI iconfigElevatorUI1) {
		this.iconfigElevatorUI1 = iconfigElevatorUI1;
	}


		
		/**
		 */
		public void createUI(){
			
			ConfigElevatorUIFactory.createConfigElevatorUI();
		}

		/**
		 * @uml.property  name="iConfigElevatorUI"
		 * @uml.associationEnd  inverse="dummyElevator:simulation.elevator.elevator_UI.int_elevator_UI.IConfigElevatorUI"
		 */
		private IConfigElevatorUI iConfigElevatorUI;

		/**
		 * Getter of the property <tt>iConfigElevatorUI</tt>
		 * @return  Returns the iConfigElevatorUI.
		 * @uml.property  name="iConfigElevatorUI"
		 */
		public IConfigElevatorUI getIConfigElevatorUI() {
			return iConfigElevatorUI;
		}


		/**
		 * Setter of the property <tt>iConfigElevatorUI</tt>
		 * @param iConfigElevatorUI  The iConfigElevatorUI to set.
		 * @uml.property  name="iConfigElevatorUI"
		 */
		public void setIConfigElevatorUI(IConfigElevatorUI iConfigElevatorUI) {
			this.iConfigElevatorUI = iConfigElevatorUI;
		}


		@Override
		public void trigger(long date) {
			// TODO Auto-generated method stub
			
		}	
}