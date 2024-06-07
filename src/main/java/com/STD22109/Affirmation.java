package com.STD22109;

public sealed class  Affirmation permits Verite , Monsonge , Incertitude{
    private String phrase;
    private boolean valeurDeVerite;
    private boolean incertitude;


    public Affirmation (String phrase, boolean valeurDeVerite) {
        this.phrase = phrase;
        this.valeurDeVerite = valeurDeVerite;
    }

    public Affirmation (String phrase) {
        this.phrase = phrase;
        this.valeurDeVerite = valeurDeVerite;
        this.incertitude = incertitude;
    }

    public String getPhrase() {
        return phrase;
    }

    public boolean isValeurDeVerite() {
        return valeurDeVerite;
    }

    public boolean isIncertitude() {
        return incertitude;
    }

    public void setValeurDeVerite(boolean valeurDeVerite) {
        this.valeurDeVerite = valeurDeVerite;
    }

    public void setIncertitude(boolean incertitude) {
        this.incertitude = incertitude;
    }
}
