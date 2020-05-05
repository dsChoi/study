package com.setin.study.objects.chapter09;

import com.setin.study.objects.chapter04.Screening;
import com.setin.study.objects.chapter04.sub04.DiscountCondition;
import com.setin.study.objects.chapter04.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class DiscountPolicy {

	private List<DiscountCondition> conditions = new ArrayList<>();


	public DiscountPolicy(List<DiscountCondition> conditions) {
		this.conditions = conditions;
	}

	public Money calculateDiscountAmount(Screening screening){
		for (DiscountCondition condition : conditions) {
			if(condition.isSatisfiedBy(screening)){
				return getDiscountedFee(screening);
			}
		}
		return screening.getMovie().getFee();
	}

	abstract protected Money getDiscountedFee(Screening screening);
}
