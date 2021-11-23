package com.han.S20210901.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.han.S20210901.model.Pconsult;
import com.han.S20210901.service.PconsultService;


@Controller
public class PconsultControllerJh {
	
	@Autowired
	private PconsultService pconsultService;
	
	
//	@RequestMapping(value = "test1")
//	public String test1() {
//		return "main";
//	}
	
	@RequestMapping("pConsultCount")
	public String pConsultList(Model model, Pconsult pconsult) {
		System.out.println("PcontrollerJh pConsultList() start...");
		//1대1상담 게시물 총 개수 구하기
		int totalCnt = pconsultService.pConsultTotal();
		System.out.println("pConsultList() totalCnt ->"+totalCnt);
		
		//리스트 모두 가져오기
		List<Pconsult> pConsultList = pconsultService.pConsultAll(pconsult);
		
		
		model.addAttribute("totalCnt", totalCnt);
		model.addAttribute("pList", pConsultList);
		
		return "pconsultlist";
	}
	
	@GetMapping(value = "pCosultDetail")
	public String pCosultDetail(int pnum, Model model, Pconsult pconsult) {
		System.out.println("PcontrollerJh pCosultDetail() Start...");
		
		return "";
	}
	
}
