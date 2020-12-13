import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DataSave {
	
	 /*public static void main(String[] args) {
		createTable();
		createData("a1xb2","Kim", "Male", "25", "101");
		ArrayList<String> list = getPsychologyData();
		for(String item: list) {
			System.out.println(item);
		}
	}
	*/
	//테이블 이름 설정 메소드
	String Subject = new String();
	//데이터를 넣는 메소드
	public static void createData(String subject, String plevel, String name, String gender,
								  String age, String data) {
		
		
		try {
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement(""
					+ "INSERT INTO PsychologyData"
					+ "(subject, plevel, name, gender, age, data)"
					+ "VALUE"
					+ "('"+subject+"','"+plevel+"','"+name+"','"+gender+"','"+age+"','"+data+"')");
			//('subject','level','name', 'gender', 'age', 'data')로 데이터 저장됨
			insert.executeUpdate();
			
			System.out.println("데이터 저장 잘 됨");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//데이터 불러오기 메소드
	public static String[][] getData(){
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("Select subject, plevel, name, gender, age, data FROM PsychologyData");
			ResultSet result = statement.executeQuery();
			ArrayList<String[]> list = new ArrayList<>();
			while(result.next()) {
				list.add(new String[] {result.getString("subject"),
						result.getString("plevel"),
						result.getString("name"),
						result.getString("gender"),
						result.getString("age"),
						result.getString("data")
						});
			}
			System.out.println("모든 데이터를 불러왔습니다.");
			String[][] arr = new String[list.size()][6];//행사이즈 모르니까 list.size()
			return list.toArray(arr);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	//SQL에 테이블 만드는 메소드
	public static void createTable() {
		try {
			Connection con = getConnection();	//아래 작성한 모든 값을 불러온다
			PreparedStatement create = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS " 
					+ "(id int NOT NULL AUTO_INCREMENT,"
					+ "subject varChar(255),"
					+ "plevel varChar(255),"
					+ "name varChar(255),"
					+ "gender varChar(255),"
					+ "age varChar(255),"
					+ "data varChar(255),"
					+ "PRIMARY KEY(id))");
			//위의 명령을 실제로 실행하는 코드
			create.execute();
			System.out.println("Table 만들어짐");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Table successfully cerate");
		}
	}
	
	public static Connection getConnection() {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/yuno_db?serverTimezone=UTC";
			String user = "root";
			String pass = "51237841";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("성공");
			return con;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
