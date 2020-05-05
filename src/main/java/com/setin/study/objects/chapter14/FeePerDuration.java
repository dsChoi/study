package com.setin.study.objects.chapter14;

import com.setin.study.objects.chapter04.Money;

import java.time.Duration;

public class FeePerDuration {
    private Money fee;
    private Duration duration;

    public FeePerDuration(Money fee, Duration duration) {
        this.fee = fee;
        this.duration = duration;
    }

    public Money calculate(DateTimeInterval interval) {
        return fee
                .times(interval.duration().getSeconds() / duration.getSeconds());
    }
}
