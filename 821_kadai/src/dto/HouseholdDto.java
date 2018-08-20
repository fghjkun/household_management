package dto;

public class HouseholdDto {

	private int number;
	private String date;
	private String income;
	private String spending;
	private String balanceg;
	private String type;

	public HouseholdDto(){

	}

	public HouseholdDto(int number, String date, String income, String spending, String balanceg, String type) {

		this.number = number;
		this.date = date;
		this.income = income;
		this.spending = spending;
		this.balanceg = balanceg;
		this.type = type;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDate() {
		return date;
	}
	public void setData(String date) {
		this.date = date;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public String getSpending() {
		return spending;
	}
	public void setSpending(String spending) {
		this.spending = spending;
	}
	public String getBalanceg() {
		return balanceg;
	}
	public void setBalanceg(String balanceg) {
		this.balanceg = balanceg;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


}