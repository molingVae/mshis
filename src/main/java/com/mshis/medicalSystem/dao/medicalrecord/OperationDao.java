package com.mshis.medicalSystem.dao.medicalrecord;

import com.mshis.medicalSystem.pojo.bean.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 9:59
 */
public interface OperationDao extends JpaRepository<Operation,Integer> {

    Page<Operation> findAllByOperationNumAndOperationTimes(Integer num,Integer time,Pageable pageable);
}
