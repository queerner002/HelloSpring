package com.java.tx;

/**
 * Created by Administrator on 2018/8/19 0019.
 */
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
