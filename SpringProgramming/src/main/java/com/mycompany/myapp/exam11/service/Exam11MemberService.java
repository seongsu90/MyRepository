package com.mycompany.myapp.exam11.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myapp.exam11.dao.Exam11MemberDao;
import com.mycompany.myapp.exam11.dto.Member;

@Component // 어플 실행시 자동 생성자 생성
public class Exam11MemberService {
	
	private static final Logger logger = LoggerFactory.getLogger(Exam11MemberService.class);
	
	public static final int LOGIN_SUCCESS=0;
	public static final int LOGIN_FAIL_MID=1;
	public static final int LOGIN_FAIL_MPASSWORD = 2;
	
	@Autowired
	private Exam11MemberDao memberDao;
	
	public void join(Member member){
		logger.info("join 처리");
		memberDao.insert(member); //저장
	}
	
	public int login(String mid, String mpassword){
		logger.info("login 처리");
		Member member = memberDao.select(mid); //조회
		if(member==null){
			return LOGIN_FAIL_MID;
		}else{
			if(member.getMpassword().equals(mpassword)){
				return LOGIN_SUCCESS;
			}else{
				return LOGIN_FAIL_MPASSWORD;
			}
		}
	}
}
