package com.mshis.medicalSystem.service.hospitalization;

import com.mshis.medicalSystem.dao.hospitalization.MonthBalanceDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh03MonthBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: 月报表
 * author: 冯凡利
 * create:  2019/7/18 14:52
 */
@Service
public class MonthBalanceService {

    @Autowired
    private MonthBalanceDao monthBalanceDao;

    @Autowired
    private Code code;

    /**
     * 插入月报表
     */
    public Result addMonthBalance(Uh03MonthBalance uh03MonthBalance){
        monthBalanceDao.save(uh03MonthBalance);
        Result result = new Result(Code.OK, "添加成功");
        return result;
    }


    /**
     * 获取月报表
     */
    public Result getAllMonthBalance(){
        List<Uh03MonthBalance> all = monthBalanceDao.findAll();
        Result result = new Result(Code.OK, "查找成功", all);
        return result;
    }

    /**
     * 删除月报表
     */
    public Result deleteMonthBalance(int id){
        monthBalanceDao.deleteById(id);
        Result result = new Result(Code.OK, "删除成功");
        return result;
    }
}
