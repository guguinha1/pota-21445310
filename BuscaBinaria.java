import java.util.ArrayList;

public class BuscaBinaria {
    private static int contCompara;

    public static Cliente pesquisaBinariaOrd(String nome, ArrayList<Cliente> clientes) {
        contCompara = 0;
        int inicio, fim, meio;
        meio = 0;
        inicio = 0;
        fim = clientes.size() - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            contCompara++;
            if (nome.equalsIgnoreCase(clientes.get(meio).getNome())) {
                return clientes.get(meio);
            }

            contCompara++;
            if (nome.compareToIgnoreCase(clientes.get(meio).getNome()) < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return null;
    }

    public static int getContCompara() {
        return contCompara;
    }
}