package application.exec2;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Curso {
    private String name;
    private Instructor instructor;
    private Set<Student> students = new HashSet<Student>();

    public Curso(String name, Instructor instructor) {
        this.name = name;
        this.instructor =  instructor;
    }

    public void adicionaAluno(Student student) {
        this.students.add(student);
    }
}
