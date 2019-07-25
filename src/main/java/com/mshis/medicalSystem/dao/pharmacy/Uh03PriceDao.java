package com.mshis.medicalSystem.dao.pharmacy;

import com.mshis.medicalSystem.pojo.bean.Uh03Price;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Uh03PriceDao extends JpaRepository<Uh03Price,Integer> {

    Page<Uh03Price> findAllByMediNameContaining(String name,Pageable pageable);
}
