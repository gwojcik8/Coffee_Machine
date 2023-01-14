class Util {
    // correct this method to avoid NPE
    public static void printLength(String name) {

        if (null != name) {
        System.out.println(name.length());
        }
    }
}