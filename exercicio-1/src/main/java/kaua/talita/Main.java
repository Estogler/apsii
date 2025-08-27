package kaua.talita;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MinhaAgendaDeAniversarios minhaAgenda = new MinhaAgendaDeAniversarios();
        Scanner input = new Scanner(System.in);

        System.out.println("=== Bem-vindo ao Gerenciador de Aniversários ===");

        while (true) {
            System.out.println("\nMenu de opções:");
            System.out.println("1 - Cadastrar novo aniversariante");
            System.out.println("2 - Ver aniversariantes de uma data");
            System.out.println("3 - Excluir aniversariante");
            System.out.println("4 - Exibir todos os aniversariantes");
            System.out.println("5 - Encerrar programa");

            System.out.print("Informe sua escolha: ");
            int opcao = input.nextInt();
            input.nextLine(); // Limpar o buffer

            if (opcao == 1) {
                System.out.print("Nome do aniversariante: ");
                String nome = input.nextLine();

                System.out.print("Dia do aniversário: ");
                int dia = input.nextInt();

                System.out.print("Mês do aniversário: ");
                int mes = input.nextInt();
                input.nextLine();

                minhaAgenda.adicionarAniversariante(nome, dia, mes);
                System.out.println("Aniversariante cadastrado com sucesso.");
            } else if (opcao == 2) {
                System.out.print("Informe o dia: ");
                int diaConsulta = input.nextInt();
                System.out.print("Informe o mês: ");
                int mesConsulta = input.nextInt();
                input.nextLine();

                ArrayList<String> aniversariantes = minhaAgenda.obterAniversariantesDoDia(diaConsulta, mesConsulta);

                if (aniversariantes.isEmpty()) {
                    System.out.println("Nenhum aniversariante encontrado nessa data.");
                } else {
                    System.out.println("Aniversariantes no dia " + diaConsulta + "/" + mesConsulta + ":");
                    for (String a : aniversariantes) {
                        System.out.println("-> " + a);
                    }
                }
            } else if (opcao == 3) {
                System.out.print("Nome do aniversariante a ser removido: ");
                String nomeRemover = input.nextLine();
                minhaAgenda.removerAniversariante(nomeRemover);
                System.out.println("Se o aniversariante existia, ele foi removido.");
            } else if (opcao == 4) {
                System.out.println("Todos os aniversariantes cadastrados:");
                System.out.println(minhaAgenda.toString());
            } else if (opcao == 5) {
                System.out.println("Programa encerrado. Obrigado por utilizar o sistema.");
                input.close();
                return;
            } else {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }
}
