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
		countSmileys.add(":-)");
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
		int smileyCount = 0;
		
		
//		This outer loop goes through the argument passed and adds them to a temporary arrayList for further analysis      
		for(String smiley: arr)
		{
			tempFaces.clear();
			tempFaces.addAll(Arrays.asList(smiley.split("")));
			tempFaces.removeAll(Arrays.asList(smiley, ""));
			System.out.println(tempFaces);
			
			int i = 0;
			while(i < tempFaces.size())
			{
				if(tempFaces.get(i).contains(":") || tempFaces.get(i).contains(";"))
				{
					i++;
					System.out.println("Right Eyes" + smiley + tempFaces.get(i));
					
					if(tempFaces.get(i).contains("-") || tempFaces.get(i).contains("~")|| tempFaces.get(i).equals(""))
					{
						System.out.println("Right Nose" + smiley);
						i++;
						
						if(tempFaces.get(i).contains(")") || tempFaces.get(i++).contains("D"))
						{
							System.out.println("Right Mouth" + smiley);
							smileyCount++;
						}
					}
				}
				
				i++;
			}
			
			
			
			
			
			
			
			
			
			
			
//			
////			The inner loop where we loop through faces components.
//			for(int i = 0; i < tempFaces.size(); i++)
//			{
//				if(tempFaces.get(i).contains(":") || tempFaces.get(i).contains(";"))
//				{
//					System.out.println("Right Eyes" + smiley + tempFaces.get(i));
//					
//					if(tempFaces.get(i++).contains("-") || tempFaces.get(i++).contains("~")|| tempFaces.get(i++).equals(""))
//					{
//						System.out.println("Right Nose" + smiley);
//						i++;
//						
//						if(tempFaces.get(i).contains(")") || tempFaces.get(i++).contains("D"))
//						{
//							System.out.println("Right Mouth" + smiley);
//							smileyCount++;
//						}
//					}
//				}
//				
//			}
			
		}
		
		return smileyCount;
	}
	
}
