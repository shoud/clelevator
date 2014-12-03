/**
 * LogicalView/fr/univavignon/m1ilsen/aa/simula/Sequencer/imp_sequencer/Sequencer.java
 *
 * File generated from the Ascenseur::LogicalView::simulation.elevator::Sequencer::imp_sequencer::Sequencer uml Class
 * Generated by the Acceleo UML 2.1 to Java generator module (Obeo)
 * $ Date : 24/11/14 16:04:25 (24 novembre 2014) $
 */
package simulation.elevator.Sequencer.imp_sequencer;

// Start of user code to add imports for Sequencer
 
import java.util.ArrayList;

import simulation.elevator.Sequencer.int_sequencer.IEvent;
import simulation.elevator.Sequencer.int_sequencer.ISequencer;
import simulation.elevator.Sequencer.int_sequencer.ISequencable;

// End of user code

/**
 * Description of the class Sequencer.
 * @uml.dependency   supplier="simulation.elevator.traffic.int_traffic.IUser"
 * @uml.dependency   supplier="simulation.elevator.elevator.int_elevator.IElevatorCommand"
 */

public class DummySequencer implements ISequencer
{
		//Quand commencer la simulation.	
		protected static long debut;
		//Le temps actuel.
		protected static long temps;
		//Permet de ralentir le temps dans la simulation.
		protected static int expansion;
		//Permet d'accelerer le temps dans la simulation.
		protected static int contraction;
		//Quand doit finir la simulation.
		protected static long fin;
		//Le temps que doit que doit mettre la simulation. 
		protected static long tempSim;
		//Le temps de la machine.
		protected static long tmachine;
		//Le vector comportant tout les processus à executer.
		protected static ArrayList<Processus> listProcess;
	
	public DummySequencer(long simulationTimeOrigin,long simulationDuration, int simulationTimeExpansion, int simulationTimeContraction) {
		//On récupere les variables données en paramètre.
		debut = simulationTimeOrigin;
		temps = simulationDuration;	
		expansion = simulationTimeExpansion;
		contraction = simulationTimeContraction;
		//Creation du vector pour acceuillir les processus.
		listProcess = new ArrayList<Processus>();
		//On calcule la date de fin.
		fin = System.currentTimeMillis() + temps;
	}
	/**
	 * Permet d'ajouter des processus.
	 */
	public void addProcess(IEvent event) throws SequencerException
	{
		listProcess.add(new Processus(event));
	}
	@Override
	public void start() {
		//Variable permettant de stoper la simulation.	
				boolean simOk = true;
				//Le temps de la machine.
				long tempsMachine = System.currentTimeMillis();
				//Le temps dans la simulation.
				tempSim = tempsMachine * (expansion/contraction); 
				//Permet d'avoir la variable pour executer le processus.
				long T;
				System.out.println("simOk = " + simOk);
				//Lancement de la boucle qui permet de séquencer les processus.
				while (simOk)
				{
					for(Processus ps : listProcess)
					{ 
						T  = 10;
						//Permet de savoir si le temps dans la simulation pour le processus courant a atteind la période voulue pour écrire dans le buffer.
						if (((tempSim % T) * (expansion/contraction)) == 0)
						{
							//Permet d'écrire dans le buffeur.
							ps.getDisplayEvent().trigger(tempSim);
						}
						//On récupere le nouveau temps machine.
						tempsMachine = System.currentTimeMillis();
						//On met à jour le nouveau temps de la simulation.
						tempSim = tempsMachine * (expansion/contraction);
					}
					//On met à jour le  temps de la machine.
					tempsMachine = System.currentTimeMillis();
					//On met à jour le temps de la simulation.
					tempSim = tempsMachine * (expansion/contraction); 
					//Permet de savoir si on a atteind de temps de fin
					if (tempsMachine >= fin)
					{
						//Permet de finir la simulation.
						simOk = false;
					}	
				}
			}
}