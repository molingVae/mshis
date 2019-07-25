package com.mshis.medicalSystem.dao.pharmacy;

import com.mshis.medicalSystem.pojo.bean.Uh03CompanyList;
import io.swagger.models.auth.In;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 小白的PC on 2019/7/18
 */
public interface Uh03CompanyListDao extends JpaRepository<Uh03CompanyList,Integer> {

    Page<Uh03CompanyList> findAllByComNameContaining(String name, Pageable pageable);
}
