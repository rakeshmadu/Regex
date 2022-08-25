package com.lambdaFunctions;

import com.exception.InvalidEmailException;

@FunctionalInterface
public interface IEmailValidation {

	public boolean emailValidation(String email) throws InvalidEmailException;
}
