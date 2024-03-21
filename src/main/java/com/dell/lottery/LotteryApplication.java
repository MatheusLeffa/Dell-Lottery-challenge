package com.dell.lottery;

import com.dell.lottery.view.MainMenu;
import com.formdev.flatlaf.FlatDarculaLaf;

/**
 * @author Matheus Leffa Hilbert
 * E-mail: matheus.hilbert@hotmail.com
 */
public class LotteryApplication {

    //Inícializa o Menu Principal da aplicação com o tema FlatDarculaLaf.
    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        MainMenu.startUpMainMenu();
    }
}
