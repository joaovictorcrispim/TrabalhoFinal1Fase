/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Turma> turmas = new ArrayList<>();
        List<Responsavel> responsaveis = new ArrayList<>();
        Agenda agenda = new Agenda();
        
        Endereco end1 = new Endereco("Rua1", 88107456, 65, "Forquilhas", "São José", "SC");
        Endereco end2 = new Endereco("Rua2", 88107457, 66, "Forquilhas", "São José", "SC");
        Endereco end3 = new Endereco("Rua3", 88107458, 67, "Forquilhas", "São José", "SC");
        Endereco end4 = new Endereco("Rua4", 88107459, 68, "Forquilhas", "São José", "SC");
        Endereco end5 = new Endereco("Rua5", 88107460, 69, "Forquilhas", "São José", "SC");
        
        
        Professor professor1 = new Professor("Julio", 00124563212, LocalDate.parse("31/05/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "145789", end1);
        Professor professor2 = new Professor("Mario", 00124564411, LocalDate.parse("24/05/1985", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "987456", end2);
        professores.add(professor1);
        professores.add(professor2);
        
        Turma turma1 = new Turma("Pre","A1",professor1);
        Turma turma2 = new Turma("Maternal","A2",professor2);
        turmas.add(turma1);
        turmas.add(turma2);
        
        Responsavel responsavel1 = new Responsavel("Lucas", 00124523411, LocalDate.parse("23/12/1975", DateTimeFormatter.ofPattern("dd/MM/yyyy")), null, end3);
        Responsavel responsavel2 = new Responsavel("Borges", 00124500411, LocalDate.parse("05/10/1978", DateTimeFormatter.ofPattern("dd/MM/yyyy")), null, end4);
        Responsavel responsavel3 = new Responsavel("Fernando", 00124501411, LocalDate.parse("13/12/1979", DateTimeFormatter.ofPattern("dd/MM/yyyy")), null, end5);
        responsaveis.add(responsavel1);
        responsaveis.add(responsavel2);
        responsaveis.add(responsavel3);
        
        Aluno aluno1 = new Aluno("João", 00124563212, LocalDate.parse("31/08/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")),responsavel1, "6598741", end3);
        responsavel1.setAluno(aluno1);
        Aluno aluno2 = new Aluno("Wilson", 00004563212, LocalDate.parse("21/09/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")),responsavel2, "4567841", end4);
        responsavel2.setAluno(aluno2);
        Aluno aluno3 = new Aluno("Weverton", 00111563212, LocalDate.parse("01/11/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")),responsavel3, "6879654", end5);
        responsavel3.setAluno(aluno3);
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);
        
        try {
            boolean continuar = true;

            do {
                System.out.println("Bem vindo ao SEJ");
                System.out.println("");
                System.out.println("Opções de Login:");
                System.out.println("Admin - 1");
                System.out.println("Professor - 2");
                System.out.println("Responsável - 3");
                System.out.println("Sair - 4");

                String login = JOptionPane.showInputDialog(null, "Login:");

                switch (login) {

                    case "1":
                        boolean cont = true;

                        System.out.println("Logou como admin");
                        do {
                            System.out.println("Menu do admin");
                            System.out.println("");
                            System.out.println("Cadastrar alunos - 1");
                            System.out.println("Cadastrar professores - 2");
                            System.out.println("Cadastrar responsavel - 3");
                            System.out.println("Cadastrar turmas - 4");
                            System.out.println("Alocar alunos em turmas - 5");
                            System.out.println("Conferir turma - 6");
                            System.out.println("Sair - 7");
                            int op = sc.nextInt();

                            switch (op) {

                                case 1:
                                    Aluno al = Cadastros.cadastrarAluno();
                                    alunos.add(al);
                                    break;
                                case 2:
                                    Professor profe = Cadastros.cadastrarProfessor();
                                    professores.add(profe);
                                    break;
                                case 3:
                                    System.out.println("Aluno que deseja adicionar responsável:");
                                    String aluno = sc.nextLine();
                                    for (Aluno alun : alunos) {
                                        if (alun.getNome().equalsIgnoreCase(aluno)) {
                                            Cadastros.cadastrarResponsavel(alun);
                                        } else {
                                            System.out.println("Aluno não cadastrado");
                                        }
                                    }

                                    break;
                                case 4:
                                    System.out.println("Professor selecionado para a turma:");
                                    String prof = sc.nextLine();
                                    for (Professor p : professores) {
                                        if (p.getNome().equalsIgnoreCase(prof)) {
                                            Turma t1 = Cadastros.cadastrarTurma(p);
                                        } else {
                                            System.out.println("Professor não cadastrado");
                                        }
                                    }
                                    System.out.println("Deseja adicionar alunos?");
                                    String resp1 = sc.next();
                                    if (resp1.equalsIgnoreCase("não")) {
                                        break;
                                    }
                                case 5:
                                    boolean seguir = true;
                                    System.out.println("Turma para adiconar alunos:");
                                    String t2 = sc.next();
                                    for (Turma t : turmas) {
                                        if (t.getNome().equalsIgnoreCase(t2)) {
                                            do {
                                                System.out.println("Aluno:");
                                                String alun = sc.nextLine();
                                                for (Aluno al1 : alunos) {
                                                    if (al1.getNome().equalsIgnoreCase(alun)) {
                                                        t.adicionarAluno(al1);
                                                    } else {
                                                        System.out.println("Aluno não cadastrado");
                                                    }
                                                }
                                                System.out.println("Cadastrar mais alunos?(sim/não)");
                                                String resp = sc.next();
                                                if (resp.equalsIgnoreCase("não")) {
                                                    seguir = false;
                                                }
                                            } while (seguir);
                                        }

                                    }

                                    break;
                                case 6:
                                    System.out.println("Turma para conferir");
                                    String turma = sc.next();
                                    for (Turma t : turmas) {
                                        if (t.getNome().equalsIgnoreCase(turma)) {
                                            System.out.println("Turma: " + t.getNome());
                                            System.out.println("Professor: " + t.getProfessor().getNome());
                                            System.out.println("Alunos:");
                                            for (Aluno al4 : t.getAluno()) {
                                                System.out.println(al4.getNome());
                                            }break;
                                        } else {
                                            System.out.println("Turma não cadastrada");
                                        }
                                    }
                                    break;
                                case 7:
                                    cont = false;
                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, "Por favor escolha uma opção válida");
                            }
                        } while (cont);
                    case "2":
                        boolean cont1 = true;

                        JOptionPane.showMessageDialog(null, "Logou como professor");
                        System.out.println("Nome do professor:");
                        String nomeProf = sc.nextLine();
                        do {
                            System.out.println("Menu do profesor");
                            System.out.println("");
                            System.out.println("Alterar dados pessoais - 1");
                            System.out.println("Fazer chamada - 2");
                            System.out.println("Enviar mensagem - 3");
                            System.out.println("Sair - 4");
                            String op1 = JOptionPane.showInputDialog(null, "Opção:");
                            switch (op1) {
                                case "1":
                                    for (Professor p2 : professores) {
                                        if (p2.getNome().equalsIgnoreCase(nomeProf)) {
                                            AlterarDados.alterarProfessor(p2);
                                        }
                                    }
                                    break;
                                case "2":
                                    for (Turma t1 : turmas) {
                                        if (t1.getProfessor().getNome().equalsIgnoreCase(nomeProf)) {
                                            t1.chamada();
                                        } else {
                                            System.out.println("Professor não cadastrado");
                                        }
                                    }
                                    break;
                                case "3":
                                    for (Professor p3 : professores) {
                                        if (p3.getNome().equalsIgnoreCase(nomeProf)) {
                                            System.out.println("Destinatário:");
                                            String destino = sc.nextLine();
                                            sc.next();
                                            for (Aluno al4 : alunos) {
                                                if (al4.getNome().equalsIgnoreCase(destino)) {
                                                    System.out.println("Mensagem:");
                                                    String mens = sc.nextLine();
                                                    Mensagem msg = new Mensagem(p3, al4, mens);
                                                    agenda.adiconarMensagem(msg);
                                                    agenda.visualizarMensagens();
                                                } else {
                                                    System.out.println("Aluno não cadastrado");
                                                }
                                            }
                                        } else {
                                            System.out.println("Professor não cadastrado");
                                        }
                                    }

                                    break;
                                case "4":
                                    cont1 = false;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Por favor escolha uma opção válida");
                            }
                            break;
                        } while (cont1);
                    case "3":
                        boolean cont2 = true;
                        JOptionPane.showMessageDialog(null, "Logou como responsável");
                        System.out.println("Nome do Responsável:");
                        String nomeResp = sc.nextLine();
                        do {
                            System.out.println("Menu do responsável");
                            System.out.println("");
                            System.out.println("Alterar dados pessoais - 1");
                            System.out.println("Alterar dados do aluno - 2");
                            System.out.println("Enviar mensagem - 3");
                            System.out.println("Sair - 4");
                            String op2 = JOptionPane.showInputDialog(null, "Opção:");
                            switch (op2) {
                                case "1":
                                    for (Responsavel r2 : responsaveis) {
                                        if (r2.getNome().equalsIgnoreCase(nomeResp)) {
                                            AlterarDados.alterarResponsavel(r2);

                                        } else {
                                            System.out.println("Responsavel não cadastrado");
                                        }
                                    }
                                    break;
                                case "2":
                                    for (Responsavel r3 : responsaveis) {
                                        if (r3.getNome().equalsIgnoreCase(nomeResp)) {
                                            Aluno al2 = r3.getAluno();
                                            AlterarDados.alterarAluno(al2);
                                            agenda.visualizarMensagens();
                                        }
                                    }
                                    break;
                                case "3":
                                    for (Responsavel r1 : responsaveis) {
                                        if (r1.getNome().equalsIgnoreCase(nomeResp)) {
                                            System.out.println("Destinatário:");
                                            String destino = sc.nextLine();
                                            sc.next();
                                            for (Professor pf4 : professores) {
                                                if (pf4.getNome().equalsIgnoreCase(destino)) {
                                                    System.out.println("Mensagem:");
                                                    String mens = sc.nextLine();
                                                    Mensagem msg = new Mensagem(r1, pf4, mens);
                                                    agenda.adiconarMensagem(msg);
                                                } else {
                                                    System.out.println("Professor não cadastrado");
                                                }
                                            }
                                        } else {
                                            System.out.println("Responsavel não cadastrado");
                                        }
                                    }
                                    break;
                                case "4":
                                    cont2 = false;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Por favor escolha uma opção válida");
                            }
                            break;
                        } while (cont2);

                    case "4":
                        continuar = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Por favor escolha uma opção válida");
                }
            } while (continuar);
        } catch (Exception e) {
            System.out.println("Mensagem" + e.getMessage());
        }
    }
}
