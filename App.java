import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/* Gabriel Silva Costa (RA 21464678)
   Gustavo Alves Dias (RA 21445310)
   Gustavo Fernandes Ribeiro (RA 21473540)  */

public class App {
    public static void main(String[] args) {
        String nome = "";
        ArrayList<Cliente> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        try {
            File file = new File("arquivoDados.csv");
            Scanner scanner = new Scanner(file);

            // enquanto não chegar ao final do arquivo
            while (scanner.hasNextLine()) {
                // leia a próxima linha do arquivo
                String linha = scanner.nextLine();
                // quebrando a linha por ","
                String[] partes = linha.split(",");
                lista.add(new Cliente((String) partes[0], (String) partes[1], (String) partes[2], (String) partes[3],
                        (String) partes[4], (String) partes[5], (String) partes[6]));
            }

            scanner.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        while (!nome.equalsIgnoreCase("exit")) {
            System.out.print("Digite o nome procurado: ");
            nome = entrada.nextLine();

            switch (nome.toUpperCase()) {
                case "EXIT":
                    return;

                default:
                    if (BuscaBinaria.pesquisaBinariaOrd(nome, lista) == null) {
                        System.out.println("Não encontrado");
                    } else {
                        System.out.println(BuscaBinaria.pesquisaBinariaOrd(nome, lista));
                    }
                    System.out.println("Comparações: " + BuscaBinaria.getContCompara() + "\n");
            }

        }
        entrada.close();
    }

}