package com.setin.study.objects.chapter04.sub04;


import com.setin.study.objects.chapter04.Customer;
import com.setin.study.objects.chapter04.Money;

public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Money fee = screening.calculateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);

    }
}
