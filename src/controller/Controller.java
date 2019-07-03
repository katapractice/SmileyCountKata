package controller;

import java.util.ArrayList;
import java.util.List;

public class Controller
{
	
	private List<String> myList;
	
	public Controller()
	{
		myList = new ArrayList<>();
		myList.add(":)");
		myList.add(";(");
		myList.add(";(");
		myList.add(";}");
		myList.add(":-D");
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
