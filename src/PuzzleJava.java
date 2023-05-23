import java.util.ArrayList;
import java.util.Random;
public class PuzzleJava {
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> rollList = new ArrayList<Integer>();
        Random randomRolls = new Random();


         for( int i = 1 ; i <=10; i++){
            rollList.add(randomRolls.nextInt(20));
        }
        return(rollList);

    }

    public String getRandomLetter(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random randomIndex = new Random();
        char results = alphabet.charAt(randomIndex.nextInt(25));
        return String.valueOf(results);
    }

    public String generatePassword(){
        String generatedPassword = "";

        for (int i = 0; i<8; i++){
            generatedPassword+=getRandomLetter();
        }
        return generatedPassword;

    }

    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwords = new ArrayList<String>();
        for (int i = 0; i<length;i++){
            passwords.add(generatePassword());
        }
        return passwords;
    }
}
