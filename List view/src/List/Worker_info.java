package List;

public class Worker_info extends Phone_info{
	String work;
	String level;
	
	public void insert(String name, String telnum, String address, String work, String level) {
		super.insert(name, telnum, address);
		this.work = work;
		this.level = level;
	}
	
	public void print() {
		super.print();
		System.out.println("��     ��: " + this.work);
		System.out.println("��     å: " + this.level);
	}
}
