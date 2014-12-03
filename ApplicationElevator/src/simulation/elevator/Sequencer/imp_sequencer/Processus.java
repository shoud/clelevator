package simulation.elevator.Sequencer.imp_sequencer;

import simulation.elevator.Sequencer.int_sequencer.IEvent;

/**
 * @class Processus Permet de représenter un processus.
 * @uml.dependency   supplier="fr.univavignon.m1informatique.ml.clocksimulation.DisplayEvent"
 */
public class Processus
{
	//L'évenement lié au processus.
	protected IEvent event;
	//La période donnée au processus.
	protected long periode;
	/**
	 * Constructeur de la classe processus qui permet de récupérer la
	 * période et l'évenement pour le processus. 
	 * @param e L'évenement lié au processus.
	 * @param T La période liée au processus.
	 */
	public Processus(IEvent e)
	{
		//Récupération de l'évenement.
		event = e;
	}

	/**
	 * Permet de récupérer l'evenement.
	 * @return event L'évenement lié au processus.
	 */
	public IEvent getDisplayEvent()
	{
		return event;
	}
}