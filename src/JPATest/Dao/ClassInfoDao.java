package JPATest.Dao;

import JPATest.ENTITY.ClassInfo;
import JPATest.ENTITY.Department;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kanfeer
 * @package_name JPATEST.Dao
 * @date 2020/11/26 - 9:23
 * @project_name NewProjectByIDEA
 */
public class ClassInfoDao {

    public static void insert(ClassInfo classInfo, int departmentId){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("firstJPA");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        Department department = em.find(Department.class,departmentId);
        if (department != null) {
            classInfo.setDepartment(department);
            em.persist(classInfo);
        }else {
            em.persist(classInfo);
        }
        em.getTransaction().commit();
        em.close();
        emfactory.close();
    }

    public static void deleteById(int classId,int departmentId){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("firstJPA");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        ClassInfo p = em.find(ClassInfo.class,classId);
        Department d = em.find(Department.class,departmentId);
        p = em.merge(p);
        d.getClassInfos().remove(p);
        em.flush();
        em.remove(p);
        em.getTransaction().commit();
        em.close();
        emfactory.close();
    }
    public static void update(int old, String name){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("firstJPA");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        ClassInfo p = em.find(ClassInfo.class,old);
        p.setClassName(name);

        em.merge(p);
        em.close();
        emfactory.close();
    }
    public static List<ClassInfo> query(int id){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("firstJPA");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
            ClassInfo p = em.find(ClassInfo.class,id);
            List<ClassInfo> one = new ArrayList<>();
            one.add(p);
            em.close();
            emfactory.close();
            return one;
    }


    public static List<ClassInfo> queryAll(){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("firstJPA");
        EntityManager em = emfactory.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createNativeQuery("SELECT * from classinfo", ClassInfo.class);
        List<ClassInfo> list = query.getResultList();
        em.close();
        emfactory.close();
        return list;
    }

}
