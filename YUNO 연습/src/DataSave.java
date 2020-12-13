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
	//���̺� �̸� ���� �޼ҵ�
	String Subject = new String();
	//�����͸� �ִ� �޼ҵ�
	public static void createData(String subject, String plevel, String name, String gender,
								  String age, String data) {
		
		
		try {
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement(""
					+ "INSERT INTO PsychologyData"
					+ "(subject, plevel, name, gender, age, data)"
					+ "VALUE"
					+ "('"+subject+"','"+plevel+"','"+name+"','"+gender+"','"+age+"','"+data+"')");
			//('subject','level','name', 'gender', 'age', 'data')�� ������ �����
			insert.executeUpdate();
			
			System.out.println("������ ���� �� ��");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//������ �ҷ����� �޼ҵ�
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
			System.out.println("��� �����͸� �ҷ��Խ��ϴ�.");
			String[][] arr = new String[list.size()][6];//������� �𸣴ϱ� list.size()
			return list.toArray(arr);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	//SQL�� ���̺� ����� �޼ҵ�
	public static void createTable() {
		try {
			Connection con = getConnection();	//�Ʒ� �ۼ��� ��� ���� �ҷ��´�
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
			//���� ����� ������ �����ϴ� �ڵ�
			create.execute();
			System.out.println("Table �������");
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
			System.out.println("����");
			return con;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
