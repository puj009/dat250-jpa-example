package bankInfo;

import javax.persistence.*;

import lombok.Data;

import java.security.PrivateKey;

@Entity
@Data
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private String pincode;
    private int count;

    @OneToOne
    private CreditCard creditCard;
}
