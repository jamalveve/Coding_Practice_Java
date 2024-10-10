package InterviewQuestionsFromYoutube;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsInStream {
public static void main(String[] args) {
	List<Integer> listofElements=Arrays.asList(1,3,5,7,3,6,8,6,4,3,3);
	Set<Integer> set=new HashSet<>();
	Set<Integer> duplicateValues=listofElements.stream().filter(values->!set.add(values)).collect(Collectors.toSet());
	System.out.println(duplicateValues);
	
}
}
