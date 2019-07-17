package com.mshis.medicalSystem.dao;

import com.mshis.medicalSystem.pojo.Tcm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * description:
 * author: 沫凌
 * create: 2019-07-14 9:21
 */
public interface TcmDao  extends JpaRepository<Tcm,Integer> {

     Page<Tcm> findByTitleContaining(String title, Pageable pageable);

}
