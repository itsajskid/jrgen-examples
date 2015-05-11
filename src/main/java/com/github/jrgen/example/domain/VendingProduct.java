package com.github.jrgen.example.domain;

public class VendingProduct implements VendingItem {
	
	private Double cost;
	private String name;
	private Category category;
	private NutritionFacts nutritionFacts;
	
	public VendingProduct() {
		super();
	}
	
	public Double getCost() {
		return cost;
	}

	public String getName() {
		return name;
	}

	public Category getCategory() {
		return category;
	}

	public NutritionFacts getNutritionFacts() {
		return nutritionFacts;
	}

	public void setNutritionFacts(NutritionFacts nutritionFacts) {
		this.nutritionFacts = nutritionFacts;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((nutritionFacts == null) ? 0 : nutritionFacts.hashCode());
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
		VendingProduct other = (VendingProduct) obj;
		if (category != other.category)
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nutritionFacts == null) {
			if (other.nutritionFacts != null)
				return false;
		} else if (!nutritionFacts.equals(other.nutritionFacts))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [cost=" + cost + ", name=" + name + ", category="
				+ category + ", nutritionFacts=" + nutritionFacts + "]";
	}

	
}
