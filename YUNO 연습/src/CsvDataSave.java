
public class CsvDataSave {
	String subject;
	String level;
	String name;
	String gender;
	String age;
	String data;
	
	public CsvDataSave(String subject, String level, String name, String gender, String age, String data) {
		this.subject = subject;
		this.level = level;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.data = data;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "CsvDataSave [subject=" + subject + ", level=" + level + ", name=" + name + ", gender=" + gender
				+ ", age=" + age + ", data=" + data + "]";
	}


	
	
}
