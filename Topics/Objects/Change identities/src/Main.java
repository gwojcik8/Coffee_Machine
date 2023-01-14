class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // write your code here
        Person p11 = new Person();
        Person p22 = new Person();

        p11.name = p1.name;
        p11.age = p1.age;

        p22.name = p2.name;
        p22.age = p2.age;

        p1.name = p22.name;
        p1.age = p22.age;

        p2.name = p11.name;
        p2.age = p11.age;
    }
}