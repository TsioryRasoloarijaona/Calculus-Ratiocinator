package com.STD22109;

public final class Verite extends Affirmation{
    public Verite(String phrase) {
        super(phrase);
        this.setValeurDeVerite(true);
        this.setIncertitude(false);
    }
}
