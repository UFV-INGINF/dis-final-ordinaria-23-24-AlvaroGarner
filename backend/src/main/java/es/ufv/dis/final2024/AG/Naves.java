package es.ufv.dis.final2024.AG;

import java.util.ArrayList;

public class Naves {
	private String name;
	private String model;
	private String cost_in_credits;
	private String crew;
	private String cargo_capacity;
	private String consumables;
	private String hyperdrive_rating;
	private String starship_class;
	private ArrayList<String> pilots;
	private ArrayList<String> films;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCost_in_credits() {
		return cost_in_credits;
	}

	public void setCost_in_credits(String cost_in_credits) {
		this.cost_in_credits = cost_in_credits;
	}

	public String getCrew() {
		return crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public String getCargo_capacity() {
		return cargo_capacity;
	}

	public void setCargo_capacity(String cargo_capacity) {
		this.cargo_capacity = cargo_capacity;
	}

	public String getConsumables() {
		return consumables;
	}

	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}

	public String getHyperdrive_rating() {
		return hyperdrive_rating;
	}

	public void setHyperdrive_rating(String hyperdrive_rating) {
		this.hyperdrive_rating = hyperdrive_rating;
	}

	public String getStarship_class() {
		return starship_class;
	}

	public void setStarship_class(String starship_class) {
		this.starship_class = starship_class;
	}

	public ArrayList<String> getPilots() {
		return pilots;
	}

	public void setPilots(ArrayList<String> pilots) {
		this.pilots = pilots;
	}

	public ArrayList<String> getFilms() {
		return films;
	}

	public void setFilms(ArrayList<String> films) {
		this.films = films;
	}

	@Override
	public String toString() {
		return "Naves{" +
				"name='" + name + '\'' +
				", model='" + model + '\'' +
				", cost_in_credits='" + cost_in_credits + '\'' +
				", crew='" + crew + '\'' +
				", cargo_capacity='" + cargo_capacity + '\'' +
				", consumables='" + consumables + '\'' +
				", hyperdrive_rating='" + hyperdrive_rating + '\'' +
				", starship_class='" + starship_class + '\'' +
				", pilots=" + pilots +
				", films=" + films +
				'}';
	}
}

