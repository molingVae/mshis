package com.mshis.medicalSystem.service.hospitalization;

import com.mshis.medicalSystem.dao.hospitalization.WardBedDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Ward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description: 床位登记
 * author: 冯凡利
 * create:  2019/7/18 11:29
 */
@Service
public class WardBedService {

    @Autowired
    private WardBedDao wardBedDao;

    @Autowired
    private Code code;

    /**
     * 床位 登记（添加）
     * @param ward
     * @return
     */
    public Result addWardBed(Ward ward){
        wardBedDao.save(ward);
        Result result  = new Result(Code.OK, "插入成功");
        return result;
    }

    /**
     * 床位 修改（修改）
     * @param ward
     * @return
     */
    public Result aupdateWardBed(Ward ward){
        wardBedDao.save(ward);
        Result result  = new Result(Code.OK, "修改成功");
        return result;
    }

    public Result getAll(){
        Result result=new Result(Code.OK,"");
        result.setData(wardBedDao.findAll());
        return result;
    }
}
