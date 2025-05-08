public class Main {
    public static void main(String[] args) {

        Dipendente dipendente1 = new DipendenteFullTime(10, Dipendente.Dipartimento.VENDITE, 2000);
        Dipendente dipendente2 = new DipendentePartTime(11, Dipendente.Dipartimento.AMMINISTRAZIONE, 15, 120);
        Dipendente dipendente3 = new Dirigente(12, Dipendente.Dipartimento.PRODUZIONE, 2200, 500);


        Volontario volontario1 = new Volontario("Alice", 25, "Esperienza in volontariato sociale");
        Volontario volontario2 = new Volontario("Marco", 30, "Esperienza in eventi benefici");


        Lavoratore[] lavoratori = {dipendente1, dipendente2, dipendente3, volontario1, volontario2};


        System.out.println("Check-in dei lavoratori:");
        for (Lavoratore lavoratore : lavoratori) {
            lavoratore.checkIn();
        }


    }
    }

