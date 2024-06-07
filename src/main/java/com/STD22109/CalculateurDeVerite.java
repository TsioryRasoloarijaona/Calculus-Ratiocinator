package com.STD22109;

public class CalculateurDeVerite {

    private Affirmation affirmation1;
    private Affirmation affirmation2;
    enum reponse {
        vrai , faux , jenesaispas
    }
    private String conjonction ;

    public CalculateurDeVerite(Affirmation affirmation1, Affirmation affirmation2 , String conjonction) {
        this.affirmation1 = affirmation1;
        this.affirmation2 = affirmation2;
        this.conjonction = conjonction;
    }

    public reponse donnerLaReponse (){
        reponse reponse = null ;

        if (affirmation1.isIncertitude() || affirmation2.isIncertitude()){
            reponse = reponse.jenesaispas;
        }else {
          if (conjonction == "et"){
          return reponse = affirmation1.isValeurDeVerite() && affirmation2.isValeurDeVerite()? reponse.vrai : reponse.faux ;
        }
          if (conjonction == "ou"){
          return  reponse = affirmation1.isValeurDeVerite() || affirmation2.isValeurDeVerite() ? reponse.vrai : reponse.faux;
        }
          if (conjonction == "donc"){
           return reponse = affirmation1.isValeurDeVerite() && !affirmation2.isValeurDeVerite() ? reponse.faux : reponse.vrai;
        }

        }

        return reponse;

    }


}
