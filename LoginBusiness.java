package business;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import model.Login;

public class LoginBusiness {

	static EntityManagerFactory emf;
	static EntityManager em;
	static LoginBusiness instance;
	Login login;
	ArrayList<Login> usersLogin = new ArrayList<>();

	public LoginBusiness() {

	}

	{
		emf = Persistence.createEntityManagerFactory("search");
		em = emf.createEntityManager();
	}

	public static LoginBusiness getInstance() {
		if (instance == null) {
			instance = new LoginBusiness();
		}
		return instance;
	}

	public void saveLogin(Login logDetails) {
		em.getTransaction().begin();
		em.persist(logDetails);
		System.out.println("login details  saved");
		em.getTransaction().commit();
		em.close();

	}

}
