package com.han.S20210901.service;

import java.util.List;

import com.han.S20210901.model.Pconsult;

public interface PconsultService {

	int pConsultTotal();

	List<Pconsult> pConsultAll(Pconsult pconsult);

}
