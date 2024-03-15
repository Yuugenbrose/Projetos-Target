public class RevertString {
    public static void main(String[] args) {
        String originalString = "Project";
        String reversedString = reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Inverted String: " + reversedString);
    }

    public static String reverseString(String str) {
        char[] characters = str.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        return new String(characters);
    }
}
