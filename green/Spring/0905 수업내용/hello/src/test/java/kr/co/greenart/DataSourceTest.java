package kr.co.greenart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

// 스프링에서 제이유닛을 사용하기위한 어노테이션 ???
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { kr.co.greenart.config.RootConfig.class })
public class DataSourceTest {
	// 데이터소스를 빈으로 설정해뒀따. 고 하는데 잘 모르겠다. 언제 ?
	@Autowired
	private DataSource ds;
	
	@Test
	public void testDS() {
		assertNotNull(ds);
	}
	
	@Test
	public void testConnection() throws SQLException {
		try (Connection conn = ds.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT 1")) {
			
			rs.next();
			int result = rs.getInt(1);
			assertEquals(1, result);
			
		}
	}
	
}
