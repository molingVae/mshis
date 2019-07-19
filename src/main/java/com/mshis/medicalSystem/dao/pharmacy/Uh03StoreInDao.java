package com.mshis.medicalSystem.dao.pharmacy;

import com.mshis.medicalSystem.pojo.bean.Uh03StoreIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * description:  入库表dao
 * author: 小白
 * create: 2019-07-18 10：17
 */
public interface Uh03StoreInDao extends JpaRepository<Uh03StoreIn,Integer> {
}
