package com.demo.expensetrackingapi.repositories;

import com.demo.expensetrackingapi.domain.Transaction;
import com.demo.expensetrackingapi.exceptions.EtBadRequestException;
import com.demo.expensetrackingapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface TransactionRepository {

    List<Transaction> findAll(Integer userId, Integer categoryId);

    Transaction findById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

    Integer create(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException;

    void removeId(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

}
