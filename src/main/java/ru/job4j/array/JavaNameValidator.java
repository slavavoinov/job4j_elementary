package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (((name.codePointAt(i) >= 48 && name.codePointAt(i) <= 57)
                    || name.codePointAt(i) == 36 || name.codePointAt(i) == 95 || (name.codePointAt(i) >= 97 && name.codePointAt(i) <= 122))
                    && (name.codePointAt(0) >= 97 && name.codePointAt(0) <= 122)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
        }

        public static boolean isUpperLatinLetter(int code) {
            return code >= 65 && code <= 90;
        }

        public static boolean isLowerLatinLetter(int code) {
            return code >= 97 && code <= 122;
        }
    }
