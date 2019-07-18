package com.mshis.medicalSystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

    @Autowired
    private TcmDao tcmDao;

    @Test
    public void contextLoads() {
    }


    @Test
    public void  test1(){

        System.out.println(tcmDao.findTcmsByIdAndAlias(1, null));


    }

    @Test
    public void  test2(){

//        System.out.println(tcmDao.findTcmsByIdOrAlias(1, "1"));
//    tcmDao.getTCMMMMMByid(1).

    }
}
