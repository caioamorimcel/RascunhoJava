public class Cliente {
    private String nome;
    private int idade;

    // Construtor
    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public double calcularPrecoIngresso(double precoIngressoEvento) {
        if (idade < 18) {
            // Se o cliente tiver menos de 18 anos, ele pagará metade do valor do ingresso
            return precoIngressoEvento / 2;
        } else {
            return precoIngressoEvento;
        }
    }
}
