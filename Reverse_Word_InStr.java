public class Reverse_Word_InStr {
    public static void main(String[] args) {
        String line = "welcome to java";
        String[] words = line.split(" ");
        for (int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i]+" ");
        }

    }
}
