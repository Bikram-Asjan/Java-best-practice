package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TooManyListenersException;
import static java.util.stream.Collector.*;

import java.util.stream.Collectors;
import java.util.stream.Collectors.*;
public class Stream_1 {

	public static void main(String[] args) {
			List<Person> peopleList = Arrays.asList(
					new Person("Bikram", Gender.MALE, 26),
					new Person("Rintu", Gender.MALE, 27),
					new Person("Raja", Gender.MALE, 17),
					new Person("Bantu", Gender.MALE, 17),
					new Person("Payel", Gender.FEMALE, 20),
					new Person("Saheli", Gender.FEMALE, 19)
					);
			// get in upper case, the name of all female who are upper than 18
			List<String> names = new ArrayList<>();
			
			for(Person person : peopleList){
				if(person.getAge() > 18){
					names.add(person.getName().toUpperCase());
				}
			}
			//System.out.println(names);
			
			// now using streams
			 List<String> names2 = peopleList.stream()
					 .filter(person -> person.getAge() > 18)
					 .map(person -> person.getName())
					 .map(name -> name.toUpperCase())
					 .collect(Collectors.toList());
			 
			// System.out.println("using stream api "+names2);
			 
			 // changes using stream to concise the word and code
			 // focusing on high level abstraction, stream is not a data structure, 
			 // stream is high level abstraction, it is non mutating means we are not 
			 //modifying the collection
			 List<String> names3 = peopleList.stream()
					 .filter(person -> person.getAge() > 18)
					 .map(Person::getName)
					 .map(String::toUpperCase)
					 .collect(Collectors.toList());
			// here true useful of stream api 
			peopleList.stream()
					.filter(person -> person.getGender() == Gender.FEMALE && person.getAge() > 19)
					.map(person -> new Person(person.getName().toUpperCase(), 
							person.getGender(), person.getAge()))
					.forEach(System.out::println);
			//System.out.println(peopleList);
			
			// reduce operation
			// I want total of the age
			System.out.println(
			peopleList.stream()
					  .map(Person::getAge)
			          .reduce(0, (carry, age) -> carry + age));
			
			System.out.println(
			peopleList.stream()
			          .map(Person::getAge)
			          .reduce(0, Integer::sum));
			
			System.out.println(
					peopleList.stream()
					          .mapToInt(Person::getAge) // converts collection of Integer Stream
					          .sum());
			
			System.out.println(
					peopleList.stream()
					          .min((person1, person2) ->
					          person1.getAge() > person2.getAge() ? 1 : -1));
			
	
			
			 
	}

}
