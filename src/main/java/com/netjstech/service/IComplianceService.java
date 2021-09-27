package com.netjstech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.netjstech.entities.Compliance;
import com.netjstech.entities.StatusReport;

@Service
public interface IComplianceService {
	public void createRL(Compliance co);
	
	public List<Compliance> getAllRL(int userId);
	public List<Compliance> getAllRL();
	public void createStatusReport(StatusReport statusreport);

	public List<StatusReport> getAllStatusReport(int userId,int compid);

	

}