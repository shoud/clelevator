package simulation.elevator.Sequencer.imp_sequencer;

import simulation.elevator.Sequencer.int_sequencer.IEvent;
import simulation.elevator.traffic.int_traffic.IUser;


/**
 * @class DisplayEvent Classe dérivé de Event qui permet d'envoyé un evenement en fonction 
 * de la période donnée.
 *
 */
public class DisplayEvent implements IEvent
{
	//L'utilisateur
	protected IUser user;
	/**
	 * Le trigger permettant de gérer les processus
	 */
	public void trigger(long t)
	{
		//Au met la période voulue pour l'horloge donnée au constructeur.
		user.display(t);
	}
	/**
	 * Construteur de la classe DisplayEvent qui permet de lier une horloge
	 * a un trigger.
	 * @param c L'horloge liée à un trigger.
	 */
	public DisplayEvent(IUser c)
	{
		//On récupere l'horloge.
		user = c;
	}
}