import java.util.Scanner;

public class ProgramaVingadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da equipe: ");
        String nomeEquipe = sc.nextLine();
        Equipe equipe = new Equipe(nomeEquipe);

        int opcao = 0;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar novo herói");
            System.out.println("2 - Mostrar informações da equipe e de seus heróis");
            System.out.println("3 - Mostrar o herói mais forte");
            System.out.println("4 - Calcular a porcentagem de heróis na equipe que podem voar");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine(); // consome a quebra de linha pendente

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do herói: ");
                    String nomeHeroi = sc.nextLine();
                    System.out.print("Digite o poder do herói: ");
                    int poderHeroi = sc.nextInt();
                    sc.nextLine(); // consome a quebra de linha pendente
                    System.out.print("O herói pode voar? (S/N) ");
                    char voaHeroi = sc.nextLine().charAt(0);
                    boolean voa = voaHeroi == 'S' || voaHeroi == 's';
                    equipe.adicionaHeroi(new Heroi(nomeHeroi, poderHeroi, voa));
                    System.out.println("Herói adicionado à equipe!");
                    break;

                case 2:
                    equipe.mostraHerois();
                    break;

                case 3:
                    Heroi maisForte = equipe.heroiMaisForte();
                    if (maisForte == null) {
                        System.out.println("Não há heróis na equipe!");
                    } else {
                        System.out.println("Herói mais forte da equipe:");
                        System.out.println(maisForte);
                    }
                    break;

                case 4:
                    double porcentagem = equipe.porcentagemDeHeroisQueVoam();
                    System.out.printf("Porcentagem de heróis que voam: %.2f%%\n", porcentagem);
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}