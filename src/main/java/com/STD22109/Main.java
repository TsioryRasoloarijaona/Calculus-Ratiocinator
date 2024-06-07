package com.STD22109;

public class Main {
    public static void main(String[] args) {
        Affirmation affirmation1 = new Affirmation(" Lou est beau", true);
        Affirmation affirmation2 = new Affirmation("lou est pauvre" , false);
        CalculateurDeVerite calculateurDeVerite = new CalculateurDeVerite(affirmation1,affirmation2 , "ou");


        Verite verite = new Verite("Lou est beau");
        Monsonge monsonge = new Monsonge("loou est pauvre");
        Incertitude incertitude = new Incertitude("genereux");
        CalculateurDeVerite calculateurDeVerite1 = new CalculateurDeVerite(verite , incertitude , "et");
    }
}