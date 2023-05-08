package entities;

public class PhysicalPerson extends Income{
	
	private Double health;
	
	public PhysicalPerson() {
		super();					
	}

	public PhysicalPerson(String name, Double income, Double health) {
		super(name, income);
		this.health = health;
	}

	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}
	
	@Override
	public Double incomePay() {
		
		if(getIncome() < 2000.00) {
			return getIncome() * 0.15 - health * 0.5;
			
		}else {
			return getIncome() * 0.25 - health * 0.5;
		}
		
	}

}
