public class Cliente {
    private String nome, sexo, cidade, email, idade, telefone, endereco;

    public Cliente(String nome, String sexo, String endereco, String cidade, String email, String telefone,
            String idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cidade = cidade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nSexo: " + this.sexo + "\nEndereço:" + this.endereco + "\nCidade: "
                + this.cidade + "\nEmail: " + this.email + "\nTelefone: "+ this.telefone + "\nIdade: " + this.idade + "\n"; 
    }
}
