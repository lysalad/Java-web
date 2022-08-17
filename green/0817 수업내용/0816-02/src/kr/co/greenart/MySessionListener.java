package kr.co.greenart;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionBindingListener, HttpSessionIdListener, HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println(se.getSession().getId() + "������ ������.");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(se.getSession().getId() + "������ �Ҹ��");
	}
	
//------------------------------------------------------------------------------------------------------

	@Override
	public void sessionIdChanged(HttpSessionEvent event, String oldSessionId) {
		System.out.println(oldSessionId + "- ���� ���̵� ���� -> " + event.getSession().getId());
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("���� ��ü�� attribute�� �����Ǿ���.");
		System.out.println(event.getName() + " : " + event.getValue());
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("���� ��ü�� attribute�� unbound�Ǿ���.");
		System.out.println(event.getName() + " : " + event.getValue());
	}
	
}
