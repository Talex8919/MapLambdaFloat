package kg.megacome.course.zoo;

import kg.megacome.course.enums.EnumsType;
import kg.megacome.course.enums.Gender;

import java.time.LocalDate;
import java.util.List;

public class Spiders  extends  Animals {
    private EnumsType spidersT;
    private Gender spiderG;
    private List<String> diatery;



    public EnumsType getSpidersT() {
        return spidersT;
    }

    public void setSpidersT(EnumsType spidersT) {
        this.spidersT = spidersT;
    }

    public Gender getSpiderG() {
        return spiderG;
    }

    public void setSpiderG(Gender spiderG) {
        this.spiderG = spiderG;
    }

    public List<String> getDiatery() {
        return diatery;
    }

    public void setDiatery(List<String> diatery) {
        this.diatery = diatery;
    }

    public Spiders(String breedName, String nickName, int age, int price, boolean isAgressive, boolean isObey,
                   boolean isVaccinated, LocalDate dateOfBirth, boolean hasBcertificate, EnumsType spidersT,
                   Gender spiderG, List<String> diatery) {
        super(breedName, nickName, age, price, isAgressive, isObey, isVaccinated, dateOfBirth, hasBcertificate);
        this.spidersT = spidersT;
        this.spiderG = spiderG;
        this.diatery = diatery;
    }


}
