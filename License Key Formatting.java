class Solution {
    public String licenseKeyFormatting(String s, int k) {
        // Remove all dashes and convert the entire string to uppercase
        s = s.replace("-", "").toUpperCase();

        String result = "";
        
        // Starting from the end, append characters to result, adding dashes every k characters
        int counter = 0; // Track characters added since last dash
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (counter == k) { // When k characters have been added since the last dash
                result = "-" + result; // Prepend a dash to the result
                counter = 0; // Reset counter
            }
            result = c + result; // Prepend the current character to the result
            counter++; // Increment counter for each character added
        }

        return result;
    }
}