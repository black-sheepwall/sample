package com.han.S20210901.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.han.S20210901.dao.PconsultDao;
import com.han.S20210901.model.Pconsult;

@Service
public class PconsultServiceImpl implements PconsultService{
	
	@Autowired
	private PconsultDao pconsultDao;

	@Override
	public int pConsultTotal() {
		System.out.println("PconsultServiceImpl pConsultTotal() Start...");
		int totalCnt = pconsultDao.pConsultTotal();
		return totalCnt;
	}

	@Override
	public List<Pconsult> pConsultAll(Pconsult pconsult) {
		System.out.println("PconsultServiceImpl pConsultAll() Start...");
		List<Pconsult> pConsultList = pconsultDao.pConsultAll(pconsult);
		return pConsultList;
	}
}
