package Strings;

import static java.lang.Character.*;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        String string3 = string2.concat(string1);
        return string3;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++){
            result.append(" ");
        }
        return result.toString();
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        char chars[] = string.toCharArray();

        for (int i = 0; i < chars.length; i++){
            char a = chars[i];
            if (Character.isUpperCase(a)){
                chars[i] = toLowerCase(a);

            }else if(Character.isLowerCase(a)){
                chars[i] = toUpperCase(a);
            }
        }


        return new String(chars);
    }

    public String oneAtATime(String string1, String string2) {

        int longer = Math.max(string1.length(), string2.length());
        String result = "";

        for (int i = 0; i < longer; i++) {
            if(i < string1.length()){
                result += string1.charAt(i);
            }
            if(i < string2.length()){
                result += string2.charAt(i);
            }
        }
        return result;
    }

}

