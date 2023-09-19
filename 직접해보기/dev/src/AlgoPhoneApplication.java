public class AlgoPhoneApplication {
    public static void main(String[] args) {
        String number1 = "01011112222";
        String number2 = "0101112222";
        System.out.println("result1 = " + getPhoneNumber1(number1));;
        System.out.println("result2 = " + getPhoneNumber1(number2));;
        System.out.println("result3 = " + getPhoneNumber2(number1));;
        System.out.println("result4 = " + getPhoneNumber2(number2));;
    }

    public static String getPhoneNumber1(String number) {
        int middle = number.length() - 4;
        StringBuilder builder = new StringBuilder();
        builder.append(number.substring(0, 3));
        builder.append("-");
        builder.append(number.substring(3, middle));
        builder.append("-");
        builder.append(number.substring(middle));
        return builder.toString();
    }

    public static String getPhoneNumber2(String number) {
        int middle = number.length() - 4;
        StringBuilder builder = new StringBuilder();
        builder.append("+82-");
        builder.append(number.substring(0, 3));
        builder.append("-");
        builder.append(number.substring(3, middle));
        builder.append("-");
        builder.append(number.substring(middle));
        return builder.toString();
    }
}