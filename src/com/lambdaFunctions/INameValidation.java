package com.lambdaFunctions;

import com.exception.InvalidNameException;

@FunctionalInterface
public interface INameValidation {

	public boolean nameValidation(String name) throws InvalidNameException;
}
