public class Cliente {
    String nome;
    long cpf;
    float total = 0;

    float[] carrinho = new float[10];

    float calculaTotalCompra() {
        for(int i=0; i < carrinho.length;i++) {
            if(carrinho[i] != 0) {
                total = total + carrinho[i];
            }
        }
        return total;
    }
}
