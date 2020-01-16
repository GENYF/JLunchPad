package List;

public class Student_info extends Phone_info{
	int hakbun;
	
	public void insert(String name, String telnum, String address, int hakbun) {
		super.insert(name, telnum, address);
		this.hakbun = hakbun;
	}
	
	public void print() {
		super.print();
		System.out.println("ÇÐ     ¹ø: " + this.hakbun);
	}
}
