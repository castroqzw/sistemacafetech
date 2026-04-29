import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int codproduto = -1, qteproduto = 0, novoproduto = 0, ongcampanha = 0;
        double valorproduto = 0, valortotal = 0;
        double totalDia = 0;
        int qtdPedidos = 0;
        int qtdCapuccino = 0;
        double totalDoacoes = 0;

        String nome;

        System.out.print("Digite o nome do cliente: ");
        nome = sc.nextLine();

        while (true) {
            valortotal = 0;

            System.out.println("===========================");
            System.out.println("Bem vindo(a) a Café Tech!");
            System.out.println("===========================");
            System.out.println("1 - Café Expresso");
            System.out.println("2 - Capuccino");
            System.out.println("3 - Pão de queijo");
            System.out.println("4 - Cookie de chocolate");
            System.out.println("0 - Encerrar pedido");
            System.out.println("===========================");
            System.out.print("Selecione seu produto: ");
            codproduto = sc.nextInt();

            if (codproduto == 0) {
                break;
            }

            switch (codproduto){
                case 1:
                    valorproduto = 6.00;
                    break;
                case 2:
                    valorproduto = 9.00;
                    qtdCapuccino++;
                    break;
                case 3:
                    valorproduto = 5.00;
                    break;
                case 4:
                    System.out.print("Digite quantos você irá comprar: ");
                    qteproduto = sc.nextInt();

                    if(qteproduto > 3) {
                        valorproduto = 10.00;
                    } else {
                        valorproduto = 12.00;
                    }
                    break;
                default:
                    System.out.println("Produto inválido!");
                    continue;
            }

            if (codproduto != 4) {
                System.out.print("Digite quantos você irá comprar: ");
                qteproduto = sc.nextInt();
            }

            valortotal = valorproduto * qteproduto;

            if (valortotal > 150) {
                valortotal *= 0.90;
            } else if (valortotal >= 50) {
                valortotal *= 0.95;
            }

            System.out.println("Deseja ajudar a ONG? (1-Sim / 2-Não)");
            ongcampanha = sc.nextInt();

            double doacao = 0;
            if (ongcampanha == 1) {
                doacao = valortotal * 0.02;
                valortotal += doacao;
                totalDoacoes += doacao;
            }

            qtdPedidos++;
            totalDia += valortotal;

            System.out.println("===========================");
            System.out.println("Cliente: " + nome);
            System.out.println("Total do pedido: R$ " + valortotal);
            System.out.println("===========================");

            System.out.println("Novo pedido? (1-Sim / 2-Não)");
            novoproduto = sc.nextInt();

            if (novoproduto != 1) {
                break;
            }
        }
        System.out.println("\n===== RELATÓRIO FINAL =====");
        System.out.println("Total arrecadado: R$ " + totalDia);
        System.out.println("Quantidade de pedidos: " + qtdPedidos);
        System.out.println("Capuccinos vendidos: " + qtdCapuccino);

        if (qtdPedidos > 0) {
            System.out.println("Média de doações: R$ " + (totalDoacoes / qtdPedidos));
        } else {
            System.out.println("Média de doações: R$ 0");
        }
    }
}