import java.util.Objects;

public class ContaBancaria {

    private double saldo;
    private String senha;



    public double getSaldo() {
        return saldo;
    }

    public void alterarSenha(String novaSenha){
        if(Objects.equals(novaSenha, this.senha)){
            System.out.println("A senha nao pode ser igual a anterior!");
        } else {
            this.senha = novaSenha;
        }
    }

    public void sacarDinheiro(double valor){
        if(valor > this.saldo){
            System.out.println("Voce nao possui saldo suficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public void depositarDinheiro(double valor){
        this.saldo += valor;
    }
}
