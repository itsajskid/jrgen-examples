package com.github.jrgen.example.domain;

public class PrimitiveNutritionFacts {

	private int calories;
	private int caloriesFromFat;
	private String servingSize;
	private int servingsPerContainer;
	private int totalFat;
	private int saturatedFat;
	private int monoUnsatFat;
	private int polyUnsatFat;
	private int transFat;
	private int cholesterol;
	private int sodium;
	private int potassium;
	private int totalCarb;
	private int fiber;
	private int sugar;
	private int protein;
	
	public PrimitiveNutritionFacts() {
		super();
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getCaloriesFromFat() {
		return caloriesFromFat;
	}

	public void setCaloriesFromFat(int caloriesFromFat) {
		this.caloriesFromFat = caloriesFromFat;
	}

	public String getServingSize() {
		return servingSize;
	}

	public void setServingSize(String servingSize) {
		this.servingSize = servingSize;
	}

	public int getServingsPerContainer() {
		return servingsPerContainer;
	}

	public void setServingsPerContainer(int servingsPerContainer) {
		this.servingsPerContainer = servingsPerContainer;
	}

	public int getTotalFat() {
		return totalFat;
	}

	public void setTotalFat(int totalFat) {
		this.totalFat = totalFat;
	}

	public int getSaturatedFat() {
		return saturatedFat;
	}

	public void setSaturatedFat(int saturatedFat) {
		this.saturatedFat = saturatedFat;
	}

	public int getMonoUnsatFat() {
		return monoUnsatFat;
	}

	public void setMonoUnsatFat(int monoUnsatFat) {
		this.monoUnsatFat = monoUnsatFat;
	}

	public int getPolyUnsatFat() {
		return polyUnsatFat;
	}

	public void setPolyUnsatFat(int polyUnsatFat) {
		this.polyUnsatFat = polyUnsatFat;
	}

	public int getTransFat() {
		return transFat;
	}

	public void setTransFat(int transFat) {
		this.transFat = transFat;
	}

	public int getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(int cholesterol) {
		this.cholesterol = cholesterol;
	}

	public int getSodium() {
		return sodium;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public int getPotassium() {
		return potassium;
	}

	public void setPotassium(int potassium) {
		this.potassium = potassium;
	}

	public int getTotalCarb() {
		return totalCarb;
	}

	public void setTotalCarb(int totalCarb) {
		this.totalCarb = totalCarb;
	}

	public int getFiber() {
		return fiber;
	}

	public void setFiber(int fiber) {
		this.fiber = fiber;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + caloriesFromFat;
		result = prime * result + cholesterol;
		result = prime * result + fiber;
		result = prime * result + monoUnsatFat;
		result = prime * result + polyUnsatFat;
		result = prime * result + potassium;
		result = prime * result + protein;
		result = prime * result + saturatedFat;
		result = prime * result
				+ ((servingSize == null) ? 0 : servingSize.hashCode());
		result = prime * result + servingsPerContainer;
		result = prime * result + sodium;
		result = prime * result + sugar;
		result = prime * result + totalCarb;
		result = prime * result + totalFat;
		result = prime * result + transFat;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrimitiveNutritionFacts other = (PrimitiveNutritionFacts) obj;
		if (calories != other.calories)
			return false;
		if (caloriesFromFat != other.caloriesFromFat)
			return false;
		if (cholesterol != other.cholesterol)
			return false;
		if (fiber != other.fiber)
			return false;
		if (monoUnsatFat != other.monoUnsatFat)
			return false;
		if (polyUnsatFat != other.polyUnsatFat)
			return false;
		if (potassium != other.potassium)
			return false;
		if (protein != other.protein)
			return false;
		if (saturatedFat != other.saturatedFat)
			return false;
		if (servingSize == null) {
			if (other.servingSize != null)
				return false;
		} else if (!servingSize.equals(other.servingSize))
			return false;
		if (servingsPerContainer != other.servingsPerContainer)
			return false;
		if (sodium != other.sodium)
			return false;
		if (sugar != other.sugar)
			return false;
		if (totalCarb != other.totalCarb)
			return false;
		if (totalFat != other.totalFat)
			return false;
		if (transFat != other.transFat)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PrimitiveNutritionFacts [calories=" + calories
				+ ", caloriesFromFat=" + caloriesFromFat + ", servingSize="
				+ servingSize + ", servingsPerContainer="
				+ servingsPerContainer + ", totalFat=" + totalFat
				+ ", saturatedFat=" + saturatedFat + ", monoUnsatFat="
				+ monoUnsatFat + ", polyUnsatFat=" + polyUnsatFat
				+ ", transFat=" + transFat + ", cholesterol=" + cholesterol
				+ ", sodium=" + sodium + ", potassium=" + potassium
				+ ", totalCarb=" + totalCarb + ", fiber=" + fiber + ", sugar="
				+ sugar + ", protein=" + protein + "]";
	}
	
}
