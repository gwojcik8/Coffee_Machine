class Army {

    public static void createArmy() {
        // Create all objects here
        Unit Unit1 = new Unit("Unit1");
        Unit Unit2 = new Unit("Unit2");
        Unit Unit3 = new Unit("Unit3");
        Unit Unit4 = new Unit("Unit4");
        Unit Unit5 = new Unit("Unit5");

        Knight Knight1 = new Knight("Knight1");
        Knight Knight2 = new Knight("Knight2");
        Knight Knight3 = new Knight("Knight3");

        General General = new General("General");

        Doctor Doctor = new Doctor("Doctor");
    }



    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}