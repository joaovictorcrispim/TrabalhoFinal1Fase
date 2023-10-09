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
public class Aluno extends Pessoa{
    
    private String matricula;
    private Responsavel responsavel;
    
    public Aluno (String nome, long cpf, LocalDate dataNasc, Responsavel responsavel, String matricula, Endereco endereco){
        super.nome = nome;
        super.cpf = cpf;
        super.dataNasc = dataNasc;
        this.matricula = matricula;
        this.responsavel = responsavel;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
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
