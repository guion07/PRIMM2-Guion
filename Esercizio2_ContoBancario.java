class ContoBancario {
    private String numeroConto;
    private double saldo;
    public String titolare;

    public ContoBancario(String numeroConto, String titolare, double saldo) {
        this.numeroConto = numeroConto;
        this.saldo = saldo;
        this.titolare = titolare;
    }

    public double getsaldo() {
        return saldo;
    }

    public void setsaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Errore: il saldo non può essere negativo");
        }
    }

    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Deposito di " + importo + " effettuato. Nuovo saldo: " + saldo);
        } else {
            System.out.println("Errore: l'importo deve essere positivo");
        }
    }

    public void prelievo(double importo) {
        if (importo > 0) {
            if (saldo >= importo) {
                saldo -= importo;
                System.out.println("Prelievo di " + importo + " effettuato. Nuovo saldo: " + saldo);
            } else {
                System.out.println("Errore: Saldo insufficiente per prelevare " + importo);
            }
        } else {
            System.out.println("Errore: L'importo del prelievo deve essere positivo.");
        }
    }
}

public class Esercizio2_ContoBancario {
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario("12345", "Mario Rossi", 1000);
        System.out.println("Saldo iniziale: " + conto.getsaldo());
        conto.deposita(500);
        conto.prelievo(200);
        conto.prelievo(2000);
    }
}
