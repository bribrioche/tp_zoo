package zoo;

import java.util.ArrayList;
import java.util.List;

import zoo.animal.Animal;
import zoo.animal.TypeAnimal;
import zoo.exception.AnimalDansMauvaisSecteurException;

public class Secteur implements Comparable<Secteur>{

	private TypeAnimal typeAnimauxDansSecteur;
	private List<Animal> animauxDansSecteur;
	
	public Secteur(TypeAnimal type) {
		typeAnimauxDansSecteur = type;
		animauxDansSecteur = new ArrayList<Animal>();
	}
	
	public void ajouterAnimal(Animal add) throws AnimalDansMauvaisSecteurException {
		if(add.getTypeAnimal() != typeAnimauxDansSecteur) {
			throw new AnimalDansMauvaisSecteurException();
		}
		animauxDansSecteur.add(add);
	}

	public TypeAnimal obtenirType() {
		return typeAnimauxDansSecteur;
	}

	public int getNombreAnimaux() {
		return animauxDansSecteur.size();
	}
	
	public int compareTo(Secteur secteur){
        if (this.getNombreAnimaux()>secteur.getNombreAnimaux()){ return 1; }
        else if (this.getNombreAnimaux()== secteur.getNombreAnimaux()){ return 0; }
        else { return -1; }
    }
}
