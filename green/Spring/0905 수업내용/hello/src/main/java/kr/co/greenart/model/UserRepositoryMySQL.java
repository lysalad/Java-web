package kr.co.greenart.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

// 첫 번째로는 primary를 쓰거나 두 번째로는 이름을 쓴다.
// 여러개 중에 얘만 동작하도록 하고싶어서
@Repository
@Primary
public class UserRepositoryMySQL implements UserRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private UserRowMapper mapper = new UserRowMapper();
	
	// 머라고요...? 클래스 안에서 사용할수 잇다구요 ?
	private class UserRowMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {

			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			
			return new User(id, name, age);
		}
	}
	
	@Override
	public int add(User user) {
		// 행객체를 반환하는 업데이트 메소드
		// sql인가 전달받고 오브젝트를 전달받는것
		return jdbcTemplate.update("INSERT INTO users (name, age) VALUES (?, ?)"
									, user.getName()
									, user.getAge());
	}

	@Override
	public List<User> list() {
		
		return jdbcTemplate.query("SELECT * FROM users", mapper);
	}
	

}
