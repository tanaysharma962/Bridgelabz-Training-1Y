package strings;

class NullPointerDemo {
    public static void main(String[] args) {

        String text = null;

        try {
            System.out.println(text.length());  // Exception occurs
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }
}

