package entities;

public class Legal extends Income{
	
	
	private Integer employee;

	public Legal() {
		super();
	}

	public Legal(String name, Double income, Integer employee) {
		super(name, income);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}
	
	@Override
	public Double incomePay() {
		
		if(employee > 14) {
			return getIncome() * 0.14;
		}else {
			return getIncome() * 0.16;
		}
		
		
		
	}
	
	
}
