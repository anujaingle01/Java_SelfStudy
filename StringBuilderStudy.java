public class StringBuilderStudy {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Anuja");
        System.out.println(sb);

        System.out.println(sb.charAt(1));

        sb.setCharAt(0, 'T');
        System.out.println(sb);

        sb.insert(1, 'a');
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);

        sb.append(" ");
        sb.append("I");
        sb.append("n");
        sb.append("g");
        sb.append("l");
        sb.append("e");

        sb.setCharAt(0, 'A');
        System.out.println(sb);

        StringBuilder a = new StringBuilder("Hello");                   // Reverse String
        System.out.println();
        System.out.println("String = "+a);

        for (int i = 0; i <= a.length() / 2; i++) {
            int F = i;
            int B = a.length() - 1 - i;

            char Front = a.charAt(F);
            char Back = a.charAt(B);

            a.setCharAt(F, Back);
            a.setCharAt(B, Front);
            }

            System.out.println("Reverse String = "+a);

    }
}