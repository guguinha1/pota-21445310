public class Cliente {
    private String nome, sexo, cidade, email, idade, telefone;

    public Cliente(String nome, String sexo, String cidade, String email, String idade, String telefone) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cidade = cidade;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome  + "\nSexo: " + this.sexo + "\nCidade: " + this.cidade + "\nTelefone: " + this.telefone + "\nEmail: " + this.email + "\nIdade: "
                + this.idade;
    }
}
