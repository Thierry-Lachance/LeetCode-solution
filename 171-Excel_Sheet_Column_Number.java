import java.lang.Math;

class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int value = valueOfLetter(columnTitle.charAt(i));
            System.out.println((columnTitle.length() - (i + 1)));
            if ((columnTitle.length() - (i + 1)) > 0) {
                ans = ans + (int) ((value * Math.pow(26, ((columnTitle.length() - 1) - i))));
            } else if ((columnTitle.length() - (i + 1)) == 0) {
                ans = ans + value;
            }
        }
        return ans;
    }

    int valueOfLetter(char letter) {
        switch (letter) {
            case 'A':
                return 1;
            case 'B':
                return 2;
            case 'C':
                return 3;
            case 'D':
                return 4;
            case 'E':
                return 5;
            case 'F':
                return 6;
            case 'G':
                return 7;
            case 'H':
                return 8;
            case 'I':
                return 9;
            case 'J':
                return 10;
            case 'K':
                return 11;
            case 'L':
                return 12;
            case 'M':
                return 13;
            case 'N':
                return 14;
            case 'O':
                return 15;
            case 'P':
                return 16;
            case 'Q':
                return 17;
            case 'R':
                return 18;
            case 'S':
                return 19;
            case 'T':
                return 20;
            case 'U':
                return 21;
            case 'V':
                return 22;
            case 'W':
                return 23;
            case 'X':
                return 24;
            case 'Y':
                return 25;
            case 'Z':
                return 26;
        }
        return 0;
    }
}
