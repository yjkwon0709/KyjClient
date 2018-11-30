package com.kyj.board.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kyj.board.service.BoardService;

@Controller
public class BoardController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="boradService")
	private BoardService boardService;
	
	@RequestMapping(value="/board/boardList.do")
	public ModelAndView openBoardList(Map<String,Object> commandMap) throws Exception{
		ModelAndView mv = new ModelAndView("/board/boardList");
		
		List<Map<String,Object>> list = boardService.selectBoardList(commandMap);
		mv.addObject("list", list);
		
		return mv;
	}
}
