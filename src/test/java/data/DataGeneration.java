package data;
import com.github.javafaker.Faker;

public class DataGeneration {
    Faker faker = new Faker();
    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userMail = faker.internet().emailAddress(),
            userGender = faker.options().option("Male", "Female", "Other"),
            userPhone = faker.phoneNumber().subscriberNumber(10),
            calendarDay = String.format("%s",faker.number().numberBetween(1,28)),
            calendarMoth = faker.options().option("December","January","February",
                                                            "March","April","May","June",
                                                            "July", "August","September",
                                                            "October","November"),
            calendarYear = String.format("%s", faker.number().numberBetween(1980,2020)),
            userSubjects = faker.options().option("Maths","Chemistry","English",
                                                           "Computer Science"),
            userHobbies = faker.options().option("Sports", "Reading", "Music"),
            img = faker.options().option("cat.PNG", "dog.PNG", "fish.PNG"),
            userCurrentAddres = faker.address().country(),
            userState = faker.options().option("NCR", "Uttar Pradesh","Haryana", "Rajasthan"),
            userCity = getRandomCity(userState);

            public String getRandomCity(String value) {
                if (userState.equals( "NCR")) userCity = faker.options().option("Delhi","Gurgaon","Noida");
                if (userState.equals("Uttar Pradesh")) userCity = faker.options().option("Agra","Lucknow","Merrut");
                if (userState.equals("Haryana")) userCity = faker.options().option("Karnal","Panipat");
                if (userState.equals("Rajasthan")) userCity = faker.options().option("Jaipur","Jaiselmer");
                return userCity;
            }
}
