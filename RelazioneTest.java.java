public class Indirizzo {
    private String via;
    private String citta;
    private String cap;

    public Indirizzo(String via, String citta, String cap) {
        this.via = via;
        this.citta = citta;
        this.cap = cap;
    }

    public String getVia() {
        return via;
    }

    public String getCitta() {
        return citta;
    }

    public String getCap() {
        return cap;
    }

    public String getDettagli() {
        return via + ", " + citta + " - " + cap;
    }
}

public class Azienda {
    private String nome;
    private String settore;

    public Azienda(String nome, String settore) {
        this.nome = nome;
        this.settore = settore;
    }

    public String getNome() {
        return nome;
    }

    public String getSettore() {
        return settore;
    }

    public String getInfo() {
        return nome + " - " + settore;
    }
}

public class Persona {
    private String nome;
    private String cognome;
    public Indirizzo indirizzo;
    public Azienda azienda;

    public Persona(String nome, String cognome, Indirizzo indirizzo, Azienda azienda) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.azienda = azienda;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + nome + " " + cognome);
        System.out.println("Indirizzo: " + indirizzo.getDettagli());
        System.out.println("Azienda: " + azienda.getInfo());
    }
}

public class RelazioneTest {
    public static void main(String[] args) {
        Indirizzo indirizzo1 = new Indirizzo("Via Roma 10", "Torino", "10100");
        Azienda azienda1 = new Azienda("Tech Corp", "Informatica");
        Persona persona1 = new Persona("Luca", "Bianchi", indirizzo1, azienda1);
        persona1.mostraInfo();
    }
}
