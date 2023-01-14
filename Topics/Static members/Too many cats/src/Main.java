class Cat {

    // write static and instance variables
    public String name;
    public int age;
    public static int catCounter;

    public Cat(String name, int age) {

        // implement the constructor
        name = this.name;
        age = this.age;
        // do not forget to check the number of cats
        catCounter++;
        if (catCounter >5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        int numberOfCats = Cat.catCounter;
        return numberOfCats;
    }
}