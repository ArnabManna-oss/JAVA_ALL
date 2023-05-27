package encapsulation1;



public class Student {
	private int phn;
	protected String name;
	public String dress;
	public int getPhn() {
		return phn;
	}
	protected void setPhn(int phn) {
		this.phn = phn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDress() {
		return dress;
	}
	public void setDress(String dress) {
		this.dress = dress;
	}
}
