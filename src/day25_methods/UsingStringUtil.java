package day25_methods;

import my_utilities.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {
        System.out.println(StringUtil.fixFormat("jamES"));

        System.out.println(StringUtil.frequencyOfLetters("Apple", 'p'));

        System.out.println(StringUtil.reverse("LoopCamp"));

        System.out.println(StringUtil.duplicateCharacters("LoopCamp"));
    }

}
