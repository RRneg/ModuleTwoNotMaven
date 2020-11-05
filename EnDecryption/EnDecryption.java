package ua.com.ModuleTwo.EnDecryption;

public class EnDecryption {


    public static String encryption(String password) {
        char[] result = password.toCharArray();
        int sizeOfresult = result.length;
        int[] crypt = new int[sizeOfresult];
        for (int i = 0; i < sizeOfresult; i++) {
            crypt[i] = getCharCode(result[i]) + 5;
            result[i] = getCodeChar(crypt[i]);
        }
        String pass = String.copyValueOf(result);
        return pass;
    }

    public static String decryption(String password) {
        char[] result = password.toCharArray();
        int sizeOfresult = result.length;
        int[] crypt = new int[sizeOfresult];
        for (int i = 0; i < sizeOfresult; i++) {
            crypt[i] = getCharCode(result[i]) - 5;
            result[i] = getCodeChar(crypt[i]);
        }
        String pass = String.copyValueOf(result);
        return pass;
    }

    public static int getCharCode(char ch) {
        return (int) ch;
    }

    public static char getCodeChar(int ch) {
        return (char) ch;
    }

}
