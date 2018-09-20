package p1;

public class Registration {
	private int userid;
	private String username;
	private int age;
	private String password;
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(int userid, String username, int age, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.age = age;
		this.password = password;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Registration [userid=" + userid + ", username=" + username + ", age=" + age + ", password=" + password
				+ "]";
	}

}