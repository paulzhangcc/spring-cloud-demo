package com.paulzhangcc.demo.controller;

import com.paulzhangcc.demo.vo.LoanVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController
public class LoanController {
    public static final String URL_BASE = Prefix.URL_SYSTEM + "/loan";

    @GetMapping(LoanController.URL_BASE+"/get")
    public LoanVo get() {
        LoanVo loanVo = new LoanVo();
        loanVo.setAmount(BigDecimal.valueOf(10000));
        loanVo.setEndTime(new Date());
        loanVo.setStartTime(new Date());
        loanVo.setTitle("新手专享");
        return loanVo;
    }

}