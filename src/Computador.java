public class Computador {

    String marca;
    float preco;

    SistemaOperacional os;
    HardwareBasico[] hw;

    MemoriaUSB[] memUSB = new MemoriaUSB[3];



    //Construtor
    public Computador() {
        os = new SistemaOperacional();
        hw = new HardwareBasico[5];
    }

    void addMemoriaUSB(MemoriaUSB musb) {
        for(int i = 0;i < memUSB.length;i++) {
            if(memUSB[i] == null) {
                memUSB[i] = musb;
            }
        }
    }

    void mostraPCConfigs() {
        for (HardwareBasico hardwareBasico : hw) {
            if (hardwareBasico != null) {
                System.out.println(hardwareBasico.nome + " - Capacidade: " + hardwareBasico.capacidade);
            } else {
                break;
            }
        }
        for(int i = 0; i < memUSB.length;i++) {
            System.out.println("Acompanha: " + memUSB[i].nome + " - Capacidade: " + memUSB[i].capacidade);
            break;
        }
    }

}
