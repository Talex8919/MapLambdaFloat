package kg.megacome.course.zoo;

import kg.megacome.course.enums.EnumsType;
import kg.megacome.course.enums.Gender;

import java.time.LocalDate;

public class Parrot  extends Animals {

    private EnumsType ParrotsT;
    private Gender parrotG;

    public Gender getParrotG() {
        return parrotG;
    }

    public void setParrotG(Gender parrotG) {
        this.parrotG = parrotG;
    }

    public EnumsType getParrotsT() {
        return ParrotsT;
    }

    public void setParrotsT(EnumsType parrotsT) {
        ParrotsT = parrotsT;
    }

    public Parrot(String breedName, String nickName, int age, int price, boolean isAgressive, boolean isObey, boolean isVaccinated, LocalDate dateOfBirth, boolean hasBcertificate, EnumsType parrotsT, Gender parrotG) {
        super(breedName, nickName, age, price, isAgressive, isObey, isVaccinated, dateOfBirth, hasBcertificate);
        ParrotsT = parrotsT;
        this.parrotG = parrotG;
    }
}
