package com.company;

import java.util.ArrayList;

public class Rate {
     private static ArrayList<Integer>rates=new ArrayList<>();

     public ArrayList<Integer> getRates() {
          return rates;
     }

     public double averageRating(){
          double sum=0.0;
          int i=0;
          for (int rate:rates){
               sum+=rate;
               i++;
          }
          return sum/i;

     }
     public void addRate(int rate){
          rates.add(rate);
     }
     public void getRates(){
          for (int i = 0; i < rates.size(); i++) {
               System.out.println("rate of user " + i + 1 + ": " + rates.get(i));
          }
     }


}
