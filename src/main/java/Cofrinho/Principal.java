package Cofrinho;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true){
            System.out.println("\n--- Menu do Cofrinho ---\n");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar todas as moedas");
            System.out.println("4. Calcular total convertido para Real");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\nEscolha o tipo de moeda:");
                    System.out.println("1. Dólar");
                    System.out.println("2. Euro");
                    System.out.println("3. Real");
                    System.out.print("Opção: ");
                    int tipoMoeda = scanner.nextInt();

                    System.out.println("\nDigite o valor da moeda: ");
                    double valor = scanner.nextDouble();

                    switch (tipoMoeda){
                        case 1 -> cofrinho.adicionar(new MoedaDolar(valor));
                        case 2 -> cofrinho.adicionar(new MoedaEuro(valor));
                        case 3 -> cofrinho.adicionar(new MoedaReal(valor));
                        default -> System.out.println("Tipo de moeda invalido!");
                    }
                    break;

                case 2:
                    System.out.println("Removendo uma moeda.");
                    System.out.print("Digite o valor da moeda a remover: ");
                    valor = scanner.nextDouble();
                    System.out.println("Escolha o tipo de moeda:");
                    System.out.println("1. Dólar");
                    System.out.println("2. Euro");
                    System.out.println("3. Real");
                    System.out.print("Opção: ");
                    tipoMoeda = scanner.nextInt();

                    Moeda moedaRemover = switch (tipoMoeda){
                        case 1 -> new MoedaDolar(valor);
                        case 2 -> new MoedaEuro(valor);
                        case 3 -> new MoedaReal(valor);
                        default -> null;
                    };

                    if(moedaRemover != null){
                        cofrinho.remover(moedaRemover);
                        System.out.println("\nMoeda removida.");
                    } else {
                        System.out.println("\nTipo de moeda invalido!");
                    }
                    break;

                case 3:
                    if (cofrinho.isEmpty()) {
                        System.out.println("\nO cofrinho está vazio. Nenhuma moeda para listar.");
                    } else {
                        System.out.println("Listagem de todas as moedas no cofrinho:");
                        System.out.println("*".repeat(20));
                        cofrinho.listagemMoedas();
                        System.out.println("*".repeat(20));
                    }
                    break;

                case 4:
                    System.out.println("*".repeat(50));
                    System.out.println("Total convertido para Real: R$" + cofrinho.totalConvertido());
                    System.out.println("*".repeat(50));
                    break;


                case 5:
                    System.out.println("\nSaindo do programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opçao invalida! Tente novamente");

            }
        }
    }
}