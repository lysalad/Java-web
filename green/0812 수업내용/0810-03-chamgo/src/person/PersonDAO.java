package person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.corba.se.spi.legacy.connection.GetEndPointInfoAgainException;

import kr.co.greenart.dbutil.DBUtil;

public class PersonDAO {
	// ��� �߰��ϱ�
	public int insert(Person person) throws SQLException {
		String insert = "INSERT INTO persons (firstName, lastName, age, email) VALUES (?, ?, ?, ?)";
		try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(insert)) {

			stmt.setNString(1, person.getFirstName());
			stmt.setString(2, person.getLastName());
			stmt.setInt(3, person.getAge());
			stmt.setString(4, person.getEmail());

			return stmt.executeUpdate();
		}

	}

	// ��� ��Ϻ���
	public List<Person> selectAll() throws SQLException {

//		 �ܺ��ڿ� = null;
//		try {
//		
//		 �ܺ��ڿ�  = �ʱ�ȭ;
//		
//		} catch () {
//			
//		}

		String select = "SELECT * FROM persons";

		List<Person> list = new ArrayList<>();

		try (Connection conn = DBUtil.getConnection();
				PreparedStatement stmt = conn.prepareStatement(select);
				ResultSet rs = stmt.executeQuery();) {
			while (rs.next()) {
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				int age = rs.getInt("age");
				String email = rs.getString("email");
				
				list.add(new Person(firstName, lastName, age, email));
			}
			
			return list;
		}
	}
}
