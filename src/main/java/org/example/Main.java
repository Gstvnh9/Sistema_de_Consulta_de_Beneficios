package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    static void main() {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Indique o nome do Colaborador:");
        String nome = entrada.nextLine();

        System.out.println("Diga a modalidade de trabalho do Colaborador (Responda com 'PRESENCIAL' ou 'HOME OFFICE'):");
        String modalidade = entrada.nextLine();

        System.out.println("O colaborador utiliza-se de veículo próprio? (Responda com 'SIM' ou 'NÃO'):");
        String veiculo = entrada.nextLine();

        System.out.println("Agora, indique a idade do Colaborador:");
        int idade = entrada.nextInt();

        System.out.println("Neste momento, indique o salário do Colaborador:");
        double salario = entrada.nextDouble();

        System.out.println("Nos diga há quanto tempo, em meses, o colaborador trabalha na empresa:");
        int meses = entrada.nextInt();

        System.out.println("Diga quantos filhos o colaborador possui:");
        int filhos = entrada.nextInt();

        System.out.println("====================");
        System.out.println("Ficha do Colaborador");
        System.out.println("====================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Tempo de empresa, em meses: " + meses);
        System.out.println("Quantidade de Filhos: " + filhos);
        System.out.println("Modalidade de trabalho: " + modalidade);
        System.out.println("Disponibilidade de Veículo Próprio?: " + veiculo);
        System.out.println("====================");

        System.out.println("  ");

        System.out.println("====================");
        System.out.println("Possíveis Direitos Adquiridos");
        System.out.println("====================");

        if (salario <= 4000) {
            System.out.println("Direito ao vale-alimentação: Aprovado");
        } else {
            System.out.println("Direito ao vale-alimentação: Reprovado");
        }

        if (filhos > 0){
            System.out.println("Direito ao Auxílio-Creche: Aprovado");
        } else {
            System.out.println("Direito ao Auxílio-Creche: Reprovado");
        }

        if (meses > 3) {
            System.out.println("Elegibilidade para o plano de saúde: Aprovada");
        } else {
            System.out.println("Elegibilidade para o plano de saúde: Reprovada");
        }

        if (modalidade.equalsIgnoreCase ("PRESENCIAL")) {
            System.out.println("Direito ao auxílio Home Office: Reprovado");
        } else if (modalidade.equalsIgnoreCase ("HOME OFFICE")) {
            System.out.println("Direito ao auxílio Home Office: Aprovado");
        } else {
            System.out.println("Direito ao auxílio Home Office: Responda a pergunta com 'PRESENCIAL' ou 'HOME OFFICE'");
        }

        if (veiculo.equalsIgnoreCase ("SIM")) {
            System.out.println("Direito ao auxílio combustível: Aprovado");
        } else if (veiculo.equalsIgnoreCase ("NÃO")) {
            System.out.println("Direito ao auxílio combustível: Reprovado");
        } else {
            System.out.println("Direito ao auxílio combustível: Responda a pergunta com 'SIM' ou 'NÃO'");
        }

        if (meses > 5) {
            System.out.println("Participação na PLR: Aprovada");
        } else {
            System.out.println("Participação na PLR: Reprovada");
        }

        if (modalidade.equalsIgnoreCase ("PRESENCIAL")) {
            System.out.println("Elegibilidade para bolsa de estudos: Reprovada");
        } else if (modalidade.equalsIgnoreCase ("HOME OFFICE")) {
            System.out.println("Elegibilidade para bolsa de estudos: Aprovada");
        } else {
            System.out.println("Elegibilidade para bolsa de estudos: Responda a pergunta com 'PRESENCIAL' ou 'HOME OFFICE'");
        }

        System.out.println("====================");
    }
}