public class Main {
    public static void main(String[] args) {
//        Produto produto = new Produto();
//        produto.setPreco(120.0);
//        System.out.println(produto.getPreco());
//        produto.setPreco(-50);
//        System.out.println(produto.getPreco());
//        System.out.println("\n=============================================\n");

        ContaBancaria novaConta = new ContaBancaria("1234");
        novaConta.depositarDinheiro(500);
        novaConta.sacarDinheiro(550);
        novaConta.sacarDinheiro(300);
        System.out.println(novaConta.getSaldo());
        System.out.println("=============================================");

        novaConta.alterarSenha("1234");
        novaConta.alterarSenha("4311");



    }
}