package test;

import entity.Student;
import entity.StudentId;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Kanfeer
 * @package_name entity
 * @date 2020/11/23 - 18:50
 * @project_name NewProjectByIDEA
 */
public class StudentTest {
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("firstJPA");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        Student p = new Student();
        p.setName("李华11");
        StudentId sid = new StudentId();
        sid.setIdCardNumber("4999913231233359");
        p.setSid(sid);
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        emfactory.close();
    }
}
