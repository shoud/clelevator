/**
 * LogicalView/simulation/elevator/traffic/imp_traffic/Traffic.java
 *
 * File generated from the Ascenseur::LogicalView::simulation.elevator::traffic::imp_traffic::Traffic uml Class
 * Generated by the Acceleo UML 2.1 to Java generator module (Obeo)
 * $ Date : 24/11/14 15:55:29 (24 novembre 2014) $
 */
package simulation.elevator.traffic.imp_traffic;

// Start of user code to add imports for Traffic
import java.util.ArrayList;
import java.util.Random;

import simulation.elevator.Sequencer.imp_sequencer.DisplayEvent;
import simulation.elevator.Sequencer.imp_sequencer.SequencerException;
import simulation.elevator.Sequencer.int_sequencer.SequencerFactory;
import simulation.elevator.traffic.int_traffic.ITraffic;
import simulation.elevator.traffic.int_traffic.IUser;


// End of user code

/**
 * Description of the class Traffic.
 */
public class DummyTraffic implements ITraffic {
		/**
		 * Constructor.
		 */
		private static int id;
		private ArrayList<IUser> listUser;
		/**
		 * Constructeur de la classe trafic.
		 * Itialisation de id à 0.
		 */
		public DummyTraffic()
		{
			super();
			id = 0;
			//addUser(nbUtilisateur, nbEtage)
		}
		/**
		 * Pour la version bidon, permet de créer une liste d'utilisateur.
		 */
		public void addUser(int nbUtilisateur, int nbEtage)
		{	
			//Instanciation de la liste d'utilisateur.
			listUser = new ArrayList<IUser>();
			
			DummyUser user;
			DisplayEvent displayEvent;
			
			int etageDepart, etageArrive;
			long dateDepart = System.currentTimeMillis();
			Random rd = new Random();
			etageDepart = rd.nextInt(nbEtage);
			
			for(int i = 0; i < nbUtilisateur;i++)
			{
				//On met à jour l'étage d'arrivé.
				if(etageDepart >= nbEtage/2)
					etageArrive = etageDepart - nbEtage/2;
				else
					etageArrive = etageDepart + nbEtage/2;
				//On met à jour la date de départ
				dateDepart += 1000;
				//On ajoute un utilisateur.
				//Creation d'un nouvel objet "Horloge".
				user = new DummyUser(id,etageDepart,etageArrive,dateDepart);
				listUser.add(new DummyUser(id,etageDepart,etageArrive ,dateDepart));
				//On met à jour l'étage de départ du prochain utilisateur.
				if(etageDepart != nbEtage-1)
					etageDepart++;
				else
					etageDepart = 0;
				id++;
			}
		}
		/**
		 * Permet de renvoyer la liste d'utilisateur.
		 * @return listUser la liste des utilisateurs.
		 */
		public ArrayList<IUser> getListUser()
		{
			return listUser;
		}

		@Override
		public void trigger(long date)
		{
			for(IUser user : listUser)
			{
				if((user.getDateDepart() < date) && !user.getCalled())
				{
					user.setCalled();
					System.out.println("Appel de l'ascenseur de l'�tage : " + user.getEtageDepart());
				}
			}
			
		}
}