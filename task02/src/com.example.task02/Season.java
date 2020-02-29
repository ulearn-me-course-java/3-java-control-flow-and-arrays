package com.example.task02;

public class Season {
    public final String name;
    private final Seasonable seasonable;

    public boolean IsSeason(int month) {
        return seasonable.isSeason(month);
    }

    public Season(String name, Seasonable seasonable) {
        this.name = name;
        this.seasonable = seasonable;
    }

    public static Season[] getDefault() {
        Season winter = new Season("зима", (month -> month >= 1
                && month <= 2 || month == 12));
        Season spring = new Season("весна", (month -> month >= 3
                && month <= 5));
        Season summer = new Season("лето", (month -> month >= 6
                && month <= 8));
        Season autumn = new Season("осень", (month -> month >= 9
                && month <= 11));
        return new Season[]{winter, spring, summer, autumn};
    }
}

@FunctionalInterface
interface Seasonable {
    public boolean isSeason(int month);
}
