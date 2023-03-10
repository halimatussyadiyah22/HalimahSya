package com.halimahsya.chapter13_AbstactClassesAndInterfaces.latihan;

import java.util.Random;

public class Listing13_Rational extends Number implements Comparable<Listing13_Rational> {
    private long numerator = 0;
    private long denominator = 1;

    public Listing13_Rational() {
        this(0, 1);
    }

    public Listing13_Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;
        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }
        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Listing13_Rational add(Listing13_Rational secondRational) {
        long n = numerator * secondRational.getDenominator() +
                denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Listing13_Rational(n, d);
    }

    public Listing13_Rational substract(Listing13_Rational secondRational) {
        long n = numerator * secondRational.getDenominator()
                - denominator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Listing13_Rational(n, d);
    }

    public Listing13_Rational multiply(Listing13_Rational secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Listing13_Rational(n, d);
    }

    public Listing13_Rational divide(Listing13_Rational secondRational) {
        long n = numerator * secondRational.getNumerator();
        long d = denominator * secondRational.getDenominator();
        return new Listing13_Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return numerator + " ";
        else
            return numerator + " / " + denominator;
    }

    @Override
    public boolean equals(Object other) {
        if ((this.substract((Listing13_Rational) (other))).getNumerator() == 0)
            return true;
        else
            return false;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(Listing13_Rational o) {
        if (this.substract(o).getNumerator() > 0)
            return 1;
         else if (this.substract(o).getNumerator() < 0)
            return -1;
            else
                return  0;
        }
    }

