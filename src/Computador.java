public class Computador {

    String marca;
    float preco;

    SistemaOperacional os;
    HardwareBasico[] hw;

    MemoriaUSB memUSB;

    //Construtor
    public Computador() {
        os = new SistemaOperacional();
        hw = new HardwareBasico[5];
    }

    void addMemoriaUSB(MemoriaUSB musb) {

    }

}
