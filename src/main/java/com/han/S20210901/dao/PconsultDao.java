package com.han.S20210901.dao;

import java.util.List;

import com.han.S20210901.model.Pconsult;

public interface PconsultDao {

	int pConsultTotal();

	List<Pconsult> pConsultAll(Pconsult pconsult);
	
}
