package com.mshis.medicalSystem.service.pharmacy;

import com.mshis.medicalSystem.dao.pharmacy.Uh03PriceDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.PageInfo;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh03Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * description:调价
 * author: 小白
 * create: 2019-07-18 10:18
 */
@Service
public class PharmacyPriceService {

    @Autowired
    private Uh03PriceDao uh03PriceDao;


    public Result query(Uh03Price uh03Price, int page, int size) {
        System.out.println(uh03Price.toString());
       Page<Uh03Price> pageData= uh03PriceDao.findAllByMediNameContaining(
               uh03Price.getMediName(),new PageRequest(page-1,size));
        return new Result(Code.OK,"查询成功",new PageInfo(pageData.getTotalElements(),pageData.getContent()));
    }


    public Result add(Uh03Price uh03Price) {
        uh03PriceDao.save(uh03Price);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        uh03PriceDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }

    public Result save(Uh03Price uh03Price) {
        uh03PriceDao.save(uh03Price);
        return new Result(Code.OK,"修改成功");
    }
}