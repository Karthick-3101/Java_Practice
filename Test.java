public class SwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 4;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            default:
                dayName = "Weekend";
                break;
        }

        System.out.println("Today is " + dayName);
    }
}


/* This code defines a SwitchExample class with a main method that declares an int variable dayOfWeek with a value of 4 and a String variable dayName. The switch statement compares the value of dayOfWeek to different case values and assigns the appropriate day name to the dayName variable. Finally, the program prints out the value of dayName, which in this case is "Thursday". */