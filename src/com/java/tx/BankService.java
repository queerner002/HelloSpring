package com.java.tx;

import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * Created by Administrator on 2018/8/19 0019.
 */
//@Transactional(rollbackFor = Exception.class)
public class BankService {
    private BankDao bankDao;

    public void setBankDao(BankDao bankDao) {
        this.bankDao = bankDao;
    }

    public void transfer1(final long fromId, final long toId, double amount) {
        bankDao.deductBalance(fromId, amount);
        int err = 10 / 0;
        bankDao.addBalance(toId, amount);
    }

}
