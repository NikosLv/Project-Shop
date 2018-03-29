package test_work.proektDZ;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import proektDzentity.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
    	EntityManager em=factory.createEntityManager();
    	
    	em.getTransaction().begin();
    	
    	
    /*  User user = new User();
    	user.setLogin("user_login");
    	user.setPassword("user_password");
    	user.setName("Ivan");
    	user.setSurname("Petrenko");						//Create User
    	user.setEmail("bla@bla");						
    	user.setPhone("0982624578");
    	user.setUserLocation("Lviv");
    	System.out.println("User ID: "+user.getId());
    	em.persist(user);
    	System.out.println("User ID: "+user.getId());  */
    	
    	
    	User user =em.find(User.class, 2);
    	System.out.println(user.getName()+" "+user.getSurname());
    	
    	user.setName("Petro");
    	
    	
    	
    	
    	
    	em.getTransaction().commit();
    	em.close();
    	factory.close();
    	
    	
    }
}
