public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here
        int numberOfEnums = Secret.values().length;
        Secret[]  valuesOfSecretsInArray = Secret.values();

        for (int i = 0; i < numberOfEnums; i++) {
            String v = String.valueOf(valuesOfSecretsInArray[i]);
            String vv = v.substring(0,4);
            if (vv.equals("STAR")) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
/*
 sample enum for inspiration
enum Secret {
    STAR, CRASH, START, // ...
}
*/