package test;

import entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Kanfeer
 * @package_name test
 * @date 2020/11/21 - 10:41
 * @project_name NewProjectByIDEA
 */
public class UserTest {
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("firstJPA");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        User user = new User();
        user.setName("lihua88");
        user.setAge(40);
        user.setPassword("321");
        user.setBirthday("2021-8-7");
        user.setMoney(400000);
        user.setSex("female");
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emfactory.close();
    }
}
