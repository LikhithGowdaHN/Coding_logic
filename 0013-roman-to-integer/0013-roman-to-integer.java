class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = 0;

            switch (c) {
                case 'I': value = 1; break;
                case 'V': value = 5; break;
                case 'X': value = 10; break;
                case 'L': value = 50; break;
                case 'C': value = 100; break;
                case 'D': value = 500; break;
                case 'M': value = 1000; break;
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

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.romanToInt("III"));     
        System.out.println(sol.romanToInt("LVIII"));    
        System.out.println(sol.romanToInt("MCMXCIV"));  
    }
}