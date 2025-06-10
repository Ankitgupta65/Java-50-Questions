public class count_characters_in_string {
    public static void main(String[] args) {
        String input = ("Aa kiu, I swd skieo 236587.GH kiu:sieo?? 25.33");
        int letters = 0, spaces = 0, numbers = 0, others = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else if (Character.isSpaceChar(ch)) {
                spaces++;
            } else {
                others++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Other characters: " + others);
    }
}