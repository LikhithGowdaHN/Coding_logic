class Solution {
    public int romanToInt(String s) {
        int value = 0;
        int prev = 0;
        int result = 0;

        for (int i = s.length()-1; i>=0; i--) {
            char ch = s.charAt(i);

            switch (ch) {
                case 'I': value = 1; break;
                case 'V': value = 5; break;
                case 'X': value = 10; break;
                case 'L': value = 50; break;
                case 'C': value = 100; break;
                case 'D': value = 500; break;
                case 'M': value = 1000; break;
                default: return 0; // Error case
            }

            if (value < prev) {
                result -= value;
            } else {
                result += value;
            }

            prev = value;
        }

        return result;
    }
}