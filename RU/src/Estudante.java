import java.time.LocalDate;

public class Estudante extends Usuario{

    private int refeicoesDisponiveis; /*refeições disponíveis armazenaria a quantidade de refeições que o estudante comprou.
    Porém, temos que ver como seria essa interação com o almoço e jantar*/

    public Estudante(String codigo, String nome, String cpf, LocalDate dataDeNascimento, String email, String senha, int refeicoesDisponiveis) {
        super(codigo, nome, cpf, dataDeNascimento, email, senha);
        this.refeicoesDisponiveis = refeicoesDisponiveis;
    }

    public int getRefeicoesDisponiveis() {
        return refeicoesDisponiveis;
    }

    public void setRefeicoesDisponiveis(int refeicoesDisponiveis) {
        this.refeicoesDisponiveis = refeicoesDisponiveis;
    }

    @Override
    public String toString() {
        return String.format("Estudante: %s\nCPF: %s\nData de nascimento: %s\nE-mail: %s\nCódigo: %s\nQuantidade de refeições disponíveis: %d", super.getNome(),
                                super.getCpf(), super.getDataDeNascimento(), super.getEmail(), super.getCodigo(), refeicoesDisponiveis);
    }

    

}
