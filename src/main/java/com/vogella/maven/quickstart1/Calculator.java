package com.vogella.maven.quickstart1;
public class Calculator 
{
	//Yesu Prabhu and Mary Matha and Joseph
	public static void main(String[] args) 
	{
		CalculatorModels model = new CalculatorModels();
		CalculatorViews view = new CalculatorViews();
		new CalculatorControllers(model,view);
	}
}
