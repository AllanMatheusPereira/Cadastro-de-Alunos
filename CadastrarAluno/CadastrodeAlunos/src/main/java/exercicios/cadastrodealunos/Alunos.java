/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.cadastrodealunos;

/**
 *
 * @author allan
 */
public class Alunos {
    String nome;
    int ra;
    int idade;
    char sexo;
    boolean matriculado; 

    public Alunos(String anome, int ara, int aidade, char asexo, boolean amatriculado) {
        nome = anome;
        idade = aidade;
        ra = ara;
        sexo = asexo;
        matriculado = amatriculado;
    }
    public String getDadosPessoaisAlunos(){
        return " Nome do aluno: " + nome +  " Idade: " + idade + " Sexo: " + sexo;
    }
    public String getDadosAcademicosAlunos(){
        return " R.A: " + ra + " Está matriculado: " + matriculado;
    }

}
    

