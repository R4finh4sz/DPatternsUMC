package sistema;

import models.*;
import factory.*;
import strategy.*;
import adapter.LancheAdapter;
import singleton.GerenciadorPedidos;
import java.util.Scanner;

public class SistemaLanches {
    private Scanner scanner;
    private GerenciadorPedidos gerenciador;

    public SistemaLanches() {
        this.scanner = new Scanner(System.in);
        this.gerenciador = GerenciadorPedidos.getInstancia();
    }

    public void iniciar() {
        System.out.println("=== Bem-vindo ao Sistema de Lanches ===");
        System.out.println("Sistema demonstrando 5 padrões de projeto:");
        System.out.println("Factory Method, Strategy, State, Adapter e Singleton\n");

        boolean continuar = true;

        while (continuar) {
            try {

                Lanche lanche = selecionarLanche();

                Pedido pedido = new Pedido(lanche);
                gerenciador.adicionarPedido(pedido);

                aplicarDesconto(pedido);

                System.out.println("Preço final: R$" + pedido.getPrecoFinal());

                lanche.preparar();

                processarEstados(pedido);

                gerenciador.finalizarPedido(pedido);

                System.out.println("\nObrigado pelo pedido!");

                System.out.print("\nDeseja fazer outro pedido? (s/n): ");
                String resposta = scanner.nextLine().toLowerCase();
                continuar = resposta.equals("s") || resposta.equals("sim");

                if (continuar) {
                    System.out.println("\n" + "=".repeat(50) + "\n");
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Tente novamente.");
            }
        }

        mostrarResumoFinal();
        scanner.close();
    }

    private Lanche selecionarLanche() {
        System.out.println("\nEscolha um lanche:");
        System.out.println("1 - Hambúrguer");
        System.out.println("2 - Lanche antigo");
        System.out.print(">> ");

        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:

                LancheFactory factory = new HamburguerFactory();
                return factory.processarPedido();

            case 2:

                LancheLegado lancheLegado = new LancheLegado();
                return new LancheAdapter(lancheLegado);

            default:
                throw new IllegalArgumentException("Opção inválida!");
        }
    }

    private void aplicarDesconto(Pedido pedido) {
        System.out.println("\nAplicar desconto?");
        System.out.println("1 - 10% de desconto");
        System.out.println("2 - Sem desconto");
        System.out.print(">> ");

        int opcao = Integer.parseInt(scanner.nextLine());
        DescontoStrategy strategy;

        switch (opcao) {
            case 1:
                strategy = new DescontoComum();
                break;
            case 2:
                strategy = new SemDesconto();
                break;
            default:
                System.out.println("Opção inválida! Assumindo sem desconto.");
                strategy = new SemDesconto();
        }

        pedido.setDescontoStrategy(strategy);
    }

    private void processarEstados(Pedido pedido) {
        System.out.println("\n=== Acompanhamento do Pedido ===");


        System.out.println("Estado do pedido: " + pedido.getEstado().getDescricao());

        try {
            Thread.sleep(1000);
            pedido.proximoEstado();
            System.out.println("Estado do pedido: " + pedido.getEstado().getDescricao());

            Thread.sleep(2000);
            pedido.proximoEstado();
            System.out.println("Estado do pedido: " + pedido.getEstado().getDescricao());

        } catch (InterruptedException e) {
            System.out.println("Erro na simulação de tempo");
        }
    }

    private void mostrarResumoFinal() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("=== RESUMO DO SISTEMA ===");
        System.out.println("Padrões de projeto demonstrados:");
        System.out.println("✓ Factory Method - Criação de lanches");
        System.out.println("✓ Strategy - Aplicação de descontos");
        System.out.println("✓ State - Estados do pedido");
        System.out.println("✓ Adapter - Integração de lanche legado");
        System.out.println("✓ Singleton - Gerenciamento de pedidos");

        System.out.println("\nTotal de pedidos processados: " + gerenciador.getTotalPedidos());
        System.out.println("\nSistema encerrado. Até logo!");
        System.out.println("=".repeat(50));
    }
}