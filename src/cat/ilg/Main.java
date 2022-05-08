package cat.ilg;

public class Main {

    public static void main(String[] args) throws Exception{

        Estudiant es = new Estudiant();
        es.assignarDni("1234");
        es.canviarNom("Iván");
        es.posarNota(8.3);
        es.posarNota(9.4);
        es.posarNota(7.9);
        es.posarNota(6);
        es.posarNota(7.5);
        es.posarNota(9.5);
        // System.out.println(es.getMaxima());
        // System.out.println(es.getMinima());
        // System.out.println(es.getMitjana());
        // System.out.println(es.obtenirDades());

        Estudiant es2 = new Estudiant();
        es2.assignarDni("7070");
        es2.canviarNom("César");
        es2.posarNota(9);
        es2.posarNota(9.4);
        es2.posarNota(8.3);
        es2.posarNota(7.4);
        es2.posarNota(7.5);
        es2.posarNota(8.9);

        Professor pr = new Professor();
        pr.assignarDni("9696");
        pr.canviarNom("Uri");
        pr.canviarSou(1000);
        // System.out.println(pr.obtenirDades());

        ProfessorSubstitut s = new ProfessorSubstitut();
        s.assignarDni("7777");
        s.canviarNom("Nick");
        s.canviarSou(2000);
        s.assignarSubstitucio("2021-12-12", "2022-7-15");
        // System.out.println(s.obtenirDades());

        Institut ins1 = new Institut();
        ins1.canviarNom("La Guineueta");
        ins1.afegirPersona(pr);
        ins1.afegirPersona(s);
        ins1.afegirPersona(es);
        ins1.afegirPersona(es2);
        ins1.imprimirInformacio();

        ////////////////
        // EXCEPCIONS //
        ////////////////

        // Excepció quan reassignes DNI
        try {        
            pr.assignarDni("9696");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Excepció quan la nota no es adequada
        try {        
            es.posarNota(15.7);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Excepció quan sou no es adequat
        try {        
            pr.canviarSou(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Excepció quan falta nom
        try {        
            Estudiant es2 = new Estudiant();
            es2.assignarDni("5050");
            es2.posarNota(8.3);
            System.out.println(es2.obtenirDades());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
