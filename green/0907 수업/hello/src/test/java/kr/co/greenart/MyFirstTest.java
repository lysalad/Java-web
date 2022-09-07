package kr.co.greenart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Test;

import kr.co.greenart.model.User;

public class MyFirstTest {

	// 테스트하고자하는 메소드를 적으면 된다.
	
	@Test
	public void test() {
		// fail은 제이유닛 어설트에 들어가있는 메소드인데
		// 무조건 실패하는 메소드이다.
//		fail("Not yet implemented");		
		
		int a = 10;
		int b = 20;
		
		// 이렇게 하면 초록불이 들어온다.
		int sum = a + b;
		// assertEquals라는 메소드
		// 기대값과 실제값을 전달받아서 확인해준다.
		assertEquals(30, sum);
	}
	
	@Test
	public void test2() {
		String abc = "abc";
		String abc2 = abc;
		
		// 두 객체가 같은지 물어본다.
		assertSame(abc2, abc);
	}
	
	@Test
	public void test3() {
		User u = new User();
		assertNotNull(u);
	}
	
	// 실행하면 각각의 흐름을 가진다. 고유한 흐름을 각각 가진다는 말이다.
	// 각 테스트끼리 영향을 주고받지는 않는다.
	
}
