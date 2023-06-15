package Strings;

public class _02_reverse {
    public static void main(String[] args){
        String name = "Ansari Umer";
        String name2 = "Umer Ansari";

        rever(name);
        revers(name2);
    }

    static void rever(String name){
        for(int i = name.length() - 1; i >= 0; i--){
            System.out.print(name.charAt(i));
        }
    }

    static void revers(String name){
        int size = name.length();

        System.out.println();
        for(int i = 0; i < size; i++){
            System.out.print(name.charAt(size - i - 1));
        }
    }
}