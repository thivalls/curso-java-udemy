package dominio;

import lombok.*;
import lombok.experimental.FieldNameConstants;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @FieldNameConstants.Exclude()
    private Integer id;
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
