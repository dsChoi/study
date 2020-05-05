package com.setin.study.objects.chapter14;

import lombok.Getter;

import java.util.List;

public class Phone {
    @Getter
    private List<Call> calls;

    public Phone(List<Call> calls) {

        this.calls = calls;
    }
}
