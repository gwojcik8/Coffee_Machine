class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me

        if (this.hours == 12 && this.minutes == 59) {
            hours = 1;
            minutes = 0;
        }
        else if (this.minutes == 59) {
            minutes = 0;
            hours = hours + 1;
        }
        else {
            minutes = minutes + 1;
        }

    }
}