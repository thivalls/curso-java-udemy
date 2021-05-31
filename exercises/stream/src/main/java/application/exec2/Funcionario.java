package application.exec2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Funcionario {
    private String name;
    private String email;
    private Double salario;
}
