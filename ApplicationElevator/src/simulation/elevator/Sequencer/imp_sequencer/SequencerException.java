package simulation.elevator.Sequencer.imp_sequencer;

/**
 * @class SequencerException Permet de gérer les Exception du séquencer
 * Elle n'est pas vraiment utilisée.
 *
 */
public final class SequencerException extends Exception {	
	/**
	 * Permet d'afficher l'érreur intervenu dans le séquencer.
	 * @param m Le message d'érreur.
	 */
	public SequencerException (String m) {
		//Permet d'appeler le constructeur qui a 1 paramètre.
		super(m);
	}
}