package com.mshis.medicalSystem.service.hospitalization;

import com.mshis.medicalSystem.dao.hospitalization.OwnExpenseDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh04OwnExpense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: 住院部资金日报表
 * author: 冯凡利
 * create:  2019/7/18 15:03
 */
@Service
public class OwnExpenseService {

    @Autowired
    private OwnExpenseDao ownExpenseDao;

    @Autowired
    private Code code;

    public Result getAllOwnExpense(){
        List<Uh04OwnExpense> all = ownExpenseDao.findAll();
        Result result = new Result(Code.OK, "查询成功",all);
        return result;
    }

}
