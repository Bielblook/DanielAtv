public class Telefone {
    private String ddd;
    private String numero;

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void alterarNumero(String novoNumero) {
        this.numero = novoNumero;
    }

    public void alterarDdd(String novoDdd) {
        this.ddd = novoDdd;
    }
}

public class Cliente {
    private String nome;
    private Telefone telefone;
    private String cpf;

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

 
}

public class Cadastro {
    public static void main(String[] args) {

        Telefone telefone = new Telefone();
        telefone.setDdd("11");
        telefone.setNumero("999999999");


        Cliente cliente = new Cliente();
        cliente.setNome("Fulano de Tal");
        cliente.setTelefone(telefone);
        cliente.setCpf("111.111.111-11");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: (" + cliente.getTelefone().getDdd() + ") " + cliente.getTelefone().getNumero());
        System.out.println("CPF: " + cliente.getCpf());
    }
}