package com.paulzhangcc.demo.controller;

import com.paulzhangcc.demo.EsModel.LoanEsBean;
import com.paulzhangcc.demo.service.LoanServiceEs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by paul on 2017/7/21.
 */
@RestController
public class LoanController {
    @Autowired
    LoanServiceEs loanService;

    @GetMapping("/get")
    public LoanEsBean get(@RequestParam(name = "id") Integer loanId) {
        System.out.println("==========================");
        return loanService.findOne(loanId);
    }

    @GetMapping("/save")
    public LoanEsBean save(@RequestParam(name = "id") Integer loanId) {
        LoanEsBean loanEsBean = new LoanEsBean();
        loanEsBean.setLoanId(loanId);
        loanEsBean.setTitle("个人借款" + loanId);
        loanEsBean.setAmount(new BigDecimal(loanId));
        return loanService.save(loanEsBean);
    }

    @GetMapping("/delete")
    public boolean save() {
        loanService.deleteAll();
        return Boolean.TRUE;
    }

    @GetMapping("/count")
    public long count() {
        return loanService.count();
    }
}
