package Sept18OverLoading;

class GymMember {
	private String name;
	private String planType;
	private String discountCode;

	public GymMember(String name) {

		this.name = name;
		this.planType = "basic";
		this.discountCode = "DISC10";

	}

	public GymMember(String name, String planType) {

		this.name = name;
		this.planType = planType;
		this.discountCode = "DISC10";
	}

	public GymMember(String name, String planType, String discountCode) {

		this.name = name;
		this.planType = planType;
		this.discountCode = discountCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getName() {
		return name;
	}

	public String getPlanType() {
		return planType;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public double calculateMembershipFee() {
		double fee = 0.0;
		switch (planType.toLowerCase()) {
		case "basic":
			fee = 1000;
			break;
		case "premium":
			fee = 2000;
			break;
		case "vip":
			fee = 3000;
			break;
		default:
			fee = 1500;
		}

		if (discountCode.equalsIgnoreCase("DISC10")) {
			fee = fee * 0.90;
		} else if (discountCode.equalsIgnoreCase("DISC20")) {
			fee = fee * 0.80;
		}

		return fee;
	}

	public String displayDetails() {
		return "Name : " + name + "\nPlan Type : " + planType + "\nDiscount Code : "
				+ (discountCode != null ? discountCode : "None") + "\nPrice : " + calculateMembershipFee();
	}
}
