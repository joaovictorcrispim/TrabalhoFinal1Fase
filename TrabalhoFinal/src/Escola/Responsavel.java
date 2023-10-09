/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

import java.time.LocalDate;


/**
 *
 * @author maria
 */
public class Responsavel extends Pessoa{
    
    
    private Aluno aluno;
    
    public Responsavel (String nome, long cpf, LocalDate dataNasc, Aluno aluno, Endereco endereco){
        super.nome = nome;
        super.cpf = cpf;
        super.dataNasc = dataNasc;
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public long getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public LocalDate getDataNasc() {
        return dataNasc;
    }

    @Override
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    @Override
    public void imprimeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data Nascimento: " + dataNasc);
        endereco.imprimeDados();
    }
}
