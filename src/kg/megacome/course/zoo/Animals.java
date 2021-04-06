package kg.megacome.course.zoo;

import kg.megacome.course.enums.Gender;

import java.time.LocalDate;

public abstract class Animals {
    private String breedName;
    private String nickName;
    private int age;
    private int price;
    private boolean isAgressive;
    private boolean isObey;
    private boolean isVaccinated;
    private LocalDate dateOfBirth;
    private boolean hasBcertificate;


    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAgressive() {
        return isAgressive;
    }

    public void setAgressive(boolean agressive) {
        isAgressive = agressive;
    }

    public boolean isObey() {
        return isObey;
    }

    public void setObey(boolean obey) {
        isObey = obey;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isHasBcertificate() {
        return hasBcertificate;
    }

    public void setHasBcertificate(boolean hasBcertificate) {
        this.hasBcertificate = hasBcertificate;
    }

    public Animals(String breedName, String nickName, int age, int price, boolean isAgressive,
                   boolean isObey, boolean isVaccinated, LocalDate dateOfBirth, boolean hasBcertificate) {
        this.breedName = breedName;
        this.nickName = nickName;
        this.age = age;
        this.price = price;
        this.isAgressive = isAgressive;
        this.isObey = isObey;
        this.isVaccinated = isVaccinated;
        this.dateOfBirth = dateOfBirth;
        this.hasBcertificate = hasBcertificate;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "breedName='" + breedName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", isAgressive=" + isAgressive +
                ", isObey=" + isObey +
                ", isVaccinated=" + isVaccinated +
                ", dateOfBirth=" + dateOfBirth +
                ", hasBcertificate=" + hasBcertificate +
                '}';
    }
}
