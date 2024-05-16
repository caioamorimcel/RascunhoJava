import java.util.Date;

public class Evento {
    private String nome;
    private Date data;
    private String horario;
    private String descricao;
    private double precoIngresso;
    private int capacidadeTotal;
    private int ingressosVendidos;

    // Construtor
    public Evento(String nome, Date data, String horario, String descricao, double precoIngresso, int capacidadeTotal) {
        this.nome = nome;
        this.data = data;
        this.horario = horario;
        this.descricao = descricao;
        this.precoIngresso = precoIngresso;
        this.capacidadeTotal = capacidadeTotal;
        this.ingressosVendidos = 0;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }
    
    
    // Método para verificar a disponibilidade de ingressos
    public boolean haIngressosDisponiveis(int quantidade) {
        return (capacidadeTotal - ingressosVendidos) >= quantidade;
    }

    // Método para vender ingressos
    public boolean venderIngressos(int quantidade) {
        if (haIngressosDisponiveis(quantidade)) {
            ingressosVendidos += quantidade;
            return true;
        } else {
            return false;
        }
    }
}
