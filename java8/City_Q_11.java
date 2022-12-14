package com.yash.java8;

public class City_Q_11 {
	private int cityid;
	private String cityname;
	private State_Q_11 objState;
	private Float pollutionIndex;
	private int population;
	private int area_of_city;

	public City_Q_11(int cityid, String cityname, State_Q_11 objState, Float pollutionIndex, int population, int area_of_city) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.objState = objState;
		this.pollutionIndex = pollutionIndex;
		this.population = population;
		this.area_of_city = area_of_city;
	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public State_Q_11 getObjState() {
		return objState;
	}

	public void setObjState(State_Q_11 objState) {
		this.objState = objState;
	}

	public Float getPollutionIndex() {
		return pollutionIndex;
	}

	public void setPollutionIndex(Float pollutionIndex) {
		this.pollutionIndex = pollutionIndex;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getArea_of_city() {
		return area_of_city;
	}

	public void setArea_of_city(int area_of_city) {
		this.area_of_city = area_of_city;
	}

	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + ", objState=" + objState + ", pollutionIndex="
				+ pollutionIndex + ", population=" + population + ", area_of_city=" + area_of_city + "]";
	}
}
