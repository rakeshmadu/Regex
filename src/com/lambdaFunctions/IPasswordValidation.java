package com.lambdaFunctions;

import com.exception.InvalidPasswordException;

@FunctionalInterface
public interface IPasswordValidation {

	public boolean passwordValidation(String password) throws InvalidPasswordException;
}
