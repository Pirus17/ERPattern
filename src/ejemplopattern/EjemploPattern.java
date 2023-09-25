/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Piruxb17
 */
public class EjemploPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("ITSE");
        String texto = "Los alumnos del ITSE estudian mucho y a veces estudian poco";
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.println("Coincidencia encontrada: " + matcher.group());
        }
    }

}
