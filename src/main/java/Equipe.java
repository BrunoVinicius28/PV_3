import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Heroi> herois = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void adicionaHeroi(Heroi heroi) {
        herois.add(heroi);
    }

    public void mostraHerois() {
        System.out.println("Equipe " + nome + ":");
        for (Heroi heroi : herois) {
            System.out.println(heroi);
        }
        System.out.println();
    }

    public Heroi heroiMaisForte() {
        Heroi maisForte = null;
        for (Heroi heroi : herois) {
            if (maisForte == null || heroi.getPoder() > maisForte.getPoder()) {
                maisForte = heroi;
            }
        }
        return maisForte;
    }

    public double porcentagemDeHeroisQueVoam() {
        int total = herois.size();
        int queVoam = 0;
        for (Heroi heroi : herois) {
            if (heroi.isVoa()) {
                queVoam++;
            }
        }
        return (double) queVoam / total * 100.0;
    }
}