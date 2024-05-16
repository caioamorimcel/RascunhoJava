import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal {
    private List<Evento> eventos;

    // Construtor
    public Principal() {
        eventos = new ArrayList<>();
    }

    // Método para cadastrar um novo evento
    public void cadastrarEvento(String nome, Date data, String horario, String descricao, double precoIngresso, int capacidadeTotal) {
        Evento novoEvento = new Evento(nome, data, horario, descricao, precoIngresso, capacidadeTotal);
        eventos.add(novoEvento);
        System.out.println("Evento cadastrado com sucesso!");
    }

    // Método para listar todos os eventos cadastrados
    public void listarEventos() {
        System.out.println("Eventos cadastrados:");
        for (Evento evento : eventos) {
            System.out.println("- " + evento.getNome() + " (" + evento.getData() + " " + evento.getHorario() + ")");
        }
    }

    // Método para vender ingressos para um evento específico
    public boolean venderIngressos(String nomeEvento, int quantidadeIngressos, Cliente cliente) {
        for (Evento evento : eventos) {
            if (evento.getNome().equals(nomeEvento)) {
                double precoIngressoCliente = cliente.calcularPrecoIngresso(evento.getPrecoIngresso());
                if (evento.venderIngressos(quantidadeIngressos)) {
                    System.out.println("Ingressos vendidos com sucesso para o evento: " + nomeEvento);
                    System.out.println("Preço total: " + (precoIngressoCliente * quantidadeIngressos));
                    return true;
                } else {
                    System.out.println("Não há ingressos disponíveis para o evento: " + nomeEvento);
                    return false;
                }
            }
        }
        System.out.println("Evento não encontrado: " + nomeEvento);
        return false;
    }
}
