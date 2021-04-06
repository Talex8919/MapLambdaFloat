package kg.megacome.course.zoo;

import kg.megacome.course.enums.EnumsType;
import kg.megacome.course.enums.Gender;

import java.time.LocalDate;

public class Cats extends Animals {
    private EnumsType catsT;
private Gender catG;

    public Gender getCatG() {
        return catG;
    }

    public void setCatG(Gender catG) {
        this.catG = catG;
    }

    public EnumsType getCatsT() {
        return catsT;
    }

    public void setCatsT(EnumsType catsT) {
        this.catsT = catsT;
    }


    public Cats(String breedName, String nickName, int age, int price, boolean isAgressive, boolean isObey,
                boolean isVaccinated, LocalDate dateOfBirth, boolean hasBcertificate, EnumsType catsT, Gender catG) {
        super(breedName, nickName, age, price, isAgressive, isObey, isVaccinated, dateOfBirth, hasBcertificate);
        this.catsT = catsT;
        this.catG = catG;
    }
}

