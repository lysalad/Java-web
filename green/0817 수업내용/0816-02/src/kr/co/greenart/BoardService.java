package kr.co.greenart;

import java.sql.SQLException;
import java.util.List;

public class BoardService {
	private BoardDAO dao;
	
	public BoardService(BoardDAO dao) {
		this.dao = dao;
	}

	public List<BoardArticle> �Խñ۸�Ϻ��⼭��() {
		// �ʿ��� ������ �����ϴ� �����~~ (Ʈ����� ���� ��)
		try {
			return dao.�Խñ۸�ϰ�������(); // ��� ��ȯ
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("�����͸� ���� �� �����ϴ�.");
		}
	}
	
//	�Խñ����⼭��
//	
//	�Խñۼ�������
//	
//	�Խñ��ϳ����뺸�⼭��
}
