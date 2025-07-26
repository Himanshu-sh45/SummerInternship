public class D3_StringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Himanshiu");
        System.out.println(str);
        str.append(" Bisht");
        System.out.println(str);
        str.insert(9,"Singh");
        System.out.println(str);
        str.replace(8,13," ");
        System.out.println(str);
        System.out.println(str.toString());
        str.delete(8,14);
        System.out.println(str);
        int capacity = str.capacity();
        System.out.println(capacity);
        str.reverse();
        System.out.println(str);
        System.out.println(str.lastIndexOf("i"));
        System.out.println(str.indexOf("H"));

        str.setCharAt(0,'J');
        System.out.println(str);

        StringBuilder str2 = new StringBuilder("Shahroz Ankit");
        str2.setLength(10);
        System.out.println(str2);

        StringBuilder str3 = new StringBuilder("helloBeautiful");
        str3.ensureCapacity(12);
        int capacity1 = str3.capacity();
        System.out.println(capacity1);
        System.out.println(str3);


    }
}