package com.mshis.medicalSystem.dao.pharmacy;

import com.mshis.medicalSystem.pojo.bean.Uh03OnStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface Uh03OnStoreDao extends JpaRepository<Uh03OnStore,Integer> {

    @Modifying
    @Query(value = "update uh03on_store set quantity=quantity+?1 Where medi_no=?2",nativeQuery = true)
    void saveNum(Integer quantity,Integer medi_no);

    @Modifying
    @Query(value = "update uh03on_store set quantity=quantity-?1 Where medi_no=?2",nativeQuery = true)
    void saveNum2(Integer quantity,Integer medi_no);
}
