package cat.ilg;

import java.util.ArrayList;
import java.util.Scanner;

public class MainParte3 {

    public static void main(String[] args) throws Exception{
        
        ArrayList<Institut> instituts = new ArrayList<Institut>();

        Scanner input = new Scanner(System.in); 
        int key = 0;
        int key2 = 0;
        String keyNom = "";
        String keyDni = "";
        float keySou = 0;

        while (key != 6) {
            System.out.println("Introdueix el número de l'acció que vulguis fer:");
            System.out.println("1) Veure la llista d'Instituts");
            System.out.println("2) Veure la informació completa d'un Institut");
            System.out.println("3) Afegir persona a un Institut");
            System.out.println("4) Eliminar un Institut");
            System.out.println("5) Crear un Institut");
            System.out.println("6) Sortir del programa");

            try {
                key = input.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
                key = 0;
            } 
            input.nextLine();
            switch (key) {
                case 1:
                    if (instituts.size() == 0) {
                        System.out.println("Encara no hi ha cap institut");
                        break;
                    } 
                    for (Institut institut : instituts) {
                        System.out.println(institut.getNom());
                    }
                    break;
                case 2:
                    if (instituts.size() == 0) {
                        System.out.println("Encara no hi ha cap institut");
                    break;
                    } 
                    System.out.println("Escriu el numero de l'institut que vols consultar: ");
                    key = input.nextInt();
                    instituts.get(key-1).imprimirInformacio();
                    input.nextLine();
                    break;
                case 3:
                    if (instituts.size() == 0) {
                        System.out.println("Encara no hi ha cap institut");
                        break;
                    } 

                    System.out.println("Escriu el numero de l'institut que vols editar: ");
                    key2 = input.nextInt();
                    input.nextLine();
                    System.out.println("Introdueix el número del tipus de persona que vols afegir:");
                    System.out.println("1) Estudiant");
                    System.out.println("2) Professor");
                    System.out.println("3) Substitut");
                    key = input.nextInt();
                    input.nextLine();
                    
                    if(key == 1) {
                        System.out.println("Introdueix el nom:");
                        keyNom = input.nextLine();

                        System.out.println("Introdueix el DNI:");
                        keyDni = input.nextLine();

                        Estudiant e1 = new Estudiant();
                        e1.canviarNom(keyNom);
                        e1.assignarDni(keyDni);
                        
                        instituts.get(key2 - 1).afegirPersona(e1);

                    } else if (key == 2) {
                        System.out.println("Introdueix el nom:");
                        keyNom = input.nextLine();
                        
                        System.out.println("Introdueix el DNI:");
                        keyDni = input.nextLine();

                        System.out.println("Introdueix el sou:");
                        keySou = input.nextFloat();
                        input.nextLine();

                        Professor p1 = new Professor();
                        p1.canviarNom(keyNom);
                        p1.assignarDni(keyDni);
                        p1.canviarSou(keySou);

                        instituts.get(key2 - 1).afegirPersona(p1);

                    } else {
                        System.out.println("Introdueix el nom:");
                        keyNom = input.nextLine();

                        System.out.println("Introdueix el DNI:");
                        keyDni = input.nextLine();

                        System.out.println("Introdueix el sou:");
                        keySou = input.nextFloat();
                        input.nextLine();

                        ProfessorSubstitut ps1 = new ProfessorSubstitut();
                        ps1.canviarNom(keyNom);
                        ps1.assignarDni(keyDni);
                        ps1.canviarSou(keySou);

                        instituts.get(key2 - 1).afegirPersona(ps1);
                    }

                    if(key > 0 && key < 4) System.out.println("Persona afegida correctament");
                    else System.out.println("Numero no correcte");

                    break;
                case 4:
                    if (instituts.size() == 0) {
                        System.out.println("Encara no hi ha cap institut");
                        break;
                    } 

                    System.out.println("Escriu el número de l’Institut que vols eliminar:");
                    key = input.nextInt();
                    input.nextLine();

                    if(instituts.size() >= key - 1) {
                        instituts.remove(key - 1);
                        System.out.println("S'ha elimitat l'institut correctament.");
                    }
                    

                    break;
                case 5:
                    System.out.println("Escriu el nom de l’Institut:");
                    keyNom = input.nextLine(); 
                    if(keyNom != "") {
                        Institut i1 = new Institut();
                        i1.canviarNom(keyNom);
                        instituts.add(i1);
                    }

                    break;
                case 6:
                    System.out.println("Gràcies per utilitzar aquest programa.");
                    break;
                default:
                    System.out.println("Aquesta opció no existeix.");
                    break;
            }
            System.out.println("");
        }

        input.close();
    }
}
