package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller
{
	
	private List<String> countSmileys;
	private List<String> possibleEyes;
	private List<String> possibleNoses;
	private List<String> possibleMouths;
	
	private List<String> tempFaces;
	
	public Controller()
	{
//		The initial test array
		countSmileys = new ArrayList<>();
		countSmileys.add("x0D");
		countSmileys.add(":-(");
		countSmileys.add(":..-)");
		countSmileys.add(";~)");
		
		
//		the array for eyes
		possibleEyes = new ArrayList<>();
		possibleEyes.add(":");
		possibleEyes.add(";");
		
		
//		the array for noses
		possibleNoses = new ArrayList<>();
		possibleNoses.add("-");
		possibleNoses.add("~");
		possibleNoses.add("");
		
//		The array for mouths
		possibleMouths = new ArrayList<>();
		possibleMouths.add(")");
		possibleMouths.add("D");
		
		
		
		tempFaces = new ArrayList<>();
	}
	
	public void start()
	{
		
		System.out.println(countSmileys(countSmileys));
		
	}
	
	
	private int countSmileys(List<String> arr)
	{
		int returnMe = 0;
		int smileyCount = 0;
		
		
//		This outer loop goes through the argument passed and adds them to a temporary arrayList for further analysis      
		for(String smiley: arr)
		{
			tempFaces.clear();
			tempFaces.addAll(Arrays.asList(smiley.split("")));
			
//			The inner loop where we loop through faces components.
			for(String parts: tempFaces)
			{
				
			}
			
		}
		
		return returnMe;
	}
	
}
