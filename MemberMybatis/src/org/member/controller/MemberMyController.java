package org.member.controller;

import java.util.List;

import org.member.mybatis.mapper.MemberDAOImpl;
import org.member.mybatis.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberMyController {
	//컴파일러는 빈객체 생성의 목적도 있다.
	@Autowired
	private MemberDAOImpl mdao;
	
	@RequestMapping("/myTest.my")
	public ModelAndView test() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("data","mybatis controller test");
		mv.setViewName("result");
		return mv;
	}
	
	/* insert form */
	@RequestMapping("/myInsert.my")
	public ModelAndView insert() {
		return new ModelAndView("memberInsert");
	}
	//insert
	@RequestMapping(value = "/myInsert.my", method = RequestMethod.POST)
	public ModelAndView insert(MemberVO user) {
		mdao.insert(user);
		return new ModelAndView("redirect:myList.my");
	}
	@RequestMapping("/myList.my")
	public ModelAndView list() {
		List<MemberVO> arr = mdao.getMemberList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("arr",arr);
		mv.setViewName("memberList");
		return mv;
	}
	@RequestMapping("/ViewInfo.my")
	public ModelAndView ViewInfo(String id) {
		MemberVO vo = mdao.findById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("vo",vo);
		mv.setViewName("memberView");
		return mv;
		
	}
	@RequestMapping("/update.my")
	public ModelAndView updateMember(MemberVO user) {
		mdao.update(user);
		return new ModelAndView("redirect:myList.my");
	}
	@RequestMapping("/delete.my")
	public ModelAndView deleteMember(String id) {
		mdao.delete(id);
		return new ModelAndView("redirect:myList.my");
	}

}
