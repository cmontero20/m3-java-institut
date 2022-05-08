package cat.ilg;

public class ProfessorSubstitut extends Professor{

    private String dataInici;
    private String dataFi;

    public void assignarSubstitucio(String dataInici,String dataFi)  {
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    @Override
    public String obtenirDades() throws Exception{
        if (this.getDni() == null) throw new Exception("Aquesta persona no té DNI associat.");
        if (this.getNom() == null) throw new Exception("Aquesta persona no té nom associat.");

        return "Persona amb nom: " + this.getNom() + " i DNI: " + this.getDni() + " (Profe amb sou: " + this.getSou() + ", del " + dataInici + " al " + dataFi + ")";
    }
}
