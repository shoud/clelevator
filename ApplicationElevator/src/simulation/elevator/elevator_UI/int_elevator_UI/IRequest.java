/**
 * LogicalView/simulation/elevator/elevator_UI/int_elevator_UI/IRequest.java
 *
 * File generated from the Ascenseur::LogicalView::simulation.elevator::elevator_UI::int_elevator_UI::IRequest uml Interface
 * Generated by the Acceleo UML 2.1 to Java generator module (Obeo)
 * $ Date : 24/11/14 15:55:34 (24 novembre 2014) $
 */
package simulation.elevator.elevator_UI.int_elevator_UI;

import simulation.elevator.commonType.Direction;

// Start of user code to add imports for IRequest
 


// End of user code

/**
 * Description of the interface IRequest.
 *
 */

public interface IRequest {
    


    /**
     *  Description of the method getType.
     *
     *
     * @return ret
     */
   // public TypeRequest getType();

    /**
     *  Description of the method getCallType.
     *
     *
     * @return ret
     */
   /* public Direction getCallType();*/

    /**
     *  Description of the method getLevelSelected.
     *
     *
     * @return ret
     */
    public int getLevelSelected();
    public Direction getDirection();
	
	
}