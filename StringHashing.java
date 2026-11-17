class StringHashing {
    public static void main(String[] args) {
        String Input = "abcdefghijklmnopqrstuvwxyz"; // inputted innthe question
        int StringHash[] = new int[26]; // hash array for the particular no's;

        for (int i = 0; i < Input.length(); i++) {
            StringHash[Input.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < StringHash.length; i++) {
            System.out.println(StringHash[i]);
        }
    }
}
