package com.hoau.crm.module.job.server.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.StatefulJob;

import com.hoau.crm.module.job.server.service.ICustomerLatlngJobService;
import com.hoau.hbdp.framework.server.components.jobgrid.GridJob;

/**
 * @author 275636
 * 客户坐标初始化Job
 */
public class CustomerScopeJob extends GridJob implements StatefulJob {

	@Override
	protected void doExecute(JobExecutionContext context)
			throws JobExecutionException {
		ICustomerLatlngJobService iCustomerLatlngService = getBean("customerLatlngServiceImpl",ICustomerLatlngJobService.class);
		
		// 客户自动分配范围
		iCustomerLatlngService.customerScopeJob();
	}

}
