package com.setin.study.objects.chapter05.sub;

import com.setin.study.objects.chapter04.*;

public class ReservationAgency {

    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        boolean discountable = checkDiscountable(screening);
        Money fee = calculate(screening, discountable, audienceCount);
        return createReservation(screening, customer, audienceCount, fee);
    }


    private boolean isDiscountable(DiscountCondition condition, Screening screening){
        if(condition.getType() == DiscountConditionType.PERIOD){
            return  isSatisfiedByPeriod(condition, screening);
        }
        return isSatisfiedBySequence(condition, screening);
    }

    private boolean isSatisfiedBySequence(DiscountCondition condition, Screening screening) {
        return condition.getSequence() == screening.getSequence();
    }

    private boolean isSatisfiedByPeriod(DiscountCondition condition, Screening screening) {
        return screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek()) &&
                condition.getStartTime().compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
                condition.getEndTime().compareTo(screening.getWhenScreened().toLocalTime()) >=0;
    }

    private Reservation createReservation(Screening screening, Customer customer, int audienceCount, Money fee) {
        return null;
    }

    private Money calculate(Screening screening, boolean discountable, int audienceCount) {
        return null;
    }

    private boolean checkDiscountable(Screening screening) {
        return false;
    }
}
