package com.mshis.medicalSystem.service.hospitalizationControllerService;

import com.mshis.medicalSystem.dao.hospitalizationControllerDao.ChargeTypeDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.ChargeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: 收费标准管理
 * author: 冯凡利
 * create:  2019/7/18 15:14
 */
@Service
public class ChargeTypeService {


    @Autowired
    private ChargeTypeDao chargeTypeDao;

    @Autowired
    private Code code;


    /**
     * 添加 收费标准管理
     * @param chargeType
     * @return
     */
    public Result addChargeType(ChargeType chargeType){
        chargeTypeDao.save(chargeType);
        Result result = new Result(Code.OK, "添加成功");
        return result;
    }

    /**
     * 查询 收费标准管理
     * @return
     */
    public Result getAllChargeType(){
        List<ChargeType> all = chargeTypeDao.findAll();
        Result result = new Result(Code.OK, "查询成功", all);
        return result;
    }

    /**
     * 修改 收费标准管理
     * @return
     */
    public Result updateChargeType(ChargeType chargeType){
        chargeTypeDao.save(chargeType);
        Result result = new Result(Code.OK, "修改成功");
        return result;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    public Result deleteChargeType(int  id){
        chargeTypeDao.deleteById(id);
        Result result = new Result(Code.OK, "删除成功");
        return result;
    }

}
