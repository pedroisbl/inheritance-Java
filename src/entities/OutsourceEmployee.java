package entities;

public final class OutsourceEmployee extends Employee{
	
	private double additionalCharge;
	
	public OutsourceEmployee() {
		super();
	}
	
	
	public OutsourceEmployee(double additionalCharge) {
		super();
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}


	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}