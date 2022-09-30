package stream02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AssignmentTest4 {

	public static void main(String[] args) {
		Student student1 = new Student(101, "Virat", 90.1);
		Student student2 = new Student(102, "Rohit", 90.3);
		Student student3 = new Student(103, "Rahul", 91);
		Student student4 = new Student(104, "Sachin", 92);
		Student student5 = new Student(105, "Dhoni", 90.5);

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

System.out.println("**************************************************************************************");
		
	List<String> names = studentsList.stream()
			.map(e -> e.getStudentName())
			.collect(Collectors.toList());		
		names.stream().forEach(e -> System.out.println(e));
		
System.out.println("**************************************************************************************");		

//*********max score using stream
		List<Double> scores = studentsList.stream()
				.map(d -> d.getStudentScore()).collect(Collectors.toList());
		Double result2 = scores.stream().reduce((x,y) -> x>y ? x:y).get();
		System.out.println("The Maximum Score is : " + result2);

		
//*********min score using stream
		Double result3 = scores.stream().reduce((x,y) -> x<y ? x:y).get();
		System.out.println("The Minimum Score is : " + result3);

System.out.println("**************************************************************************************");		
//*********avg score using stream
		Double result4 = scores.stream().reduce((x,y) -> (x+y)).get();
		
		System.out.println("The Average of all scores is : " + result4/studentsList.size());			
	
//		Double result44 = scores.stream().mapToDouble(a -> a).average().orElse(0);
//		System.out.println("The Average of all scores is : " + result44);
		
		
//*********sum of scores using stream		
		Double result5 = scores.stream().reduce((x, y) -> (x+y)).get();
		System.out.println("The Sum of all scores is : " + result5);		
		

System.out.println("**************************************************************************************");				
				
//***** max score along with name		
		Double maxScore = scores.stream().reduce((x,y) -> x>y? x:y).get();
		Stream<Student> matchMaxScore = studentsList.stream().filter(e -> e.getStudentScore()==maxScore);
		matchMaxScore
			.forEach(e -> System.out.println("Student having maximum score : " +e.getStudentName()+" :Score - "+e.getStudentScore()));
		
		
//***** min score along with name			
		Double minScore = scores.stream().reduce((x,y) -> x<y? x:y).get();
		Stream<Student> matchMinScore = studentsList.stream().filter(e -> e.getStudentScore()==minScore);
		matchMinScore
			.forEach(e -> System.out.println("Student having minimum score : " +e.getStudentName()+" :Score - "+e.getStudentScore()));

		
System.out.println("**************************************************************************************");		
//*****all students with starting letter S
		System.out.println("Student's whose name starts with S : ");
		List<String> prefixName = studentsList.stream()
				.map(e -> e.getStudentName())
					.collect(Collectors.toList());
		prefixName.stream().filter(e -> e.startsWith("S")).forEach(e->System.out.println(e));
		
	}
	
}

