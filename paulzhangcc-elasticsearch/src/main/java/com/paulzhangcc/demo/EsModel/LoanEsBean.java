package com.paulzhangcc.demo.EsModel;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by paul on 2017/7/21.
 */
@Document(indexName = "pengrun",type="loan")
public class LoanEsBean implements Serializable{
    @Id
    private Integer loanId;
    @Field
    private String title;
    @Field
    private BigDecimal amount;

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

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

    @Override
    public String toString() {
        return "LoanESBean{" +
                "loanId=" + loanId +
                ", title='" + title + '\'' +
                ", amount=" + amount +
                '}';
    }
}
