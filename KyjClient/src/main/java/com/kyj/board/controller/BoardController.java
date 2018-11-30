package com.kyj.board.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kyj.board.service.BoardService;

@Controller
public class BoardController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/board/boardList.do", method = RequestMethod.GET)
	public ModelAndView openBoardList(Map<String,Object> commandMap) throws Exception{
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		ModelAndView mv = new ModelAndView("/board/boardList");
		
		list = boardService.selectBoardList(commandMap);
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome() {
		return "/home";
	}
}
