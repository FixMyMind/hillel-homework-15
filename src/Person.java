public class Person {
    public String personInfo(String name, String surname, String city, long phoneNumber) {
        String formattedString = String.format("Зателефонувати громадянину %s %s із міста %s можна за номером %d", name,
                surname, city, phoneNumber);
//        System.out.println(formattedString); // Вивід у консоль додано для тестування
        return formattedString;
    }

    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.personInfo("Will", "Smith", "New York", 2936729462846L);

        Person personTwo = new Person();
        personTwo.personInfo("Jackie", "Chan", "Shanghai", 12312412412L);

        Person personThree = new Person();
        personThree.personInfo("Sherlock", "Holmes", "London", 37742123513L);
    }
}
