package ch08.service;

import java.util.Date;

import ch08.dao.BoardDao;
import ch08.dto.Board;

public class Exam04 {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		Board b = new Board();
		b.setBno(7);
		b.setBtitle("제목7");
		b.setBcontent("내용7");
		b.setBwriter("사용자7");
		b.setBhitcount(12);
		b.setBdate(new Date());
		
		dao.insert(b);
	}

}
