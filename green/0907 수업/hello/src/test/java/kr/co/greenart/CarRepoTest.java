package kr.co.greenart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Random;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.greenart.model.car.Car;
import kr.co.greenart.model.car.CarRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {kr.co.greenart.config.RootConfig.class})
public class CarRepoTest {
	@Autowired
	private CarRepository repository;
	
	@Test
	public void initTest() {
		assertNotNull(repository);
	}
	
	// 해당 메소드가 테스트가 시작되기 전에 한 번 먼저 실행되는 부분이다.
	// 설정같은걸 미리 해둬야할 때 사용한다.
	// 테스트 환경 만들기
	// 현재 DB에 자료가 없어서 자료를 미리 집어넣는 작업이다.
	// 얘는 스태틱으로 만들어야하는 메소드이다.
	@BeforeClass
	public static void addTestData() {
// 먼가가 안되고 있다능
//		Random r = new Random();
//		repository.add(new Car(0, "테스트 자료" + r.nextInt(10000), r.nextInt(10000)));
//		repository.add(new Car(0, "테스트 자료" + r.nextInt(10000), r.nextInt(10000)));
//		repository.add(new Car(0, "테스트 자료" + r.nextInt(10000), r.nextInt(10000)));
	}
	

	@Test
	public void create() {
		Random r = new Random();
		Car car = new Car();
		car.setModel("새 모델" + r.nextInt(10000));
		car.setPrice(1000);
		
		int result = repository.add(car);
		assertEquals(1, result);
	}
	
	@Test
	public void read() {
		List<Car> list = repository.getAll();
		assertNotNull(list);
	}
	
	@Test
	public void update() {
		int result = repository.update(new Car(1, "변경", 300));
		
		assertEquals(1, result);
	}

}
