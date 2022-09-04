package negocio.bean;

import java.time.LocalDate;

public class Estudante extends Usuario {

    private String matricula;

    public Estudante(String codigo, String nome, String cpf, LocalDate dataDeNascimento, String email, String senha,
            String matricula) {
        super(codigo, nome, cpf, dataDeNascimento, email, senha);
        this.matricula = matricula;
    }
    

    public Estudante(String codigo, String nome, String cpf, LocalDate dataDeNascimento, String email, String senha) {
		super(codigo, nome, cpf, dataDeNascimento, email, senha);
	}


	public String getMatricula() {
        return matricula;
    }

    public void setmatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return String.format(
                "Estudante: %s\nCPF: %s\nData de nascimento: %s\nE-mail: %s\nCódigo: %s\nQuantidade de refeições disponíveis: %d",
                super.getNome(),
                super.getCpf(), super.getDataDeNascimento(), super.getEmail(), super.getCodigo(), matricula);
    }

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
    

}
