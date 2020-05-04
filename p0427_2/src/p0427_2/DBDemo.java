package p0427_2;//이클립스에서 데이터베이스 연결하는 방법 mysql일때

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBDemo {
public static  Connection makeConnection(){
	String url="jdbc:mysql://localhost/yangjung?serverTimezone=UTC";
	Connection con=null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");//버전 바뀌어서 .cj.붙어야함
		System.out.println("데이터베이스 연결중...");
		con=DriverManager.getConnection(url,"root","1234");//워크벤치들어갈때 아이디비번
		System.out.println("데이터베이스 연결 성공");
	}
	catch(ClassNotFoundException e){//(에러 종류가 8가지 정도 되지만  하나로 Exception e)
		e.printStackTrace();
		System.out.println("jdbc 드라이버를 찾지 못했습니다.");
	}
	catch(SQLException e){
		e.printStackTrace();//실패라고 뜨면 뜨는 문구 앞에 이걸 입력,에러메시지 복붙
		System.out.println("데이터베이스 연결 실패");
	}
	return con;
	}
	public static void main(String[] args) {
		makeConnection();
	}
}
