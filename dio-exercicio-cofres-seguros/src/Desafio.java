import java.util.Scanner;

import model.CofreDigital;
import model.CofreFisico;

public class Desafio {
    
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();
    
        if (tipoCofre.equalsIgnoreCase("digital")) {
            // Lê a senha
            int senha = Integer.parseInt(scanner.nextLine());
            CofreDigital cofreDigital = new CofreDigital(senha);
            cofreDigital.imprimirInformacoes();
    
            // Lê a senha de confirmação
            int confirmacaoSenha = Integer.parseInt(scanner.nextLine());
    
            if (cofreDigital.validarSenha(confirmacaoSenha)) {
            System.out.println("Cofre aberto!");
            } else {
            System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        } else {
            System.out.println("Tipo de cofre desconhecido!");
        }
    
        scanner.close();
    }

}