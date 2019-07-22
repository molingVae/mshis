package com.mshis.medicalSystem.service.hospitalization;

import com.mshis.medicalSystem.dao.hospitalization.PayMoneyDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.PayMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description: 病人预交款情况登记
 * author: 冯凡利
 * create:  2019/7/18 15:37
 */
@Service
public class PayMoneyService {

    @Autowired
    private PayMoneyDao payMoneyDao;

    @Autowired
    private Code code;

    /**
     * 添加 病人预交款情况登记
     * @param payMoney
     * @return
     */
    public Result addPayMoney(PayMoney payMoney){
        payMoneyDao.save(payMoney);
        Result result = new Result(Code.OK, "添加成功");
        return result;
    }
}
