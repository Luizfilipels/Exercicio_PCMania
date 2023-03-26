import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computador[] pc = new Computador[3];
        MemoriaUSB usb_pc1 = new MemoriaUSB();
        MemoriaUSB usb_pc2 = new MemoriaUSB();
        MemoriaUSB usb_pc3 = new MemoriaUSB();
        Cliente[] c = new Cliente[5];
        int i;
        int j = 0;
        int k;
        int f;
        int qnt = 0;
        int ver;
        Scanner entrada = new Scanner(System.in);

        usb_pc1.nome = "Pen-drive";
        usb_pc1.capacidade = 16;
        usb_pc2.nome = "Pen-drive";
        usb_pc2.capacidade = 32;
        usb_pc3.nome = "HD Externo";
        usb_pc3.capacidade = 1000;


        //Criando PCs
        pc[0] = new Computador();
        pc[0].hw[0] = new HardwareBasico();
        pc[0].hw[1] = new HardwareBasico();
        pc[0].hw[2] = new HardwareBasico();
        pc[1] = new Computador();
        pc[1].hw[0] = new HardwareBasico();
        pc[1].hw[1] = new HardwareBasico();
        pc[1].hw[2] = new HardwareBasico();
        pc[2] = new Computador();
        pc[2].hw[0] = new HardwareBasico();
        pc[2].hw[1] = new HardwareBasico();
        pc[2].hw[2] = new HardwareBasico();

        //Criando cliente
        c[0] = new Cliente();

        //Definindo cliente
        c[0].nome = "Luiz Filipe";
        c[0].cpf = 12345678900L;

        //Cadastrando produto
        //PC 01
        pc[0].marca = "Positivo";
        pc[0].preco = 2300.00f;
        pc[0].hw[0].nome = "Processador Pentium Core i3";
        pc[0].hw[0].capacidade = 2200f;
        pc[0].hw[1].nome = "Memória RAM";
        pc[0].hw[1].capacidade = 8f;
        pc[0].hw[2].nome = "Disco Rígido";
        pc[0].hw[2].capacidade = 500f;
        pc[0].os.nome = "Ubuntu 22.04.2 LTS";
        pc[0].os.tipo = 32;
        pc[0].addMemoriaUSB(usb_pc1);
        //-----------------------------------------//
        //PC 02
        pc[1].marca = "Acer";
        pc[1].preco = 5800.00f;
        pc[1].hw[0].nome = "Processador Pentium Core i5";
        pc[1].hw[0].capacidade = 3370f;
        pc[1].hw[1].nome = "Memória RAM";
        pc[1].hw[1].capacidade = 16f;
        pc[1].hw[2].nome = "Disco Rígido";
        pc[1].hw[2].capacidade = 1000f;
        pc[1].os.nome = "Windows 8";
        pc[1].os.tipo = 64;
        pc[1].addMemoriaUSB(usb_pc2);
        //-----------------------------------------//
        //PC 03
        pc[2].marca = "Vaio";
        pc[2].preco = 1800.00f;
        pc[2].hw[0].nome = "Processador Pentium Core i7";
        pc[2].hw[0].capacidade = 4500f;
        pc[2].hw[1].nome = "Memória RAM";
        pc[2].hw[1].capacidade = 32f;
        pc[2].hw[2].nome = "Disco Rígido";
        pc[2].hw[2].capacidade = 2000f;
        pc[2].os.nome = "Windows 10";
        pc[2].os.tipo = 64;
        pc[2].addMemoriaUSB(usb_pc3);
        //-----------------------------------------//


        System.out.println("--- PC Mania ---");
        System.out.println("MEGA PROMOÇÃO");
        System.out.println("OFERTAS:");
        System.out.println("------------------------------------");
        for (i = 0; i < pc.length; i++) {
            System.out.println("PC - " + (i + 1) + ": " + pc[i].marca);
            System.out.println("Preço: R$" + pc[i].preco);
            System.out.println("Componentes:");
            pc[i].mostraPCConfigs();

            System.out.println("------------------------------------");
        }

        for(f=0;f < c.length;f++) {
            if(c[f] != null) {
                for (i = 0; i < c[f].carrinho.length; i++) {
                    if (c[f].carrinho[i] == 0) {
                        j = 0;
                    } else {
                        j = 1;
                    }
                }
            }
        }
        if(j == 0) {
            System.out.println("Seu carrinho está vazio.");
        }
        

        System.out.println("Qual PC você vai querer comprar? ( De 1 até 3");
        System.out.print("--> ");
        k = entrada.nextInt();
        while (k > 3 || k < 0) {
            System.out.println("Entrada inválida, escolha entre 1 , 2 e 3");
            System.out.print("--> ");
            k = entrada.nextInt();
        }

        while (k != 0) {

            System.out.println("------------------------------------");

            switch (k) {
                case 1 -> {
                    System.out.println("Você escolheu o PC - 1");
                    System.out.println("Marca: " + pc[0].marca);
                    System.out.println("Preço: " + pc[0].preco);
                    System.out.println("Lista de componentes do PC - 1:");
                    pc[0].mostraPCConfigs();
                    System.out.println("Tem certeza que quer adicionar esse PC no seu carrinho? (1 para Sim e 2 para Não");
                    System.out.print("--> ");
                    ver = entrada.nextInt();
                    if (ver == 1) {
                        for (f = 0; f < c.length; f++) {
                            if (c[f] != null) {
                                for (i = 0; i < c[f].carrinho.length; i++) {
                                    if (c[f].carrinho[i] == 0) {
                                        c[f].carrinho[i] = pc[0].preco;
                                        break;
                                    }
                                }
                            }
                        }
                        System.out.println("Item adicionado com sucesso no carrinho!");
                        System.out.println("------------------------------------");
                    } else if (ver == 2) {
                        System.out.println("Item não foi adicionado ao carrinho a pedido do usuário.");
                    }
                }
                case 2 -> {
                    System.out.println("Você escolheu o PC - 2");
                    System.out.println("Marca: " + pc[1].marca);
                    System.out.println("Preço: " + pc[1].preco);
                    System.out.println("Lista de componentes do PC - 2:");
                    pc[1].mostraPCConfigs();
                    System.out.println("Tem certeza que quer adicionar esse PC no seu carrinho? (1 para Sim e 2 para Não");
                    System.out.print("--> ");
                    ver = entrada.nextInt();
                    if (ver == 1) {
                        for (f = 0; f < c.length; f++) {
                            if (c[f] != null) {
                                for (i = 0; i < c[f].carrinho.length; i++) {
                                    if (c[f].carrinho[i] == 0) {
                                        c[f].carrinho[i] = pc[1].preco;
                                        break;
                                    }
                                }
                            }
                        }
                        System.out.println("Item adicionado com sucesso no carrinho!");
                    } else if (ver == 2) {
                        System.out.println("Item não foi adicionado ao carrinho a pedido do usuário.");
                    }
                }
                case 3 -> {
                    System.out.println("Você escolheu o PC - 3");
                    System.out.println("Marca: " + pc[2].marca);
                    System.out.println("Preço: " + pc[2].preco);
                    System.out.println("Lista de componentes do PC - 3:");
                    pc[2].mostraPCConfigs();
                    System.out.println("Tem certeza que quer adicionar esse PC no seu carrinho? (1 para Sim e 2 para Não");
                    System.out.print("--> ");
                    ver = entrada.nextInt();
                    if (ver == 1) {
                        for (f = 0; f < c.length; f++) {
                            if (c[f] != null) {
                                for (i = 0; i < c[f].carrinho.length; i++) {
                                    if (c[f].carrinho[i] == 0) {
                                        c[f].carrinho[i] = pc[2].preco;
                                        break;
                                    }
                                }
                            }
                        }
                        System.out.println("Item adicionado com sucesso no carrinho!");
                        System.out.println("------------------------------------");
                    } else if (ver == 2) {
                        System.out.println("Item não foi adicionado ao carrinho a pedido do usuário.");
                    }
                }
            }
            //System.out.print("Agora, seu carrinho tem ");
            for(f = 0; f < c.length;f++) {
                if (c[f] != null) {
                    for (i = 0; i < c[f].carrinho.length; i++) {
                        if (c[f].carrinho[i] != 0) {
                            qnt++;
                            break;
                        }
                    }
                }
            }
            if(qnt > 1) {
                System.out.println("Agora, seu carrinho tem " + qnt + " itens");
            } else if (qnt == 0) {
                System.out.println("Seu carrinho está vazio");
            }

            System.out.println("------------------------------------");
            System.out.println("Para ir ao checkout, digite 0");
            System.out.println("Para adicionar mais um item ao carrinho, entre com um dos itens listados:");
            System.out.println("Ex: 1, 2, 3");
            System.out.print("--> ");
            k = entrada.nextInt();


            //Checkout
            if(k == 0) {
                System.out.println("------------------------------------");
                System.out.println("Cliente: " + c[0].nome);
                System.out.println("Total da compra: R$" + c[0].calculaTotalCompra());
            }


        }
    }
}
