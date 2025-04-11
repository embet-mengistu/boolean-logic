public class Main {


    public static void ageCheck(int age) {
        if (age > 18) {
            System.out.println("IS ADULT");
        } else {
            System.out.println("IS NOT ADULT.");
        }

    }

    public static void main(String[] args) {
        ageCheck(21);
        ageCheck(12);
        System.out.println(25 == 21); //exactly equal
        System.out.println(25 != 21); // not equal
        System.out.println(25 > 21); // greater than
        System.out.println(25 < 21); // less than
        System.out.println(25 >= 21); // grater than or equal to
        System.out.println(25 <= 21); // less than or equal

        boolean isDiabetic = true;
        boolean likesCake = true;

        if (likesCake && !isDiabetic) {
            System.out.println("eats cake");
        } else {
            System.out.println("Doenst eat cake");
        }

        boolean isCat = true;
        boolean isDog = false;
        boolean isFriendly = false;

        if ((isCat || isDog) && isFriendly) {
            System.out.println("Pet it.");
        } else {
            System.out.println("DON'T! pet it.");
        }


    }


}