package kr.co.greenart;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class MyRequestListener implements ServletRequestListener, ServletRequestAttributeListener {
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("��û ��ü�� attribute�� �����Ǿ�����");
		// ���Ȼ��� ������ ���� �� ������ �׽�Ʈ�����θ� ����Ѵ�.
		System.out.println(srae.getName() + srae.getValue());
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("����� ��û�� �߻����� �� �̺�Ʈ~");
		HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();
		System.out.println(req.getRequestURI() + "�� ��û�Ͽ���.");
	}
}
