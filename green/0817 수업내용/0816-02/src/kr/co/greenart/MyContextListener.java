package kr.co.greenart;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

//������ �ʿ��� �͵��� ����ٰ� �־���.
public class MyContextListener implements ServletContextListener {
	private static DataSource dataSource;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("�� ���ø����̼� ���۽� �̺�Ʈ�� �߻��մϴ�.");
		
		// �� ���ø����̼� ù ���� �� �ʿ��� ������ �� �� ����.
		ServletContext context = sce.getServletContext();
		
		String driver = context.getInitParameter("driver");
		String dburl = context.getInitParameter("dburl");
		String dbid = context.getInitParameter("dbid");
		String dbpw = context.getInitParameter("dbpw");
		
		// �� ���ø����̼��� ����������, DB�� ������ �Ǿ��ϹǷ� ���⿡ �ִ´�.
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(dburl);
		ds.setUsername(dbid);
		ds.setPassword(dbpw);
		
		dataSource = ds;
	}
	
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
}