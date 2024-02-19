public class Produto {

    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            System.out.println("Preco nao pode ser negativo!!!");
        }else {
            this.preco = preco;
        }

    }
}
