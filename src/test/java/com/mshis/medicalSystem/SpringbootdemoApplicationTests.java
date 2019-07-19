package com.mshis.medicalSystem;

import com.mshis.medicalSystem.dao.pharmacy.Uh03OnStoreDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {


    @Autowired
    private Uh03OnStoreDao uh03OnStoreDao;//在库

    @Test
    public void contextLoads() {

        uh03OnStoreDao.saveNum(1,1);
    }

}
