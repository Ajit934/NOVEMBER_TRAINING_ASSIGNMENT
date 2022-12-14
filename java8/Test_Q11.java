package com.yash.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Test_Q11 {
	public static void main(String[] args) {

		List<City_Q_11> cityList = new ArrayList<>();

		cityList.add(new City_Q_11(101, "Hyderabad", new State_Q_11(1, "Telangana"), 1f, 10, 40));
		cityList.add(new City_Q_11(102, "Chennai", new State_Q_11(2, "TamilNadu"), 2f, 20, 50));
		cityList.add(new City_Q_11(103, "Pune", new State_Q_11(3, "Maharastra"), 3f, 30, 60));
		cityList.add(new City_Q_11(104, "Mumbai", new State_Q_11(4, "Maharastra"), 4f, 40, 70));
		cityList.add(new City_Q_11(105, "Bangalore", new State_Q_11(5, "Karnataka"), 5f, 50, 80));

		// 1. WAP to find the city with less area and highest population
		City_Q_11 lessArea = cityList.stream().min(Comparator.comparingInt(c -> c.getArea_of_city())).get();
		City_Q_11 highPopulation = cityList.stream().max(Comparator.comparingInt(c -> c.getPopulation())).get();

		System.out.println("Highest population :" + highPopulation);
		System.out.println("LeastArea: " + lessArea);

		// 2. WAP to find the city with high pollution_index and high city area.

		Optional<City_Q_11> highPopArea = cityList.stream()
				.max(Comparator.comparing(City_Q_11::getPollutionIndex).thenComparingInt(City_Q_11::getArea_of_city));
		System.out.println("City having High pollution_index and high city area: " + highPopArea);

		// 3. WAP to print the city detail on the basis of lowest pollution_index first
		// and so on.
		List<City_Q_11> pollIndex = cityList.stream().sorted(Comparator.comparing(City_Q_11::getPollutionIndex)).toList();
		System.out.println("City detail on the basis of lowest pollution_index first: "+pollIndex);

		//4. WAP to print city with lowest pollution index and lowest area of city.
		Optional<City_Q_11> lowestPopArea = cityList.stream()
				.min(Comparator.comparing(City_Q_11::getPollutionIndex).thenComparingInt(City_Q_11::getArea_of_city));
		System.out.println("City having lowest pollution_index and lowest city area: " + lowestPopArea);

		//5. WAP to count how many cities in every state we are having. 
		Map<String, Long> cities = cityList.stream().collect(Collectors.groupingBy(City_Q_11::getCityname, 
				Collectors.counting()));
        
		 System.out.println("Cities in every state: "+cities);
	
	
	}
}
