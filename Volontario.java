public class Volontario implements Lavoratore{
    private final String nome;
    private final int età;
    private final String cv;

    public Volontario(String nome, int età, String cv) {
        this.nome = nome;
        this.età = età;
        this.cv = cv;
    }

    public String getNome() {
        return nome;
    }

    public int getEtà() {
        return età;
    }

    public String getCv() {
        return cv;
    }
    @Override
    public void checkIn() {
        System.out.println("Volontario " + nome + " ha iniziato il suo servizio.");
    }

}
