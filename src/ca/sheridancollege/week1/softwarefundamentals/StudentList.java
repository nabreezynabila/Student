/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author Nabreezy
 */
public class StudentList {
    public static void main(String[]args)
    {
      // create array of students
        Student[] sList= new Student[5];
    
     // put names in the array
     for (int i=0; i<sList.length-1; i++)
     {
        sList[i]= new Student();
        sList[i].setName("Student" + (i+1));
            
    }
     // print the array
     for (Student s:sList)
         System.out.println("The Student name is: " + s.getName());
    
     
    }
            
     

}
