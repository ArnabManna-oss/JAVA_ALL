package OOPS;

public class Cake
{
	private int cakeId;
	private String cakeName;
	private int pound;
	private double priceperpound;
	private boolean eggless;
	
	public Cake()
	{
		super();
		this.cakeId=cakeId;
		this.cakeName=cakeName;
		this.pound=pound;
		this.priceperpound=priceperpound;
		this.eggless=eggless;
	}

	public int getCakeId() {
		return cakeId;
	}

	public void setCakeId(int cakeId) {
		this.cakeId = cakeId;
	}

	public String getCakeName() {
		return cakeName;
	}

	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}

	public int getPound() {
		return pound;
	}

	public void setPound(int pound) {
		this.pound = pound;
	}

	public double getPriceperpound() {
		return priceperpound;
	}

	public void setPriceperpound(double priceperpound) {
		this.priceperpound = priceperpound;
	}

	public boolean isEggless() {
		return eggless;
	}

	public void setEggless(boolean eggless) {
		this.eggless = eggless;
	}
	
	
}
