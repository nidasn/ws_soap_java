package org.axis1.services;

public class CalculatorService implements WsCalculator{

	@Override
	public int add(int a, int b) {

		return a+b;
	}

	@Override
	public int substract(int x, int y) {

		return x-y;
	}

}
