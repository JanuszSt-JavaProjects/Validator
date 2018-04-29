import javax.swing.*;

public class NameInputValidator {

        public static void main(String[] args) {

            String imie;
            String nazwisko;

            do{
                imie=JOptionPane.showInputDialog("wprowadź imię");
            } while( imie.isEmpty() || !spr(imie));

        do{
            nazwisko=JOptionPane.showInputDialog("wprowadź nazwisko");
        } while ( nazwisko.isEmpty() || !spr(nazwisko));


        System.out.println("Wprowadzone dane: "+ imie +"  "+nazwisko);

        }
        private static boolean spr(String imie){

            for (int i=0;i<imie.length();i++)
                if(!Character.isAlphabetic(imie.charAt(i))) return false;
            return true;

        }

    }
