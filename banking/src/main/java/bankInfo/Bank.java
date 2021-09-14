package bankInfo;



import javax.persistence.*;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "bank")
    List<CreditCard> creditCards = new ArrayList<CreditCard>();


}
