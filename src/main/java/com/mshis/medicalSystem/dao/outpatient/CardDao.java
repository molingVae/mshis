package com.mshis.medicalSystem.dao.outpatient;

import com.mshis.medicalSystem.pojo.bean.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by 小白的PC on 2019/7/19
 */
public interface CardDao extends JpaRepository<Card,Integer> {
    @Modifying
    @Query(value = "update card set flag=?1 Where id=?2",nativeQuery = true)
    void flag(Integer flag,Integer id);

    @Modifying
    @Query(value = "update card set money=money+?1 Where id=?2",nativeQuery = true)
    void saveMoney(Double money,Integer id);
}
