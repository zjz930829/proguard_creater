package com.wrbug.proguardcreater;

public class Main {

    public static void main(String[] args) {
        ChineseProguard.start();
        new SpecificCharacterProguard("proguard-111.txt", '1', 'i', 'l', 'L', 'I', '|', 'j', 'J').start();
        new SpecificCharacterProguard("proguard-socialism.txt", "富强民主文明和谐自由平等公正法治爱国敬业诚信友善".toCharArray()).start();
    }
}
