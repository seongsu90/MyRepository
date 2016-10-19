package ch08.service;

import java.util.Date;

import ch08.dao.BoardDao;
import ch08.dto.Board;

public class Exam05 {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		Board b = new Board();
		b.setBno(7);
		b.setBtitle("제목7_2");
		b.setBcontent("내용7+8");
		b.setBwriter("user7");
		b.setBhitcount(15);
		b.setBdate(new Date(1996,2,17));
		
		dao.update(b);
	}

}
