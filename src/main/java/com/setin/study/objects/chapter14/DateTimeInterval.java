package com.setin.study.objects.chapter14;

import lombok.Getter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DateTimeInterval {

    @Getter
    private LocalDateTime from;
    @Getter
    private LocalDateTime to;

    private DateTimeInterval(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    public static DateTimeInterval of(LocalDateTime from, LocalDateTime to) {
        return new DateTimeInterval(from, to);
    }

    private static DateTimeInterval toModnight(LocalDateTime from) {
        return new DateTimeInterval(from, LocalDateTime.of(from.toLocalDate(), LocalTime.of(23, 59, 59)));
    }

    private static DateTimeInterval fromModnight(LocalDateTime to) {
        return new DateTimeInterval(
                LocalDateTime.of(to.toLocalDate(), LocalTime.of(0, 0)), to);
    }

    public Duration duration() {
        return Duration.between(from, to);
    }

    public List<DateTimeInterval> splitByDay() {

        if (days() > 1) {
            return splityByDay(days());
        }


        return Arrays.asList(this);
    }

    private List<DateTimeInterval> splityByDay(int days) {
        List<DateTimeInterval> result = new ArrayList<>();
        addFirstDay(result);
        addMiddleDays(result, days);
        addLastDay(result);
        return result;
    }

    private void addMiddleDays(List<DateTimeInterval> result, int days) {

    }

    private void addLastDay(List<DateTimeInterval> result) {

    }

    private void addFirstDay(List<DateTimeInterval> result) {
        result.add(DateTimeInterval.toModnight(from));
    }

    private int days() {
        return Period.between(from.toLocalDate(), to.toLocalDate()).plusDays(1).getDays();
    }
}
