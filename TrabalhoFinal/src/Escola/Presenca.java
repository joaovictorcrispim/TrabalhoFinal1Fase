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
public class Presenca {
    
    private boolean presenca;
    private LocalDate data;
    private Aluno aluno;
    
    public Presenca (boolean presenca,Aluno aluno){
        this.presenca = presenca;
        this.data = LocalDate.now();
        this.aluno = aluno;
    }
    
    public void imprimirPresenca(){
        System.out.println("Aluno:" + aluno.getNome());
        System.out.println("Data:" + data);
        if(presenca == true){
            System.out.println("Presente");
        }else{
            System.out.println("Faltou");
        }
    }
}
