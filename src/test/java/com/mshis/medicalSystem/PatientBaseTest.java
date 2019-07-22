package com.mshis.medicalSystem;

import com.mshis.medicalSystem.dao.hospitalizationControllerDao.PatientBaseDao;
import com.mshis.medicalSystem.pojo.bean.PatientBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Classname PatientBaseTest
 * @Created by fanli
 * @Description TODO
 * @Date 2019/7/18 9:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientBaseTest {

    @Autowired
    private PatientBaseDao patientBaseDao;

    @Test
    public void test01(){
        PatientBase p = new PatientBase(1,null,null,null,null,null,null,null,null,null,null,null,
                null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
        PatientBase save = patientBaseDao.save(p);
        System.out.println(save);
    }


}
