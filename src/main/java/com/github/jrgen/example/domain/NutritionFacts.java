package com.github.jrgen.example.domain;

public class NutritionFacts {

	private Integer calories;
	private Integer caloriesFromFat;
	private String servingSize;
	private Integer servingsPerContainer;
	private Integer totalFat;
	private Integer saturatedFat;
	private Integer monoUnsatFat;
	private Integer polyUnsatFat;
	private Integer transFat;
	private Integer cholesterol;
	private Integer sodium;
	private Integer potassium;
	private Integer totalCarb;
	private Integer fiber;
	private Integer sugar;
	private Integer protein;
	
	public NutritionFacts() {
		super();
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getCaloriesFromFat() {
		return caloriesFromFat;
	}

	public void setCaloriesFromFat(Integer caloriesFromFat) {
		this.caloriesFromFat = caloriesFromFat;
	}

	public String getServingSize() {
		return servingSize;
	}

	public void setServingSize(String servingSize) {
		this.servingSize = servingSize;
	}

	public Integer getServingsPerContainer() {
		return servingsPerContainer;
	}

	public void setServingsPerContainer(Integer servingsPerContainer) {
		this.servingsPerContainer = servingsPerContainer;
	}

	public Integer getTotalFat() {
		return totalFat;
	}

	public void setTotalFat(Integer totalFat) {
		this.totalFat = totalFat;
	}

	public Integer getSaturatedFat() {
		return saturatedFat;
	}

	public void setSaturatedFat(Integer saturatedFat) {
		this.saturatedFat = saturatedFat;
	}

	public Integer getMonoUnsatFat() {
		return monoUnsatFat;
	}

	public void setMonoUnsatFat(Integer monoUnsatFat) {
		this.monoUnsatFat = monoUnsatFat;
	}

	public Integer getPolyUnsatFat() {
		return polyUnsatFat;
	}

	public void setPolyUnsatFat(Integer polyUnsatFat) {
		this.polyUnsatFat = polyUnsatFat;
	}

	public Integer getTransFat() {
		return transFat;
	}

	public void setTransFat(Integer transFat) {
		this.transFat = transFat;
	}

	public Integer getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(Integer cholesterol) {
		this.cholesterol = cholesterol;
	}

	public Integer getSodium() {
		return sodium;
	}

	public void setSodium(Integer sodium) {
		this.sodium = sodium;
	}

	public Integer getPotassium() {
		return potassium;
	}

	public void setPotassium(Integer potassium) {
		this.potassium = potassium;
	}

	public Integer getTotalCarb() {
		return totalCarb;
	}

	public void setTotalCarb(Integer totalCarb) {
		this.totalCarb = totalCarb;
	}

	public Integer getFiber() {
		return fiber;
	}

	public void setFiber(Integer fiber) {
		this.fiber = fiber;
	}

	public Integer getSugar() {
		return sugar;
	}

	public void setSugar(Integer sugar) {
		this.sugar = sugar;
	}

	public Integer getProtein() {
		return protein;
	}

	public void setProtein(Integer protein) {
		this.protein = protein;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((calories == null) ? 0 : calories.hashCode());
		result = prime * result
				+ ((caloriesFromFat == null) ? 0 : caloriesFromFat.hashCode());
		result = prime * result
				+ ((cholesterol == null) ? 0 : cholesterol.hashCode());
		result = prime * result + ((fiber == null) ? 0 : fiber.hashCode());
		result = prime * result
				+ ((monoUnsatFat == null) ? 0 : monoUnsatFat.hashCode());
		result = prime * result
				+ ((polyUnsatFat == null) ? 0 : polyUnsatFat.hashCode());
		result = prime * result
				+ ((potassium == null) ? 0 : potassium.hashCode());
		result = prime * result + ((protein == null) ? 0 : protein.hashCode());
		result = prime * result
				+ ((saturatedFat == null) ? 0 : saturatedFat.hashCode());
		result = prime * result
				+ ((servingSize == null) ? 0 : servingSize.hashCode());
		result = prime
				* result
				+ ((servingsPerContainer == null) ? 0 : servingsPerContainer
						.hashCode());
		result = prime * result + ((sodium == null) ? 0 : sodium.hashCode());
		result = prime * result + ((sugar == null) ? 0 : sugar.hashCode());
		result = prime * result
				+ ((totalCarb == null) ? 0 : totalCarb.hashCode());
		result = prime * result
				+ ((totalFat == null) ? 0 : totalFat.hashCode());
		result = prime * result
				+ ((transFat == null) ? 0 : transFat.hashCode());
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
		NutritionFacts other = (NutritionFacts) obj;
		if (calories == null) {
			if (other.calories != null)
				return false;
		} else if (!calories.equals(other.calories))
			return false;
		if (caloriesFromFat == null) {
			if (other.caloriesFromFat != null)
				return false;
		} else if (!caloriesFromFat.equals(other.caloriesFromFat))
			return false;
		if (cholesterol == null) {
			if (other.cholesterol != null)
				return false;
		} else if (!cholesterol.equals(other.cholesterol))
			return false;
		if (fiber == null) {
			if (other.fiber != null)
				return false;
		} else if (!fiber.equals(other.fiber))
			return false;
		if (monoUnsatFat == null) {
			if (other.monoUnsatFat != null)
				return false;
		} else if (!monoUnsatFat.equals(other.monoUnsatFat))
			return false;
		if (polyUnsatFat == null) {
			if (other.polyUnsatFat != null)
				return false;
		} else if (!polyUnsatFat.equals(other.polyUnsatFat))
			return false;
		if (potassium == null) {
			if (other.potassium != null)
				return false;
		} else if (!potassium.equals(other.potassium))
			return false;
		if (protein == null) {
			if (other.protein != null)
				return false;
		} else if (!protein.equals(other.protein))
			return false;
		if (saturatedFat == null) {
			if (other.saturatedFat != null)
				return false;
		} else if (!saturatedFat.equals(other.saturatedFat))
			return false;
		if (servingSize == null) {
			if (other.servingSize != null)
				return false;
		} else if (!servingSize.equals(other.servingSize))
			return false;
		if (servingsPerContainer == null) {
			if (other.servingsPerContainer != null)
				return false;
		} else if (!servingsPerContainer.equals(other.servingsPerContainer))
			return false;
		if (sodium == null) {
			if (other.sodium != null)
				return false;
		} else if (!sodium.equals(other.sodium))
			return false;
		if (sugar == null) {
			if (other.sugar != null)
				return false;
		} else if (!sugar.equals(other.sugar))
			return false;
		if (totalCarb == null) {
			if (other.totalCarb != null)
				return false;
		} else if (!totalCarb.equals(other.totalCarb))
			return false;
		if (totalFat == null) {
			if (other.totalFat != null)
				return false;
		} else if (!totalFat.equals(other.totalFat))
			return false;
		if (transFat == null) {
			if (other.transFat != null)
				return false;
		} else if (!transFat.equals(other.transFat))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NutritionFacts [calories=" + calories + ", caloriesFromFat="
				+ caloriesFromFat + ", servingSize=" + servingSize
				+ ", servingsPerContainer=" + servingsPerContainer
				+ ", totalFat=" + totalFat + ", saturatedFat=" + saturatedFat
				+ ", monoUnsatFat=" + monoUnsatFat + ", polyUnsatFat="
				+ polyUnsatFat + ", transFat=" + transFat + ", cholesterol="
				+ cholesterol + ", sodium=" + sodium + ", potassium="
				+ potassium + ", totalCarb=" + totalCarb + ", fiber=" + fiber
				+ ", sugar=" + sugar + ", protein=" + protein + "]";
	}
	
	
}
