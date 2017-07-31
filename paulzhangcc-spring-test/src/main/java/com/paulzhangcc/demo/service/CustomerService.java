package com.paulzhangcc.demo.service;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by paul on 2017/7/13.
 */
public class CustomerService implements FactoryBean{


    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    private String customer;

    @Override
    public Object getObject() throws Exception {
        return new CustomerService();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

}
