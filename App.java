import java.util.ArrayList;
import java.util.Scanner;

/* Gabriel Silva Costa (RA 21464678)
   Gustavo Alves Dias (RA 21445310)
   Gustavo Fernandes Ribeiro (RA 21473540)  */

public class App {
    public static void main(String[] args) {
        String nome = "";
        ArrayList<Cliente> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        lista.add(new Cliente("Alessandra", "Feminino", "São Paulo", "ale@gmail.com", "21", "(11) 4422-5594"));
        lista.add(new Cliente("Gabriel", "Masculino", "Santana de Parnaiba", "bielzinho@gmail.com", "19", "(11) 94452-8533"));
        lista.add(new Cliente("Gustavo", "Masculino", "São Paulo", "gustavinho@gmail.com", "21", "(11) 3353-9922"));
        lista.add(new Cliente("Julia", "Feminino", "São Paulo", "julinhabebedeira@gmail.com", "19", "(11)5566-0922"));
        lista.add(new Cliente("Joao", "Masculino", "Bahia", "joaozinmatador@gmail.com", "30", "(71) 5594-7825"));
        lista.add(new Cliente("Leandro", "Masculino", "Santa Catarina", "leandrozindosroles@gmail.com", "25", "(47) 9543-1478"));
        lista.add(new Cliente("Pedro", "Masculino", "São Paulo", "pedringames@gmail.com", "11", "(11) 4002-8922"));

        while (!nome.equalsIgnoreCase("exit")) {
            System.out.print("Digite o nome procurado: ");
            nome = entrada.nextLine();

            switch (nome) {
                case "exit":
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