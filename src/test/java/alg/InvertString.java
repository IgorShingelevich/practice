package alg;

public class InvertString {

    public String invertWithStringBuffer(String str) {
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        return buffer.toString();
    }
    public String invertWithoutStringBuffer(String str) {
        int length = str.length();
        String original = str;
        String invert = "";
        for (int i = length - 1; i >= 0; i--) {
            invert = invert + original.charAt(i);
        }
        return invert;
    }
    public static void main(String[] args) {
        InvertString invertStr = new InvertString();
        System.out.println("Инвертированная строка с BufferString: "
                + invertStr.invertWithStringBuffer("987654321"));
        System.out.println("");
        System.out.println("Инвертированная строка без BufferString: "
                + invertStr.invertWithoutStringBuffer("kjihgfedcba"));
    }
}
