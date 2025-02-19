class Auto{
    private String marca;
    private String modello;
    private int anno;
    public String colore;
    
    public Auto(String marca, String modello, int anno, String colore){
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.colore = colore;
    }

    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca = marca;
    }

    public String getmodello(){
        return modello;
    }
    public void setmodello(String modello){
        this.modello = modello;
    }

    public int getanno(){
        return anno;
    }
    public void setanno(int anno){
        this.anno = anno;
    }

    public void mostraInfo(){
        System.out.println("Marca: " + marca + ", Modello: " + modello + ", Anno: " + anno + ", Colore: " + colore);
    }

    public void cambiaColore(String nuovoColore){
        this.colore = nuovoColore;
    }

    public class Esercizio1_Auto{
        public static void main(String[]args){
            Auto miaAuto = new Auto("Fiat","Panda",2021,"Blu");
            miaAuto.mostraInfo();
            miaAuto.cambiaColore("Verde");
            miaAuto.mostraInfo();
        }
    }
}