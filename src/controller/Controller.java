package controller;

import java.util.ArrayList;
import java.util.List;

public class Controller
{
	
	private List<String> myList;
	private List<String> possibleEyes;
	private List<String> possibleNoses;
	private List<String> possibleMouths;
	
	public Controller()
	{
//		The initial test array
		myList = new ArrayList<>();
		myList.add(":)");
		myList.add(";(");
		myList.add(";(");
		myList.add(";}");
		myList.add(":-D");
		
		
//		the array for eyes
		possibleEyes = new ArrayList<>();
		possibleEyes.add(":");
		possibleEyes.add(";");
		
		
//		the array for noses
		possibleNoses = new ArrayList<>();
		possibleNoses.add("-");
		possibleNoses.add("~");
		
//		The array for mouths
		possibleMouths = new ArrayList<>();
		possibleMouths.add(")");
		possibleMouths.add("D");
	}
	
	public void start()
	{
		
		countSmileys(myList);
		
	}
	
	
	private int countSmileys(List<String> arr)
	{
		int returnMe = 0;
		
		return returnMe;
	}
	
}
