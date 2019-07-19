package com.mshis.medicalSystem.service.hospitalizationControllerService;

import com.mshis.medicalSystem.dao.hospitalizationControllerDao.SubjectDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: 科目编码
 * author: 冯凡利
 * create:  2019/7/18 13:22
 */
@Service
public class SubjectService {

    @Autowired
    private SubjectDao subjectDao;

    @Autowired
    private Code code;


    /**
     * 添加 科目编码
     * @param subject
     * @return
     */
    public Result addSubject(Subject subject){
        subjectDao.save(subject);
        Result result = new Result(Code.OK, "添加成功");
        return result;
    }

    /**
     * 修改 科目编码
     * @param subject
     * @return
     */
    public Result updateSubject(Subject subject){
        subjectDao.save(subject);
        Result result = new Result(Code.OK, "修改成功");
        return result;
    }

    /**
     * 查询 科目编码
     * @return
     */
    public Result getAllSubject(){
        List<Subject> all = subjectDao.findAll();
        Result result = new Result(Code.OK, "修改成功",all );
        return result;
    }

    /**
     * 删除 科目编码
     * @param id
     * @return
     */
    public Result deleteSubject(int id){
        subjectDao.deleteById(id);
        Result result = new Result(Code.OK, "删除成功");
        return result;
    }


}
