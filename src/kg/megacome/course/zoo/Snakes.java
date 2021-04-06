package kg.megacome.course.zoo;

import kg.megacome.course.enums.EnumsType;
import kg.megacome.course.enums.Gender;

import java.time.LocalDate;

public class Snakes  extends Animals{
    private EnumsType snakeT;
private Gender snakeG;

    public Gender getSnakeG() {
        return snakeG;
    }

    public void setSnakeG(Gender snakeG) {
        this.snakeG = snakeG;
    }

    public EnumsType getSnakeT() {
        return snakeT;
    }

    public void setSnakeT(EnumsType snakeT) {
        this.snakeT = snakeT;
    }


    public Snakes(String breedName, String nickName, int age, int price, boolean isAgressive, boolean isObey, boolean isVaccinated, LocalDate dateOfBirth, boolean hasBcertificate, EnumsType snakeT, Gender snakeG) {
        super(breedName, nickName, age, price, isAgressive, isObey, isVaccinated, dateOfBirth, hasBcertificate);
        this.snakeT = snakeT;
        this.snakeG = snakeG;
    }
}
