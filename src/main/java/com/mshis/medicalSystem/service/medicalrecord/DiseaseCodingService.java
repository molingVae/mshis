package com.mshis.medicalSystem.service.medicalrecord;

import com.mshis.medicalSystem.dao.medicalrecord.DiseaseCodingDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.PageInfo;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Diagnose;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 9:13
 */
@Service
public class DiseaseCodingService {

    @Autowired
    private DiseaseCodingDao diseaseCodingDao;


    public Result query(Diagnose diagnose,int page,int size) {
        Pageable pageable=new PageRequest(page-1,size);
        Page<Diagnose> pageData;
        System.out.println(diagnose);
        if(diagnose==null){
            pageData = diseaseCodingDao.findAll(pageable);
        }else{
            pageData=diseaseCodingDao.findAllByDiseaseIcd9ContainingAndDiseaseIc9NameContaining(
                    diagnose.getDiseaseIcd9(),diagnose.getDiseaseIc9Name(),pageable);
        }

        PageInfo pageInfo=new PageInfo(pageData.getTotalElements(),pageData.getContent());
        return new Result(Code.OK,"查询成功",pageInfo);
    }


    public Result add(Diagnose diagnose) {
        diseaseCodingDao.save(diagnose);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        diseaseCodingDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }

    public Result updata(Diagnose diagnose) {
        diseaseCodingDao.save(diagnose);
        return new Result(Code.OK,"修改成功");
    }
}
