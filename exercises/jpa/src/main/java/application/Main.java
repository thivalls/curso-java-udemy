package application;

import dominio.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-jpa");
        EntityManager em = emf.createEntityManager();

        Person person1 = new Person("Thiago", "olavalls@gmail.com");
        Person person2 = new Person("Amanda", "amanda@gmail.com");
        Person person3 = new Person("Theo", "theo@gmail.com");

//        em.getTransaction().begin();
//        em.persist(person1);
//        em.persist(person2);
//        em.persist(person3);
//        em.getTransaction().commit();

//        Person search = em.find(Person.class, 2);
//        em.getTransaction().begin();
//         search.setName("AMANDAMELO");
//         em.persist(search);
//        em.getTransaction().commit();
//        em.close();

        Person search = em.find(Person.class, 2);
        em.getTransaction().begin();
        em.remove(search);
        em.getTransaction().commit();
        em.close();

//        System.out.println(person1.toString());
//        System.out.println(person2.toString());
//        System.out.println(person3.toString());

        System.out.println(search);
    }
}
