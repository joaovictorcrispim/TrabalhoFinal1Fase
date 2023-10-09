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
public class Mensagem extends Agenda{
    
    private String mensagem;
    private Pessoa origem;
    private Pessoa destino;
    private LocalDate data;
    
    public Mensagem (Pessoa origem, Pessoa destino, String mensagem){
        this.origem = origem;
        this.destino = destino;
        this.mensagem = mensagem;
        this.data = LocalDate.now();
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Pessoa getOrigem() {
        return origem;
    }

    public void setOrigem(Pessoa origem) {
        this.origem = origem;
    }

    public Pessoa getDestino() {
        return destino;
    }

    public void setDestino(Pessoa destino) {
        this.destino = destino;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public void imprimir(){
        System.out.println("Origem: " + origem.getNome());
        System.out.println("Destino: " + destino.getNome());
        System.out.println("Mensagem: " + mensagem);
    }
    
}
