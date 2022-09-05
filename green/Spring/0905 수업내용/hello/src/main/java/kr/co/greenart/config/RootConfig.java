package kr.co.greenart.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

// 연결을 만들어두고 계속해서 사용한다.
// 데이터 커넥션 풀을 만든다. 어떤 모양으로 만들면 좋을까?
// java 머요 ? java 멀로 만들면 필요할때마다 꺼내오기가 쉽다. 아 자바 bean

@Configuration
// 프로펄티스를 꺼내서 쓸수있게 제공하는 어노테이션
// value에 패키지, 클래스 패스를 적으면 된다.
@PropertySource(value = "classpath:kr/co/greenart/config/mysql.properties")
public class RootConfig {
	@Value("${jdbc.drivername}")
	private String drivername;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(drivername);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	// JdbcTemplate는 데이터 소스에 대한 의존성이 필요하다.
	@Bean
	// 두 번째 방법 주입하기 -> 파라미터에 DataSource ds를 넣어준다.
	@Autowired
	public JdbcTemplate jdbcTemplate(DataSource ds) {
		
		//첫 번째 방법
		return new JdbcTemplate(ds);
		
		// 이런 방법으로 쓰면 간단하게 사용가능!
		// 열고 닫거나 할 필요도 없다!
		// 테스트에서 깔끔하게 잘 된다!
		// 신기!
	}
}
