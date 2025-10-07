package entregaPichau;

public class Programa {
    public static void main(String[] args) {
        Endereco endDoJoao = new Endereco();
        endDoJoao.rua = "rua das flores";
        endDoJoao.numero = 123;
        endDoJoao.cep = "00000-000";
        endDoJoao.cdd = "Petropolis";

        pessoa joao = new pessoa();
        joao.nome ="joao silva";
        joao.cpf = "000.000.000-00";
        
        joao.endereco = endDoJoao;
        System.out.println("O " + joao.nome + " mora na cidade " + joao.endereco.cdd+ ", numero " + joao.endereco.numero);


    }
}
