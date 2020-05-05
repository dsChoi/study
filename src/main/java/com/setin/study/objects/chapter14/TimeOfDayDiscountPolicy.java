package com.setin.study.objects.chapter14;

import com.setin.study.objects.chapter04.Money;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TimeOfDayDiscountPolicy extends BasicRatePolicy {

    private List<LocalTime> starts = new ArrayList<>();
    private List<LocalTime> ends  = new ArrayList<>();
    private List<Duration> durations = new ArrayList<>();
    private List<Money> amounts = new ArrayList<>();


    @Override
    protected Money calculateCallFee(Call cal) {
        Money result = Money.ZERO;


        return null;
    }
}
