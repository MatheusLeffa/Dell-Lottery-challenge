package com.dell.lottery.utils;

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
}
