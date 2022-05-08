package cat.ilg;

import java.util.List;
import java.util.ArrayList;

public class Estudiant extends Persona{

    private List<Double> notas = new ArrayList<Double>();

    private double maxima;
    private double minima;
    private double mitjana;

    public void posarNota(double nota) throws Exception {
        if (nota > 10) throw new Exception("La nota no pot ser major de 10");
        if (nota < 0) throw new Exception("La nota no pot ser menor de 0");
        this.notas.add(nota);
        // Control d'errors per que no sorti 0
        minima = nota;
        // Netejem la variable
        mitjana = 0;
        for (int x = 0; x < notas.size(); x++) {
            if (maxima < notas.get(x)) {
                maxima = notas.get(x);
            }
            if (minima > notas.get(x)) {
                minima = notas.get(x);
            }
            mitjana += notas.get(x);
        }
        mitjana = mitjana/notas.size();
    }

    public double getMaxima() {
        return maxima;
    }
    public double getMinima() {
        return minima;
    }
    public double getMitjana() {
        return mitjana;
    }
    

    @Override
    public String obtenirDades() throws Exception {
        if (this.getDni() == null) throw new Exception("Aquesta persona no té DNI associat.");
        if (this.getNom() == null) throw new Exception("Aquesta persona no té nom associat.");

        return "Persona amb nom: " + this.getNom() + " i amb DNI: " + this.getDni() + " (Estudiant amb nota/es: " + notas.toString() + ")";
    }
}
