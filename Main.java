import java.util.Scanner;
public class Main {

    //Método de encerramento
    public static String lerEntrada (Scanner scanner)  {
        String entrada = scanner.nextLine();
        if (entrada.equals ("/")) {
            System.out.println("Simulação Encerrada!");
            System.exit(0);
        }
        return entrada;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String resposta;

        do {
            try {
                System.out.println("Digite o número de participantes (N), ou tecle / para encerrar! ");
                String Nparticipates = lerEntrada(scanner);

                System.out.println("\nDigite o número de eliminações (K), ou tecle / para enecerrar! ");
                String Keliminados = lerEntrada(scanner);

                ListaCircularJosephus lista = new ListaCircularJosephus();
                lista.ListaCircular(Integer.parseInt(Nparticipates));

                int sobrevivente = lista.teorema(Integer.parseInt(Keliminados));

                System.out.println("\nParticipante sobrevivente: " +sobrevivente);

            } catch (Exception e) {
                System.out.println("Erro! Digite apenas números inteiros para N e K.");
            }
            System.out.println("Digite / para encerrar ou 1 para realizar outra simulação.\n");
            resposta = lerEntrada(scanner);

        } while (!resposta.equalsIgnoreCase("/"));
        System.out.println("Simulação enecerrada!");

        scanner.close();
    }
}
