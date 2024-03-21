package com.dell.lottery.utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Matheus Leffa Hilbert
 */
public class Utils {

    // Valida se na String passada tem algum valor não-numérico.
    public static boolean containsNonNumeric(String str) {
        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    // Valida se o número informado está dentro do range 1-50
    public static boolean isNumberStringOutOfBetRange(String str) {
        int numeroEscolhido = Integer.parseInt(str);
        return numeroEscolhido < 1 || numeroEscolhido > 50;
    }

    // Valida se o CPF passado está no formato ###.###.###-##
    public static boolean isValidCpf(String cpf) {
        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        return cpf.matches(regex);
    }

    // Recebe uma String de números, e transforma numa ArrayList<Integer>.
    public static ArrayList<Integer> stringNumberToIntegerList(String stringNumbers) {
        String[] numbersStringArray = stringNumbers.replaceAll("[^0-9,]", "").split(",");
        ArrayList<Integer> numbersSet = new ArrayList<>();

        for (String number : numbersStringArray) {
            numbersSet.add(Integer.parseInt(number.trim()));
        }
        return numbersSet;
    }
}
