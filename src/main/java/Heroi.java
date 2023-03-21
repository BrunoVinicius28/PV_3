public class Heroi {
    String nome;
    int poder;
    boolean voa;

    public Heroi(String nome, int poder, boolean voa) {
        nome = nome;
        poder = poder;
        voa = voa;
    }

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public boolean isVoa() {
        return voa;
    }

    public String toString() {
        return nome + " (Poder: " + poder + ", Voa: " + (voa ? "Sim" : "Não") + ")";
    }
}