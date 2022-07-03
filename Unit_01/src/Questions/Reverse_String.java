package Questions;

class Reverse_String {
    public static void main(String[] arg) {
        String s1 = "JAVA";
        char res[] = s1.toCharArray();
        for (int i = res.length - 1; i >= 0; i--)
            System.out.print(res[i]);
    }
}