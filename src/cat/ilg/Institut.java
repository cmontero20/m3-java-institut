package cat.ilg;

import java.util.ArrayList;

public class Institut {

    private String nom;
    private ArrayList<Persona> personas = new ArrayList<Persona>();

    public String getNom() {
        return nom;
    }

    public void canviarNom(String nom) {
        this.nom = nom;
    }

    public void afegirPersona(Persona persona) {
        this.personas.add(persona);
    }


    public void imprimirInformacio() throws Exception {
        System.out.println("Institut " + nom + ". Lista de persones: ");
        for (Persona persona : personas) {
            System.out.println(persona.obtenirDades());
        }
        
    }
   

}
