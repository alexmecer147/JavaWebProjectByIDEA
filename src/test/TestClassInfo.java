package test;

import JPATest.Dao.ClassInfoDao;
import JPATest.ENTITY.ClassInfo;

import java.util.Collection;

/**
 * @author Kanfeer
 * @package_name test
 * @date 2020/11/26 - 10:04
 * @project_name NewProjectByIDEA
 */
public class TestClassInfo {
    public static void main(String[] args) {
        ClassInfo p = new ClassInfo();
        p.setClassName("外-英语210");
        int id = 36;
        ClassInfoDao.insert(p,id);
       // p.setDepartment();
        //增加
        //ClassInfoDao.insert(p);
        //删除
        ClassInfoDao.deleteById(35,36);
        //修改
        //ClassInfoDao.update(29,"数学");
        //查询
        int t=1;
        //t = 8;
        Collection<ClassInfo> one = ClassInfoDao.query(t);
        Collection<ClassInfo> all = ClassInfoDao.queryAll();
        for (ClassInfo pp:all){
            System.out.println(pp.getClassId()+"===="+pp.getClassName());
        }
    }
}
