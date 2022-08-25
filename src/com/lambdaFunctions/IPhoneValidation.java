package com.lambdaFunctions;

import com.exception.InvalidPhoneNumberException;

@FunctionalInterface
public interface IPhoneValidation {

	public boolean phoneValidation(String phone) throws InvalidPhoneNumberException;
}
