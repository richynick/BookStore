import com.richard.bookstorewebsite.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UsersTest {

    public static void main(String[] args){
        Users user_1 = new Users();
        user_1.setEmail("kel@gmail.com");
        user_1.setFullName("richy Nick");
        user_1.setPassword("123456");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(user_1 );
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("User Data Persisted");
    }
}
