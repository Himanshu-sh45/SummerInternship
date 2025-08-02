/* Steps to make any function lambda function:
1- Remove modifier
2- Remove Return type
3- Remove method name
4- Place arrow
 */

interface Employee {
    String getName();
}

//class SoftwareDeveloper implements Employee {
//    public String getName() {
//        return "Software Developer";
//    }
//}

public class D22_FunctionalInterface {
    public static void main(String[] args) {

//        Employee obj1 = new SoftwareDeveloper();
        Employee se = () -> "Software Developer";
        System.out.println(se.getName());

        Employee editor = () -> "Editor";
        System.out.println(editor.getName());

        Employee WebDeveloper = () -> "Web Developer";
        System.out.println(WebDeveloper.getName());

    }
}