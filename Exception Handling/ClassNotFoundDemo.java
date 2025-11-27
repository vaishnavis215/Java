

class ClassNotFoundDemo {

    public static void main(String[] args) {
        try {

            Class.forName("com.sam");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
