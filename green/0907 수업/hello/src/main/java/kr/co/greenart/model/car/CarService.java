package kr.co.greenart.model.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarService {
	@Autowired
	private CarRepository repo;
	
	// 자동차 목록을 전달받아 주기
	// 똑같은 기능을 제이디비씨 템플릿에서도 구현할 수 있고 제공해준다.
	@Transactional
	public int[] bulkInsert(List<Car> list) {
		
//		int[] results = new int[list.size()]; 
//		for (int i = 0; i < list.size(); i++) {
//			repo.add(list.get(i));
//			results[i] = repo.add(list.get(i));
//		}
		
		int[] results = repo.batchInsert(list);
		return results;
	}
	
	@Transactional
	public int delete(int id) {
		return repo.delete(id);
		
	}

}
