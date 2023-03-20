/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.cadastrodealunos;

/**
 *
 * @author allan
 */
public class Turma {
    String curso;
    int quantidadeProfessores;
    String nomeAluno;
    boolean presencial;
  
    public Turma(String ocurso, int oquantidadeProfessores, String onomeAluno, boolean opresencial){
        curso=ocurso;
        quantidadeProfessores=oquantidadeProfessores;
        nomeAluno=onomeAluno;
        presencial=opresencial;              
    }
    public String getTurma(){
        return " Curso: " + curso + "Quantidade de professores: " + quantidadeProfessores + " Alunos: " + nomeAluno + " Curso presencial: " + presencial;
    }   
}
