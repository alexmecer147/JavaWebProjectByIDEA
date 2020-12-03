package test;

import JPATest.Dao.DepartmentDao;
import JPATest.ENTITY.Department;

import java.util.Collection;

/**
 * @author Kanfeer
 * @package_name test
 * @date 2020/11/26 - 10:04
 * @project_name NewProjectByIDEA
 */
public class TestDepartment {
    public static void main(String[] args) {
        Department p = new Department();
        p.setName("的语");
//        p.setClassInfoId(182);
        //增加
        //DepartmentDao.insert(p);
        //删除
       // DepartmentDao.deleteById(19);
        //修改
        //DepartmentDao.update(29,"数学");
        //查询
        Collection<Department> all = DepartmentDao.listAll();
        for (Department pp:all){
            System.out.println(pp.getId()+"*******"+pp.getName());
        }
    }
}
