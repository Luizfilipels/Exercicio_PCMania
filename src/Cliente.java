public class Cliente {
    String nome;
    long cpf;
    float total = 0;

    float[] carrinho = new float[10];

    float calculaTotalCompra() {
        for (float v : carrinho) {
            if (v != 0) {
                total = total + v;
            }
        }
        return total;
    }
}
