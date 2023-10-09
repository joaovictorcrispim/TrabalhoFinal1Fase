/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class Agenda {
    
    private List<Mensagem> mensagens = new ArrayList<>();
    
    public void adiconarMensagem (Mensagem mensagem){
        mensagens.add(mensagem);
    }
    
    public void visualizarMensagens(){
        for(Mensagem m : mensagens){
            m.imprimir();
        }
    }
}
