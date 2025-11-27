
class StringBufferMethods {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(10);

        sb.append("Hello,vaishnavi suryawanshi");
        System.out.println("length Method:" + sb.length());// 27
        System.out.println("Character At Specific index:" + sb.charAt(6));//v
        sb.setCharAt(3, 'A');
        System.out.println("Set a character at specific index:" + sb);//HelAo,vaishnavi suryawanshi
        System.out.println("Delete char at specific index:" + sb.deleteCharAt(2));//HeAo,vaishnavi suryawanshi
        System.out.println("Index of a :" + sb.indexOf("a"));//6
        System.out.println("Is empty method:" + sb.isEmpty());//false
        System.out.println("Hashcode method:" + sb.hashCode());//2060468723
        System.out.println("Substring method:" + sb.substring(4, 8));//,vai
        System.out.println("String class:" + sb.getClass());//class java.lang.StringBuffer
        System.out.println("Reverse method:" + sb.reverse());//ihsnawayrus ivanhsiav,olleH

    }
}
