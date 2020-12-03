package JPATest.Dao;

import JPATest.ENTITY.Department;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Kanfeer
 * @package_name JPATEST.Dao
 * @date 2020/11/26 - 9:23
 * @project_name NewProjectByIDEA
 */
public class DepartmentDao {
    public static void insert(Department department) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("firstJPA");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(department);
        em.getTransaction().commit();
        em.close();
        emfactory.close();
    }

    public static void deleteById(int id){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("firstJPA");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        Department p = em.find(Department.class,id);
        System.out.println(p.getName());
        deleteByE(p);
        em.flush();
        em.getTransaction().commit();
        em.close();
        emfactory.close();
    }

    public static void deleteByE(Department department){//根据对象删除
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("firstJPA");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        department = em.merge(department);
        if (department!=null) {
            em.remove(department);
        }
        em.flush();
        em.getTransaction().commit();
        em.close();
        emfactory.close();
    }

    public static void update(int oldId,String name){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("firstJPA");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        Department p = em.find(Department.class,oldId);
        p.setName(name);
//        p.setClassInfoId(classInfoId);
        em.getTransaction().commit();
        em.close();
        emfactory.close();
    }

    public static List<Department> listAll(){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("firstJPA");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createNativeQuery("SELECT * from department",Department.class);
        List<Department> list = query.getResultList();
        em.close();
        emfactory.close();
        for(int i=0;i<list.size();i++){
            System.out.println("name"+list.get(i).getName());
        }
        return list;
    }
}
