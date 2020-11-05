package com.itachi.service.impl;

import com.itachi.Dao.PaymentDao;
import com.itachi.entities.Payment;
import com.itachi.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

;

/**
 * @auther zzyy
 * @create 2020-02-18 10:40
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
