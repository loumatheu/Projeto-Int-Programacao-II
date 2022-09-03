package negocio.bean;

import java.time.LocalDate;

public class Funcionario extends Usuario {

    private double salario;
    private LocalDate dataAdmin;

    public Funcionario(String codigo, String nome, String cpf, LocalDate dataDeNascimento, String email, String senha,
            Double salario, LocalDate dataAdmin) {
        super(codigo, nome, cpf, dataDeNascimento, email, senha);
        this.salario = salario;
        this.dataAdmin = dataAdmin;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmin() {
        return dataAdmin;
    }

    public void setDataAdmin(LocalDate dataAdmin) {
        this.dataAdmin = dataAdmin;
    }

    @Override
    public String toString() {
        return String.format(
                "Funcionário: %s\nCPF: %s\nData de nascimento: %s\nE-mail: %s\nCódigo: %s\nSalário: R$%.2f\n DataAdmin a ser settado",
                super.getNome(), super.getCpf(), super.getDataDeNascimento(), super.getEmail(), super.getCodigo(),
                salario);
    }

}
