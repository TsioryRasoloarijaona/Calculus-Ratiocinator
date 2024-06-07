package com.STD22109;

import java.util.List;

public class CalculateurDeVerite {

    private Affirmation affirmation1;
    private Affirmation affirmation2;

    public enum reponse {
        vrai, faux, jenesaispas
    }

    private String conjonction;

    public CalculateurDeVerite(Affirmation affirmation1, Affirmation affirmation2, String conjonction) {
        this.affirmation1 = affirmation1;
        this.affirmation2 = affirmation2;
        this.conjonction = conjonction;
    }

    public reponse donnerLaReponse() {
        reponse reponse = null;

        if (affirmation1.isIncertitude() && affirmation2.isIncertitude()) {
            reponse = reponse.jenesaispas;
        } else {

            if (conjonction == "et") {
                reponse = affirmation1.isValeurDeVerite() && affirmation2.isValeurDeVerite() ? reponse.vrai :
                        affirmation1.isIncertitude() || affirmation2.isIncertitude() ? reponse.jenesaispas : reponse.faux;
            }
            if (conjonction == "ou") {
                reponse = affirmation1.isValeurDeVerite() || affirmation2.isValeurDeVerite() ? reponse.vrai : reponse.faux;
            }
            if (conjonction == "donc") {
                reponse = affirmation1.isValeurDeVerite() && !affirmation2.isValeurDeVerite() ? reponse.faux :
                        affirmation1.isIncertitude() || affirmation2.isIncertitude() ? reponse.jenesaispas : reponse.vrai;
                ;
            }
        }

        return reponse;

    }



    @Override
    public String toString() {
        return "CalculateurDeVerite{" +
                "affirmation1=" + affirmation1 +
                ", affirmation2=" + affirmation2 +
                ", conjonction='" + conjonction + '\'' +
                '}';
    }
}
