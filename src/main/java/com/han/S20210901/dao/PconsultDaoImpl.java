package com.han.S20210901.dao;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.han.S20210901.model.Pconsult;

@Repository
public class PconsultDaoImpl implements PconsultDao{
	@Autowired
	private SqlSession session;

	@Override
	public int pConsultTotal() {
		System.out.println("PconsultDaoImpl pConsultTotal() Start...");
		int totalCnt = session.selectOne("jhPconsultCnt");
		return totalCnt;
	}


	@Override
	public List<Pconsult> pConsultAll(Pconsult pconsult) {
		System.out.println("PconsultDaoImpl pConsultAll() Start...");
		List<Pconsult> pConsultList = session.selectList("jhPconsultList",pconsult);

		
		return pConsultList;
	}
}
