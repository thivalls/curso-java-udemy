package application.exec2;

import java.util.HashSet;
import java.util.Set;

public class main2 {
    public static void main(String[] args) {
        Student stud1 = new Student("Thiago");
        Student stud2 = new Student("Thalita");
        Student stud3 = new Student("Amanda");
        Student stud4 = new Student("Theo");
        Student stud5 = new Student("Iraci");
        Student stud6 = new Student("Bete");

        Instructor instructor = new Instructor("Paulo");

        Curso c1 = new Curso("Financeiro", instructor);
        c1.adicionaAluno(stud1);
        c1.adicionaAluno(stud2);
        c1.adicionaAluno(stud3);

        Curso c2 = new Curso("Programacao", instructor);
        c2.adicionaAluno(stud1);
        c2.adicionaAluno(stud2);
        c2.adicionaAluno(stud4);
        c2.adicionaAluno(stud5);
        c2.adicionaAluno(stud6);

        Set<Student> todosAlunosPaulo = new HashSet<Student>(c1.getStudents());
        todosAlunosPaulo.addAll(c2.getStudents());

        System.out.println("Alunos curso 1");
        System.out.print("[");
        for (Student student : c1.getStudents()) {
            System.out.print(" " + student.getName() + " ");
        }
        System.out.println("]");

        System.out.println("Alunos curso 2");
        System.out.print("[");
        for (Student student : c2.getStudents()) {
            System.out.print(" " + student.getName() + " ");
        }
        System.out.println("]");

        System.out.println("O professor paulo tem " + todosAlunosPaulo.size() + " alunos em seus cursos.");

    }
}
