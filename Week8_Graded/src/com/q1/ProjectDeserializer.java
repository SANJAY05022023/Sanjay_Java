package com.q1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public class ProjectDeserializer {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Map<Project, ArrayList<Employee>> obj = null; 
		
		FileInputStream fis = new FileInputStream("File.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);
		obj = (Map<Project, ArrayList<Employee>>) ois.readObject();
		ois.close();
		
		for(Entry<Project, ArrayList<Employee>> temp : obj.entrySet())
		{
			System.out.println(temp.getKey()+" Has the following employees");
			for(Employee A : temp.getValue())
			{
				System.out.println(A);
			}
		}
	}
	
}
