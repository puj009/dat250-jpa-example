package bankInfo;

import javax.persistence.*;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name;

    @OneToMany (mappedBy = "person")
    private List<CreditCard> creditCards = new ArrayList<CreditCard>();

    @ManyToMany
    private List<Address> addresses = new ArrayList<Address>();

}
