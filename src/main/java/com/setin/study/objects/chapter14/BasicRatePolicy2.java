package com.setin.study.objects.chapter14;

import com.setin.study.objects.chapter04.Money;

import java.util.ArrayList;
import java.util.List;

public class BasicRatePolicy2 {
    private List<FeeRule> feeRules = new ArrayList<>();

    public BasicRatePolicy2(List<FeeRule> feeRules) {
        this.feeRules = feeRules;
    }

    public Money calculateFee(Phone phone){
        return phone.getCalls()
                .stream()
                .map(call -> calculate(call))
                .reduce(Money.ZERO, (first, second) -> first.plus(second));
    }

    private Money calculate(Call call){
        return feeRules
                .stream()
                .map(rule -> rule.calcuateFee(call))
                .reduce(Money.ZERO , (first, second) -> first.plus(second));
    }
}
