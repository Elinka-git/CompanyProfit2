
	public class CompanyET extends Company {

		public CompanyET(String name, String dateOfEstablishment, String bulstat) {
			super(name, dateOfEstablishment, bulstat);
			
		}
		public String ownerName;

		public String getOwnerName() {
			return ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		public Double initialCapital;

		public Double getInitialCapital() {
			return initialCapital;
		}

		public void setInitialCapital(Double initialCapital) {
			this.initialCapital = initialCapital;
		}
		
		public Double currentCapital;

		public Double getCurrentCapital() {
			return currentCapital;
		}

		public void setCurrentCapital(Double currentCapital) {
			this.currentCapital = currentCapital;
		}
		
		double profit = 
			(currentCapital - initialCapital);
			
		
		public double profit(double d) {
			
			return this.profit;
		}
		
	}
