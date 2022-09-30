package stream02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		Student student1 = new Student(101, "Rahul", 90);
		Student student2 = new Student(102, "Rohit", 90);
		Student student3 = new Student(103, "Sachin", 91);
		Student student4 = new Student(104, "Kohli", 92);
		Student student5 = new Student(105, "Dhoni", 90);


		List<Student> studentsList = new ArrayList<>();
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);
		studentsList.add(student4);
		studentsList.add(student5);

		List<Student> result1 = studentsList.stream()
				.filter(e -> e.getStudentScore() > 90)
				.collect(Collectors.toList());
		
		result1.stream().forEach(e -> System.out.println(e.getStudentName()));

//	List<String> names = studentsList.stream()
//			.map(e -> e.getStudentName())
//			.collect(Collectors.toList());
//		
//		names.stream().forEach(e -> System.out.println(e));

//*********max score using stream
		List<Double> scores = studentsList.stream().map(d -> d.getStudentScore()).collect(Collectors.toList());
		Double result2 = Collections.max(scores, null);
		Double result22 = scores.stream().max((x,y) -> x.compare(x, y)).get();
		System.out.println(result22);
		System.out.println("MAXIMUM SCORE IS : " + result2);

//*********min score using stream
		Double result3 = Collections.min(scores, null);
		System.out.println("MINIMUM SCORE IS : " + result3);

//*********avg score using stream
		Double result4 = getAverage(scores);
		System.out.println("AVERAGE SCORE IS : " + result4);

		Double result44 = scores.stream().reduce((x, y) -> (x+y)/studentsList.size()).get();
		System.out.println(result44);			

		
//*********sum of scores using stream		
		Double result5 = getSum(scores);
		System.out.println("SUM OF SCORES IS : " + result5);

//		Double result55 = scores.stream().reduce((x, y) -> (x+y)).get();
//		System.out.println(result55);		
		
		
		System.out.println();
		
//***** max score along with name		
		Double maxScore = studentsList.stream()
				.map(e -> e.getStudentScore())
					.max(Double::compare).get();	
		studentsList.stream()
			.filter(e -> e.getStudentScore() == maxScore)
				.forEach(e -> System.out.println("Max Marks With Name : \n "+e.getStudentScore() +"---"+ e.getStudentName()));

		System.out.println();
		
//***** min score along with name			
		Double minScore = studentsList.stream()
				.map(e -> e.getStudentScore())
					.min(Double::compare).get();	
		studentsList.stream()
			.filter(e -> e.getStudentScore() == minScore)
				.forEach(e -> System.out.println("Min Marks With Name : \n "+e.getStudentScore() +"---"+ e.getStudentName()));
	
		System.out.println();
		
//*****all students with starting letter S
		List<String> names = studentsList.stream()
				.map(e -> e.getStudentName())
					.collect(Collectors.toList());
	
		names.stream().filter(e -> e.startsWith("S")).forEach(e -> System.out.println(e));;
			
	}
	
	public static Double getMaxScore(List<Double> scores)
	{
		return scores.stream().max((x,y) -> x.compareTo(y)).get();
	}


	public static double getAverage(List<Double> scores) {
		return scores.stream().mapToDouble(a -> a).average().orElse(0);
	}

	public static double getSum(List<Double> scores) {
		return scores.stream().mapToDouble(a -> a).sum();
	}

}

