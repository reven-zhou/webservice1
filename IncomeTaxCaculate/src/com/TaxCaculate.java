package com;

public class TaxCaculate implements TaxCaculateInterface {
    @Override
    public float Caculate(float income) {
        float tax=0;
        float beyond=0;

        beyond=income-3500;
        if(beyond<=0){
            tax=0;
        }else if(beyond<=1500){
            tax= (float) (beyond*0.03);
        }else if(beyond<=4500){
            tax=(float)(beyond*0.1-105);
        }else if(beyond<=9000){
            tax=(float)(beyond*0.2-555);
        }else if(beyond<=35000){
            tax=(float)(beyond*0.25-1005);
        }else if(beyond<=55000){
            tax=(float)(beyond*0.3-2755);
        }else if(beyond<=80000){
            tax=(float)(beyond*0.35-5505);
        }else{
            tax=(float)(beyond*0.45-13505);
        }

        return tax;
    }
}