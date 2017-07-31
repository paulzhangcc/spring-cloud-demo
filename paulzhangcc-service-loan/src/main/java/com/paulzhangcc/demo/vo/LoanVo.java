package com.paulzhangcc.demo.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by paul on 2017/6/29.
 */
public class LoanVo  implements Serializable{
    private static final long serialVersionUID = -241477741052615634L;
    private String title;
    private BigDecimal amount;
    private Date startTime;
    private Date endTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "LoanVo{" +
                "title='" + title + '\'' +
                ", amount=" + amount +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
