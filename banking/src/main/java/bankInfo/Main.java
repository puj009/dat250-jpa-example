package bankInfo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "banking";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();


        Person person = new Person();
        person.setName("Max Mustermann");
        em.persist(person);

        Address address = new Address();
        address.setStreet("Inndalsveien");
        address.setNumber(28);
        em.persist(address);

        CreditCard card = new CreditCard();
        card.setNumber(12345);
        card.setBalance(5000);
        card.setLimit(10000);

        Pincode pin = new Pincode();
        pin.setPincode("123");
        pin.setCount(1);
        em.persist(pin);

        Bank bank = new Bank();
        bank.setName("Pengebank");
        em.persist(bank);

        em.getTransaction().commit();
        em.close();
    }
}
