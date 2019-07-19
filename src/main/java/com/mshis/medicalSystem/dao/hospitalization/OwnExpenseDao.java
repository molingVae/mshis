package com.mshis.medicalSystem.dao.hospitalization;

import com.mshis.medicalSystem.pojo.bean.Uh04OwnExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * description: 住院部资金日报表
 * author: 冯凡利
 * create:  2019/7/18 15:02
 */
@Component
public interface OwnExpenseDao extends JpaRepository<Uh04OwnExpense, Integer> {
}
