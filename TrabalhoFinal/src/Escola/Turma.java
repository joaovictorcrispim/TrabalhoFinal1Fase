/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class Turma {

    private String nome;
    private String sala;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor professor;
    private List<Presenca> presencas = new ArrayList<>();

    public Turma(String nome, String sala, Professor professor) {
        this.nome = nome;
        this.sala = sala;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public List<Aluno> getAluno() {
        return alunos;
    }

    public void setAluno(List<Aluno> aluno) {
        this.alunos = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Presenca> getPresenca() {
        return presencas;
    }

    public void setPresenca(List<Presenca> presenca) {
        this.presencas = presenca;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void adicionarPresenca(boolean presenca, Aluno aluno) {
        Presenca p = new Presenca(presenca, aluno);
        this.presencas.add(p);
    }

    public void chamada() {
        boolean presenca;
        for (Aluno p : alunos) {
            int resposta = JOptionPane.showConfirmDialog(null, p.getNome() + "Presente?");
            if (resposta == JOptionPane.YES_OPTION) {
                presenca = true;
            } else {
                presenca = false;
            }
            adicionarPresenca(presenca, p);
        }
        for(Presenca p1 : presencas){
            p1.imprimirPresenca();
        }
    }
}
