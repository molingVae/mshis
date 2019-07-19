package com.mshis.medicalSystem.service.outpatient;

import com.mshis.medicalSystem.dao.outpatient.CardDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by 小白的PC on 2019/7/18
 */
@Service
@Transactional
public class CardService {

    @Autowired
    private CardDao cardDao;

    public Result query() {
        return new Result(Code.OK,"查询成功",cardDao.findAll());
    }

    public Result add(Card card) {
        cardDao.save(card);
        return new Result(Code.OK,"添加成功");
    }

    public Result flag(Card card) {
        cardDao.flag(card.getFlag(),card.getId());
        return new Result(Code.OK,"挂失成功");
    }
    public Result saveMoney(Card card) {
        cardDao.saveMoney(card.getMoney(),card.getId());
        return new Result(Code.OK,"充值成功");
    }
}
