package chap08.sec02.test;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql DB 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("MySql DB 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("MySql DB 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB 제거");
		
	}
	
	public void dml() {
		System.out.println("MySql DB 데이터 정의어");
	}
	
}
