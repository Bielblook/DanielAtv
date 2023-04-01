public class Telefone {
    private int ddd;
    private String numero;

    public Telefone(int ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void alterarDdd(int novoDdd) {
        this.ddd = novoDdd;
    }

    public void alterarNumero(String novoNumero) {
        this.numero = novoNumero;
    }
}

public class Cliente {
    private String nome;
    private Telefone telefone;
    private String cpf;

    public Cliente(String nome, Telefone telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    // não criamos um setter para cpf, porque é um número fixo e não pode ser alterado

    // podemos adicionar outros métodos aqui, se necessário
}

public class Cadastro {
    public static void main(String[] args) {
        // podemos criar objetos de Cliente e Telefone aqui e usar seus métodos
        Telefone telefone1 = new Telefone(11, "1234-5678");
        Cliente cliente1 = new Cliente("Fulano", telefone1, "123.456.789-00");

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Telefone: (" + cliente1.getTelefone().getDdd() + ") " + cliente1.getTelefone().getNumero());
        System.out.println("CPF: " + cliente1.getCpf());
    }
}
