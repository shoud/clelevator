/**
 * LogicalView/simulation/elevator/traffic/imp_traffic/User.java
 *
 * File generated from the Ascenseur::LogicalView::simulation.elevator::traffic::imp_traffic::User uml Class
 * Generated by the Acceleo UML 2.1 to Java generator module (Obeo)
 * $ Date : 24/11/14 15:55:29 (24 novembre 2014) $
 */
package simulation.elevator.traffic.imp_traffic;

import simulation.elevator.Sequencer.int_sequencer.IEvent;
import simulation.elevator.traffic.int_traffic.IUser;
import simulation.elevator.commonType.Direction;
import simulation.elevator.elevator_UI.int_elevator_UI.ElevatorUIFactory;
import simulation.elevator.elevator_UI.int_elevator_UI.IPushableButton;

// Start of user code to add imports for User
 
// End of user code

/**
 * Description of the class User.
 */

public class DummyUser implements IUser, IEvent {
		
	private int id; //Identifiant de l'utilisateur
	private int etageDepart;
	private int etageFin;
	private long dateDepart;
	private long dateArrive;
	private boolean called;
	
	
	/**
	* Constructor.
	*/
	public DummyUser(int id, int etageDepart, int etageFin, long dateDepart)
	{
		super();
		this.id = id;
		this.etageDepart = etageDepart;
		this.etageFin = etageFin;
		this.dateDepart = dateDepart;
		called = false;
	}
	/**
	 * Permet de g�rer les evenements.
	 * D'appeller un ascenseur.
	 * @param T
	 */
	public void display(long T)
	{
		System.out.println(this.id + " appel un ascenseur au " + this.etageDepart + " �tage");
	}
	/**
	 * Permet de renvoyer l'identifiant de l'utilisateur.
	 * @return id L'identifiant de l'utilisateur.
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * Permet de renvoyer l'étage de départ.
	 * @return etageDepart L'étage de départ de l'utilisateur.
	 */
	public int getEtageDepart()
	{
		return etageDepart;
	}
	/**
	 * Permet de renvoyer l'étage de destination de l'utilisateur.
	 * @return etageFin L'étage où veut se rendre l'utilisateur.
	 */
	public int getEtageFin()
	{
		return etageFin;
	}
	/**
	 * Permet de renvoyer l'étage de depart de l'utilisateur.
	 * @return dateDepart L'étage de départ de l'utilisateur.
	 */
	public long getDateDepart()
	{
		return dateDepart;
	}
	/**
	 * Permet de mettre à jour la date d'arrivé de l'utilisateur.
	 * @param dateArrive La date d'arrivé de l'utilisateur.
	 */
	public void setDateArrive(long dateArrive)
	{
		this.dateArrive = dateArrive;
	}
	/**
	 * Permet de mettre la variable called � true.
	 */
	public void setCalled()
	{
		Direction direction = null;
		called = true;
		if((etageDepart - etageFin) > 0)
			direction = Direction.DOWN;
		else
			direction = Direction.UP;
		//L'utilisateur appui sur le bouton d'appel de l'ascenseur.
		ElevatorUIFactory.createElevatorUI().callElevator(etageDepart,direction);
	}
	/**
	 * Permet de savoir si l'utilisateur a d�j� pris l'ascenseur.
	 * @return true Si l'utilisateur a d�j� pris l'ascenseur.
	 * @return false Si l'utilisateur n'a pas encor pris l'ascenseur.
	 */
	public boolean getCalled()
	{
		return called;
	}
	/**
	 * Permet de renvoyer la date d'arrivé de l'utilisateur.
	 * @return dateArrive La date d'arrivé de l'utilisateur.
	 */
	public long getDateArrive()
	{
		return dateArrive;
	}
	@Override
	public void trigger(long t) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @uml.property  name="iPushableButton1"
	 * @uml.associationEnd  inverse="dummyUser1:simulation.elevator.elevator_UI.int_elevator_UI.IPushableButton"
	 */
	private IPushableButton iPushableButton1;

	/**
	 * Getter of the property <tt>iPushableButton1</tt>
	 * @return  Returns the iPushableButton1.
	 * @uml.property  name="iPushableButton1"
	 */
	public IPushableButton getIPushableButton1() {
		return iPushableButton1;
	}
	/**
	 * Setter of the property <tt>iPushableButton1</tt>
	 * @param iPushableButton1  The iPushableButton1 to set.
	 * @uml.property  name="iPushableButton1"
	 */
	public void setIPushableButton1(IPushableButton iPushableButton1) {
		this.iPushableButton1 = iPushableButton1;
	}
	/**
	 * @uml.property  name="iPushableButton2"
	 * @uml.associationEnd  inverse="dummyUser1:simulation.elevator.elevator_UI.int_elevator_UI.IPushableButton"
	 */
	private IPushableButton iPushableButton2;

	/**
	 * Getter of the property <tt>iPushableButton2</tt>
	 * @return  Returns the iPushableButton2.
	 * @uml.property  name="iPushableButton2"
	 */
	public IPushableButton getIPushableButton2() {
		return iPushableButton2;
	}
	/**
	 * Setter of the property <tt>iPushableButton2</tt>
	 * @param iPushableButton2  The iPushableButton2 to set.
	 * @uml.property  name="iPushableButton2"
	 */
	public void setIPushableButton2(IPushableButton iPushableButton2) {
		this.iPushableButton2 = iPushableButton2;
	}
	@Override
	public int getLevelSelected() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}
}