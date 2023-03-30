/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gradebooktest;

/**
 *
 * @author VALENTINA
 */
public class Gradebook {
    /*
	/***
	 * 
	 * ***/
	private String courseName;
	
	
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}


	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
 

	public void displayMessage() {
		System.out.println("Bienvenido a la planilla de notas " + getCourseName());
	}


}
