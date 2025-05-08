public class Dirigente extends Dipendente{
    private final double stipendioBase;
    private final double bonus;

    public Dirigente(int matricola,  Dipartimento dipartimento, double stipendioBase, double bonus) {
        super(matricola, dipartimento);
        this.stipendioBase = stipendioBase;
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return stipendioBase + bonus;
    }

}
