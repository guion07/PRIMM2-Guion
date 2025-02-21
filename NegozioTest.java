class Prodotto {
    private String nome;
    private double prezzo;
    private int quantita;

    public Prodotto(String nome, double prezzo, int quantita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo >= 0) {
            this.prezzo = prezzo;
        } else {
            System.out.println("Il prezzo non può essere negativo.");
        }
    }

    public void acquista(int pezzi) {
        if (pezzi <= quantita) {
            quantita -= pezzi;
            System.out.println("Acquisto di " + pezzi + " " + nome + "(i) effettuato. Quantità rimasta: " + quantita);
        } else {
            System.out.println("Quantità insufficiente per l'acquisto.");
        }
    }

    public void rifornisci(int pezzi) {
        quantita += pezzi;
        System.out.println("Rifornimento di " + pezzi + " " + nome + "(i) effettuato. Quantità disponibile: " + quantita);
    }

    public void mostraDettagli() {
        System.out.println("Nome: " + nome);
        System.out.println("Prezzo: €" + prezzo);
        System.out.println("Quantità disponibile: " + quantita);
    }
}

public class NegozioTest {
    public static void main(String[] args) {
        Prodotto p = new Prodotto("Laptop", 1200.50, 10);
        p.mostraDettagli();
        p.acquista(3);
        p.rifornisci(5);
        p.acquista(12);
    }
}
