package chap08.sec02.test;

public class DaoExample2 {
	static DataAccessObject d1 = new OracleDao();
	static DataAccessObject d2 = new OracleDao();
	static DataAccessObject d3 = new OracleDao();
	static DataAccessObject d4 = new OracleDao();
	
	public static void dbWork() {
		d1.select();
		d2.insert();
		d3.update();
		d3 = new MySqlDao();
		d3.update();
		d4 = new MySqlDao();
		if(d4 instanceof MySqlDao) {
			MySqlDao msd = (MySqlDao) d4;
			msd.dml();
		}
		System.out.println();
	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		if(dao instanceof MySqlDao) {
			MySqlDao msd = (MySqlDao) dao;
			msd.dml();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 자동 타입 변환
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		dbWork();
	}

}
