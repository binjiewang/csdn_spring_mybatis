package net.amiba.test;

import net.amiba.Mapper.EmpMapper;
import net.amiba.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MyTest {
    @Autowired
    private EmpMapper empMapper;

    @Test
    public void test() {
        List<Emp> empList = empMapper.findAll();
        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }

}
