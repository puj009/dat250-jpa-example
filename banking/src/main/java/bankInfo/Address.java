package bankInfo;


import javax.persistence.*;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String street;
    private int number;

    @ManyToMany
    private List<Person> person = new ArrayList<Person>();
}
