package com.dell.lottery.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static boolean containsNonNumeric(String str) {
        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static boolean isOutOfBetRange(String str) {
        int numeroEscolhido = Integer.parseInt(str);
        return numeroEscolhido < 1 || numeroEscolhido > 50;
    }

    public static boolean isValidCpf(String cpf) {
        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        return cpf.matches(regex);
    }

    public static List<Integer> stringToIntegerList(String stringNumbers){
        String[] numbersStringArray = stringNumbers.split(", ");
        List<Integer> numbersList = new ArrayList<>();

        for (String number : numbersStringArray) {
            numbersList.add(Integer.parseInt(number.trim()));
        }
        return numbersList;
    }

    public static int getRandomPrizeNumber(){
        return (int) (Math.round(Math.random() * 49) + 1);
    }
}
