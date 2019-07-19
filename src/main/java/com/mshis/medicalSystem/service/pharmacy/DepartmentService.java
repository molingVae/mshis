package com.mshis.medicalSystem.service.pharmacy;

import com.mshis.medicalSystem.dao.pharmacy.DepartmentDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 小白的PC on 2019/7/18
 */
@Service
public class DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;


    public Result add(Department department) {
        departmentDao.save(department);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        departmentDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }
}
