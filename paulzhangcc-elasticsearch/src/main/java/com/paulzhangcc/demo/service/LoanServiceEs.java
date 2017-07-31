package com.paulzhangcc.demo.service;

import com.paulzhangcc.demo.EsModel.LoanEsBean;
import com.paulzhangcc.demo.EsRepository.LoanEsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by paul on 2017/7/21.
 */
@Component
public class LoanServiceEs{
    @Autowired
    LoanEsRepository loanEsRepository;

    public LoanEsBean save(LoanEsBean s) {
        return loanEsRepository.save(s);
    }

    public LoanEsBean findOne(Integer loanId) {
        return loanEsRepository.findOne(loanId);
    }

    public boolean exists(Integer loanId) {
        return loanEsRepository.exists(loanId);
    }

    public Iterable<LoanEsBean> findAll() {
        return loanEsRepository.findAll();
    }

    public long count() {
        return loanEsRepository.count();
    }

    public void delete(Integer integer) {
        loanEsRepository.delete(integer);
    }

    public void deleteAll() {
        loanEsRepository.deleteAll();
    }

}
