public abstract class Dipendente implements Lavoratore {
    public enum Dipartimento {
        PRODUZIONE, AMMINISTRAZIONE, VENDITE
    }

    private final int matricola;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }



    public abstract double calculateSalary();
    @Override
    public void checkIn() {
        System.out.println("Dipendente con matricola " + matricola + " ha iniziato il turno di lavoro.");
    }

}