public class Pessoa {
    private String cpf;
    private String nome;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(this.cpf);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Pessoa) {
            Pessoa pessoa = (Pessoa) object;
            if (pessoa.cpf.equalsIgnoreCase(this.cpf)) {
                return true;
            }
        }
        return false;
    }
    // isso daqui faz seu codigo ver que tem algo ja existente na sua lista :D

    @Override
    public String toString() {
        return String.format(
            """
            Nome: %s,
            CPF: %s
            """,
            this.nome,
            this.cpf);
    }

    public String getCpf(){
        return this.cpf;
    }

}
