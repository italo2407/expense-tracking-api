package com.demo.expensetrackingapi.services;

import com.demo.expensetrackingapi.domain.User;
import com.demo.expensetrackingapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
