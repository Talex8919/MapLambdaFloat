package kg.megacome.course.zoo;

import kg.megacome.course.enums.EnumsType;
import kg.megacome.course.enums.Gender;

import java.time.LocalDate;

public class Dogs extends Animals{

    private EnumsType dogsT;
private Gender dogG;

    public Gender getDogG() {
        return dogG;
    }

    public void setDogG(Gender dogG) {
        this.dogG = dogG;
    }

    public EnumsType getDogsT() {
        return dogsT;
    }

    public void setDogsT(EnumsType dogsT) {
        this.dogsT = dogsT;
    }

    public Dogs(String breedName, String nickName, int age, int price, boolean isAgressive, boolean isObey, boolean isVaccinated, LocalDate dateOfBirth, boolean hasBcertificate, EnumsType dogsT, Gender dogG) {
        super(breedName, nickName, age, price, isAgressive, isObey, isVaccinated, dateOfBirth, hasBcertificate);
        this.dogsT = dogsT;
        this.dogG = dogG;
    }
}
