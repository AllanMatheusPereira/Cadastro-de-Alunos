/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.cadastrodealunos;

/**
 *
 * @author allan
 */
public class CadastrodeAlunos {

   public static void main(String[] args) {
      
       Alunos aluno1 = new Alunos("Allan Pereira " , 239726 , 26 , 'M' , false);
           System.out.println(aluno1.getDadosPessoaisAlunos());
           System.out.println(aluno1.getDadosAcademicosAlunos());
           
       Alunos aluno2 = new Alunos("Sebastião Souza " , 552247 , 43 , 'M' , false);
           System.out.println(aluno2.getDadosPessoaisAlunos());
           System.out.println(aluno2.getDadosAcademicosAlunos());
           
       Alunos aluno3 = new Alunos("Louise Cristina " , 265147 , 19 , 'F' , true);
           System.out.println(aluno3.getDadosPessoaisAlunos());
           System.out.println(aluno3.getDadosAcademicosAlunos());
          
         Turma turma1 = new Turma(" ADS " , 5 , "Allan", true  );
           System.out.println(turma1.getTurma());
           
         Turma turma2 = new Turma(" Direito " , 8 , "Sebastião" , false );
           System.out.println(turma2.getTurma());   
           
    
           if (turma1.presencial=true){
               System.out.println("Aluno matriculado.");
           }else{
               System.out.println("Aluno não faz parte da turma.");
           }
           if (turma2.presencial=false){
               System.out.println("Aluno matriculado.");
           }else{
               System.out.println("Aluno não faz parte da turma.");
           }
           
  }
}

   