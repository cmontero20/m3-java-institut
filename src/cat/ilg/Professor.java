package cat.ilg;

public class Professor extends Persona{

    private float sou;

    public void canviarSou(float sou) throws Exception {
        if (sou > 3000) throw new Exception("El sou no pot ser major de 3000");
        if (sou < 0) throw new Exception("El sou no pot ser menor que 0");
        this.sou = sou;
    }

    public float getSou() {
        return sou;
    }

    @Override
    public String obtenirDades() throws Exception {
        if (this.getDni() == null) throw new Exception("Aquesta persona no té DNI associat.");
        if (this.getNom() == null) throw new Exception("Aquesta persona no té nom associat.");

        return "Persona amb nom: " + this.getNom() + " i DNI: " + this.getDni() + " (Profe amb sou: " + sou + ")";
    }
}
