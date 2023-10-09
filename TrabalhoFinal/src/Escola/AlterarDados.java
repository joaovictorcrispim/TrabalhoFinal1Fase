/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class AlterarDados {

    public static void alterarAluno(Aluno aluno) {
        Scanner sc = new Scanner(System.in);

        aluno.imprimeDados();
        System.out.println("Qual dado deseja alterar?");
        String dado = sc.nextLine();
        if (dado.equalsIgnoreCase("nome")) {
            System.out.println("Nome:");
            String nome = sc.nextLine();
            sc.next();
            aluno.setNome(nome);
        } else if (dado.equalsIgnoreCase("cpf")) {
            System.out.println("Cpf:");
            long cpf = sc.nextLong();
            sc.next();
            aluno.setCpf(cpf);
        } else if (dado.equalsIgnoreCase("Data nascimento")) {
            System.out.println("Data Nascimento:");
            String dataNasc = sc.nextLine();
            LocalDate data = LocalDate.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            aluno.setDataNasc(data);
        } else {
            System.out.println("Opção inválida");
        }
        System.out.println("Novos dados:");
        aluno.imprimeDados();
    }

    public static void alterarResponsavel(Responsavel responsavel) {
        Scanner sc = new Scanner(System.in);

        responsavel.imprimeDados();
        System.out.println("Qual dado deseja alterar?");
        String dado = sc.nextLine();
        if (dado.equalsIgnoreCase("nome")) {
            System.out.println("Nome:");
            String nome = sc.nextLine();
            sc.next();
            responsavel.setNome(nome);
        } else if (dado.equalsIgnoreCase("cpf")) {
            System.out.println("Cpf:");
            long cpf = sc.nextLong();
            sc.next();
            responsavel.setCpf(cpf);
        } else if (dado.equalsIgnoreCase("Data nascimento")) {
            System.out.println("Data Nascimento:");
            String dataNasc = sc.nextLine();
            LocalDate data = LocalDate.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            responsavel.setDataNasc(data);
        } else {
            System.out.println("Opção inválida");
        }
        System.out.println("Novos dados:");
        responsavel.imprimeDados();
    }

    public static void alterarProfessor(Professor professor) {
        Scanner sc = new Scanner(System.in);

        professor.imprimeDados();
        System.out.println("Qual dado deseja alterar?");
        String dado = sc.nextLine();
        if (dado.equalsIgnoreCase("nome")) {
            System.out.println("Nome:");
            String nome = sc.nextLine();
            sc.next();
            professor.setNome(nome);
        } else if (dado.equalsIgnoreCase("cpf")) {
            System.out.println("Cpf:");
            long cpf = sc.nextLong();
            sc.next();
            professor.setCpf(cpf);
        } else if (dado.equalsIgnoreCase("Data nascimento")) {
            System.out.println("Data Nascimento:");
            String dataNasc = sc.nextLine();
            LocalDate data = LocalDate.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            professor.setDataNasc(data);
        } else {
            System.out.println("Opção inválida");
        }
        System.out.println("Novos dados:");
        professor.imprimeDados();
        
    }
}
