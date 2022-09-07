package kr.co.greenart.model.car;

import java.util.List;

public interface CarRepository {
	// 전체 목록
	public List<Car> getAll();
	
	// 아이디로 검색해서 행 하나씩 조회
	public Car getId(int id);

	// 하나의 행 추가
	public int add(Car car);
	
	// 자동차 목록 여러개 한 번에 추가하기
	public int[] batchInsert(List<Car> list);
	
	// 하나의 행 수정
	public int update(Car car);
	
	// 하나의 행 삭제
	public int delete(int id);
	
}
