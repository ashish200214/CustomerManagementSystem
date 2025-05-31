package com.asent.customerDetails.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectClassForLog {
    @Before("execution(* com.asent.customerDetails.controllers.CustomerController.ModelAcreateCustomerPage(..))")
    public void callPeformAddingCustomer(){
            System.out.println("Customer Creation Method Requested By User.");
    }
}
