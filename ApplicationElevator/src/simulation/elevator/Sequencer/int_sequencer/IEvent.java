package simulation.elevator.Sequencer.int_sequencer;

/**
 * Interface Event pour le trigger.
 */
public interface IEvent
{
	/**
	 * Trigger.
	 * @param t la date pour r�veiller l'utilisateur.
	 */
	public abstract void trigger(long t);
}
