package bankInfo;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private int number;
    private int limit;
    private int balance;

    @ManyToOne
    private Bank bank;

    @ManyToOne
    private Person person;

    @OneToOne
    private Pincode pincode;

}
