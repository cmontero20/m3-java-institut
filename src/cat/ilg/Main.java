package cat.ilg;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona p = new Persona();
        // p.nom = "César";
        // p.dni = "666X"
        p.canviarNom("César");
        p.asignarDni("6666");
        System.out.println(p.getNom());
        System.out.println(p.getDni());
        System.out.println(p.obtenirDades());
    }
}
