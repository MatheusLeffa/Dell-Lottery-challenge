package com.dell.lottery.model;

import lombok.Data;

/**
 * @author Matheus Leffa Hilbert
 */

// POJO(plain old java object) modelo de aposta.
@Data
public class BetModel {
    private String name;
    private String cpf;
    private String chosenNumbers;
    private int betID;

    public BetModel(String name, String cpf, String chosenNumbers) {
        this.name = name;
        this.cpf = cpf;
        this.chosenNumbers = chosenNumbers;
    }
}
