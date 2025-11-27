/*
Stringbuffer:
-slower than stringbuider


stringbuider:
-faster than stringbuffer

 */
class StringDifference {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer("java");

        for (int i = 0; i < 1000; i++) {
            sb.append("is easy");

        }
        System.out.println("time taken by Stringbuffer:" + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        StringBuilder sb1 = new StringBuilder("java");

        for (int i = 0; i < 1000; i++) {
            sb1.append("is easy");
        }
        System.out.println("time taken by Stringbuilder:" + (System.currentTimeMillis() - startTime));

    }

}
