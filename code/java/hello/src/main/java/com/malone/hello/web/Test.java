package com.malone.hello.web;

import java.text.DecimalFormat;

public class Test {

    public static void main(String[] args) {
        Double historyPreAvg = 5.1122111;
        Double preAvg47 = 8.12551415;
        Double  preIncreScop = (historyPreAvg- preAvg47);
        Float preIncreScopStr= Float.valueOf(new DecimalFormat("0.00").format(preIncreScop));
        String preDesc ="";
        if (preIncreScopStr > 0) {
            preDesc +="减少"+preIncreScopStr+"mm";
        }else if (historyPreAvg < preAvg47) {
            preDesc +="增加"+(0 - preIncreScopStr)+"mm";
        }else {
            preDesc +="基本相当";
        }
        System.out.println(preDesc);
    }
}
