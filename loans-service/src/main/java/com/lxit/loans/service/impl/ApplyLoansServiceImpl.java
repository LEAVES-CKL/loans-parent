package com.lxit.loans.service.impl;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import com.lxit.loans.dao.ApplyLoansDao;
import com.lxit.loans.model.ApplyLoans;
import com.lxit.loans.service.ApplyLoansService;

@Service
@MapperScan("com.lxit.loans.dao")
public class ApplyLoansServiceImpl implements ApplyLoansService {
	
	@Resource
	ApplyLoansDao applyLoansDao;

	public int insertLoans(ApplyLoans applyLoans) {
		return applyLoansDao.insertLoans(applyLoans);
	}
	
}
