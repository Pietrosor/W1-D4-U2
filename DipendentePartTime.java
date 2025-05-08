public class DipendentePartTime extends Dipendente{
    private final double pagaOraria;
    private final int oreLavorate;

    public DipendentePartTime(int matricola,  Dipartimento dipartimento, double pagaOraria, int oreLavorate) {
        super(matricola, dipartimento);
        this.pagaOraria = pagaOraria;
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return pagaOraria * oreLavorate;
    }

}
