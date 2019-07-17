package com.lcp.medicalSystem.service.impl;

import com.lcp.medicalSystem.dao.TcmDao;
import com.lcp.medicalSystem.pojo.Code;
import com.lcp.medicalSystem.pojo.PageInfo;
import com.lcp.medicalSystem.pojo.Result;
import com.lcp.medicalSystem.pojo.Tcm;
import com.lcp.medicalSystem.service.TcmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-17 8:50
 */

@Service
@Transactional
public class TcmServiceImpl implements TcmService {

    @Autowired
    private TcmDao tcmDao;

    //@Cacheable(cacheNames = "tcm",key = "#title")
    public Result getTcmByTitle(String title, int page, int size) {
        Pageable pageable = new PageRequest(page, size,new Sort(Sort.Direction.DESC,"id"));
        Page<Tcm> pageData = tcmDao.findByTitleContaining(title, pageable);
        PageInfo pageInfo = new PageInfo(pageData.getTotalElements(), pageData.getContent());
        return new Result(Code.OK, "success", pageInfo);
    }

}
