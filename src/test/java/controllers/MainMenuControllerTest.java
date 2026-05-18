package controllers;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static application.App.visitantes;
import static org.junit.jupiter.api.Assertions.*;

class MainMenuControllerTest {



    @Test
    public void setProfileText() {

        String name = JOptionPane.showInputDialog(null, "Nombre");

        char charFirst = name.charAt(0);
        char charSecond = ' ';

        if (name.contains(" ")) {
            String[] partes = name.split(" ");
            charSecond = partes[1].charAt(0);
        }

        String newCharFirst = String.valueOf(charFirst).toUpperCase();
        String newCharSecond = String.valueOf(charSecond).toUpperCase();
        System.out.println(newCharFirst + newCharSecond);
    }

}