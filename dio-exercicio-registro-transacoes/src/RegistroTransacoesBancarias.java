import java.util.ArrayList;
import java.util.Scanner;

public class RegistroTransacoesBancarias {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> transacoes = new ArrayList<>();
        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();
        int contadorTransacoes = 0;

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            double valorTransacao = scanner.nextDouble();

            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add(++contadorTransacoes + ". Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add(++contadorTransacoes + ". Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes:");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }

        scanner.close();
    }

}