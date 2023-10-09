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
public class Cadastros {

    public static Aluno cadastrarAluno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dados pessoais");
        System.out.println("Nome do aluno:");
        String nome = sc.nextLine();
        System.out.println("CPF:");
        long cpf = sc.nextLong();
        System.out.println("Data de nascimento:");
        String dataNasc = sc.next();
        LocalDate data = LocalDate.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Matricula:");
        String matricula = sc.next();
        System.out.println("");
        System.out.println("Dados do responsável:");
        System.out.println("Nome:");
        String nomer = sc.nextLine();
        sc.next();
        System.out.println("CPF:");
        long cpfr = sc.nextLong();
        System.out.println("Data de nascimento:");
        String dataNascr = sc.next();
        LocalDate datar = LocalDate.parse(dataNascr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("");
        System.out.println("Endereço");
        System.out.println("Rua:");
        String rua = sc.nextLine();
        sc.next();
        System.out.println("CEP:");
        int cep = sc.nextInt();
        System.out.println("Número:");
        int num = sc.nextInt();
        System.out.println("Bairro:");
        String bairro = sc.nextLine();
        sc.next();
        System.out.println("Cidade:");
        String cidade = sc.nextLine();
        sc.next();
        System.out.println("Estado:");
        String estado = sc.nextLine();

        Endereco end = new Endereco(rua, cep, num, bairro, cidade, estado);
        Aluno al = new Aluno(nome, cpf, data, null, matricula, end);
        Responsavel rp = new Responsavel(nomer, cpfr, datar, al, end);
        al.setResponsavel(rp);

        System.out.println("Cadastro realizado");
        al.imprimeDados();
        rp.imprimeDados();
        return al;
    }
    
    public static void cadastrarResponsavel(Aluno aluno){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dados do responsável:");
        System.out.println("Nome:");
        String nomer = sc.nextLine();
        sc.next();
        System.out.println("CPF:");
        long cpfr = sc.nextLong();
        System.out.println("Data de nascimento:");
        String dataNascr = sc.next();
        LocalDate datar = LocalDate.parse(dataNascr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("");
        System.out.println("Endereço");
        System.out.println("Rua:");
        String rua = sc.nextLine();
        sc.next();
        System.out.println("CEP:");
        int cep = sc.nextInt();
        System.out.println("Número:");
        int num = sc.nextInt();
        System.out.println("Bairro:");
        String bairro = sc.nextLine();
        sc.next();
        System.out.println("Cidade:");
        String cidade = sc.nextLine();
        sc.next();
        System.out.println("Estado:");
        String estado = sc.nextLine();
        
        Endereco end = new Endereco(rua, cep, num, bairro, cidade, estado);
        Responsavel rp = new Responsavel(nomer, cpfr, datar, aluno, end);
        aluno.setResponsavel(rp);
        rp.imprimeDados();
    }
    
    public static Professor cadastrarProfessor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dados pessoais");
        System.out.println("Nome do professor:");
        String nome = sc.nextLine();
        System.out.println("CPF:");
        long cpf = sc.nextLong();
        System.out.println("Data de nascimento:");
        String dataNasc = sc.next();
        LocalDate data = LocalDate.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Matricula:");
        String matricula = sc.next();
        System.out.println("");
        System.out.println("Endereço");
        System.out.println("Rua:");
        String rua = sc.nextLine();
        sc.next();
        System.out.println("CEP:");
        int cep = sc.nextInt();
        System.out.println("Número:");
        int num = sc.nextInt();
        System.out.println("Bairro:");
        String bairro = sc.nextLine();
        sc.next();
        System.out.println("Cidade:");
        String cidade = sc.nextLine();
        sc.next();
        System.out.println("Estado:");
        String estado = sc.nextLine();
        
        Endereco end = new Endereco(rua, cep, num, bairro, cidade, estado);
        Professor pf = new Professor(nome, cpf, data, matricula, end);
        return pf;
    }
    
    public static Turma  cadastrarTurma(Professor professor){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome da turma:");
        String turma = sc.next();
        System.out.println("Sala:");
        String sala = sc.next();
        Turma t = new Turma(turma,sala,professor);
        return t;
    }

}
