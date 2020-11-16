package zoo;

import zoo.animal.Chat;

import zoo.animal.TypeAnimal;
import zoo.exception.AnimalDansMauvaisSecteurException;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import zoo.animal.TypeAnimal;
import zoo.exception.AnimalDansMauvaisSecteurException;

public class App {
	  public static void main(String[] args) throws AnimalDansMauvaisSecteurException, IOException {
	      final Logger logger = LogManager.getLogger(App.class);
	      
	      logger.trace("Entering application.");
	      Zoo zoo1 = new Zoo();
	      
	          zoo1.ajouterSecteur(TypeAnimal.CHAT);
	          zoo1.ajouterSecteur(TypeAnimal.CHIEN);
	          zoo1.ajouterSecteur(TypeAnimal.CHAT);
	          zoo1.ajouterSecteur(TypeAnimal.CHIEN);
	      zoo1.ajouterSecteur(TypeAnimal.CHIEN);
	      
	      zoo1.nouvelAnimal(new Chat("Felix"));
	      zoo1.nouvelAnimal(new Chat("Chaton"));
	      zoo1.nouvelAnimal(new Chat("Malot"));
	      zoo1.nouvelAnimal(new Chat("Griffe"));
	      zoo1.nouvelAnimal(new Chat("LeChat"));
	      zoo1.nouvelAnimal(new Chat("Truc"));

	      System.out.println(zoo1.nombreAnimaux());
	      logger.fatal("Exiting application.");
	      
	      interfaceUtilisateur();
	      }
	  
	  private static void interfaceUtilisateur() throws IOException {
			Zoo zoo = new Zoo();
			zoo.setName("superZoo");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			boolean flag = true;
			
			while(flag) {
				menu(zoo);
				String s = br.readLine();
				switch(s) {
				case "1":
					System.out.println("Quel est le nouveau nom du zoo ?");
					String name = br.readLine();
					zoo = new Zoo();
					zoo.setName(name);
					System.out.println("Zoo " + name + " cree !");
				break;
				}
				
			}
		}
	  
	  private static void menu(Zoo zoo) {
		  System.out.println("" + zoo.getName() + " : Que souhaitez-vous faire ?");
		  System.out.println("1 : Creer un nouveau zoo");
		  System.out.println("2 : Ajouter un nouveau secteur");
		  System.out.println("3 : Ajouter un  nouvel animal");
		  System.out.println("4 : Renommer votre zoo");
		  System.out.println("5 : Sauvegarder mon zoo");
		  System.out.println("0 : Pour quitter");
		  System.out.println("votre choix");
	  }
	}
