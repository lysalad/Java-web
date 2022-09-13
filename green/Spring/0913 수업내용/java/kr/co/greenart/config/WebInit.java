package kr.co.greenart.config;

import java.nio.charset.CharacterCodingException;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// 배열로 rootConfig에 넘겨준다. 무엇을 ?
		// -> 그러면 root-context.xml파일은 필요없어지기때문에 삭제해도 된다.
		return new Class[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	// 배열로 내가 쓰고자 하는 필터를 반환해주면 된다.
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encondingFilter = new CharacterEncodingFilter();
		encondingFilter.setEncoding("UTF-8");
		encondingFilter.setForceEncoding(true);
		return new Filter[] { encondingFilter };
	}
}
