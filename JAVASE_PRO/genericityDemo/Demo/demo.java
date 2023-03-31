package com.JAVASE_PRO.genericityDemo.Demo;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(bmws);
        go(benzs);
    }

    public static void go(ArrayList<? extends car> arr){

    }
}

class car{

}

class BMW extends car{

}

class BENZ extends car{

}

