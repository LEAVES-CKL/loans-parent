package com.lxit.loans.action;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lxit.loans.model.ApplyLoans;
import com.lxit.loans.service.ApplyLoansService;


@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.lxit.loans.service"})
public class ApplyLoansAction {
	@Resource
	ApplyLoansService applyLoansService;
	
	@RequestMapping("/test")
	@ResponseBody
	public int getTest(){
		ApplyLoans applyLoans = new ApplyLoans();
		applyLoans.setDescribe("zhuwanghuishigeshabi");
		return applyLoansService.insertLoans(applyLoans);
	}
}
