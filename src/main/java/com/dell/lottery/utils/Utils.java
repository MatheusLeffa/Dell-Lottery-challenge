package com.dell.lottery.utils;

import com.dell.lottery.model.BetModel;

import java.util.ArrayList;
import java.util.HashSet;
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

    public static HashSet<Integer> stringToIntegerHashSet(String stringNumbers) {
        String[] numbersStringArray = stringNumbers.replaceAll("[^0-9,]", "").split(",");
        HashSet<Integer> numbersSet = new HashSet<>();

        for (String number : numbersStringArray) {
            numbersSet.add(Integer.parseInt(number.trim()));
        }
        return numbersSet;
    }

    public static int getRandomPrizeNumber() {
        return (int) (Math.round(Math.random() * 49) + 1);
    }

}
