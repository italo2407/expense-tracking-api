package com.demo.expensetrackingapi.repositories;

import com.demo.expensetrackingapi.domain.User;
import com.demo.expensetrackingapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
