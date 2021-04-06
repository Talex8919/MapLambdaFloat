package kg.megacome.course;


import kg.megacome.course.enums.EnumsType;

import kg.megacome.course.enums.Gender;
import kg.megacome.course.zoo.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	LocalDate allisterB= LocalDate.of(2020, Month.FEBRUARY,15);
        LocalDate variusB= LocalDate.of(2019, Month.MAY,16);
        LocalDate boskoB= LocalDate.of(2019, Month.OCTOBER,14);
        LocalDate hecktorB= LocalDate.of(2020, Month.FEBRUARY,28);
        LocalDate miloB= LocalDate.of(2015, Month.MARCH,13);
        LocalDate archieBs= LocalDate.of(2019, Month.MARCH,20);
        LocalDate ollieBs= LocalDate.of(2019, Month.OCTOBER,20);
        LocalDate tobyB= LocalDate.of(2019, Month.OCTOBER,25);
        LocalDate growslB = LocalDate.of(2019, Month.FEBRUARY,20);
LocalDate jackB=LocalDate.of(2019, Month.DECEMBER,19);
        LocalDate juniorB = LocalDate.of(2015, Month.MARCH,11);
        LocalDate browlsB= LocalDate.of(2019, Month.MARCH,24);
        Cats allister = new Cats("Cornish Rex Cat","Allister",1,25000,false,
                    true,true,allisterB,true,EnumsType.EXOTIC, Gender.FEMALE);
            Cats varius= new Cats("European Burmese", "Varius",2,15000,
                    false,true, true,variusB,true,EnumsType.EXOTIC,Gender.MALE );
        Cats bosko= new Cats("Havana Brown ", "bosko",1,25000,
                false,true, true,boskoB,true,EnumsType.EXOTIC,Gender.FEMALE );
        Cats hecktor= new Cats("Japanese Bobtail ", "Hecktor",5,10000,
                true,true, false,hecktorB,true,EnumsType.NONE_EXOTIC,Gender.MALE );
        Dogs milo= new Dogs("Basset Hound ", "Milo",6,2000,
                false,true, false,miloB,true,EnumsType.EXOTIC, Gender.FEMALE );
        Dogs archie= new Dogs("Boston Terrier", "Archie",1,7500,
                false,true, true,archieBs,true,EnumsType.EXOTIC,Gender.MALE);
        Dogs ollie= new Dogs("Alaskan Malamute", "Ollie",1,15000,
                false,false, true,ollieBs,true,EnumsType.NONE_EXOTIC,Gender.MALE );
        Dogs toby= new Dogs("Malinois", "Toby",2,10000,
        false,true, true,tobyB,true,EnumsType.EXOTIC,Gender.FEMALE );
        Dogs moby= new Dogs("Malinois", "moby",1,12000,
                false,true, true,tobyB,false,EnumsType.NONE_EXOTIC,Gender.MALE );
        Parrot growsley= new Parrot("Blue Crowned Parakeet", "growsley",1,10500,
                false,true, true,growslB,false,EnumsType.NONE_EXOTIC ,Gender.MALE);
        Parrot jack= new Parrot("Australian King Parrot", "Jack",6,2000,
                false,true, false,jackB,true,EnumsType.NONE_EXOTIC,Gender.FEMALE );
        Parrot junior= new Parrot("Blue Naped Parrot", "Junior",5,1500,
                true,false, true,juniorB,false, EnumsType.ABANDON ,Gender.MALE);
        Parrot browls= new Parrot("Blue Crowned Racquet Tail", "Browls",1,35000,
                false,false, true,browlsB,true,EnumsType.NONE_EXOTIC,Gender.FEMALE );
        Snakes bella= new Snakes("Smooth Green Snake  ", "Bella",6,15400,
                false,true, false,miloB,true,EnumsType.EXOTIC,Gender.MALE );
        Snakes molly= new Snakes("Ringneck Snake", "molly",1,23500,
                false,true, true,archieBs,true,EnumsType.EXOTIC,Gender.MALE );
        Snakes coco= new Snakes("Rainbow Boa", "coco",1,32562,
                false,false, true,ollieBs,true,EnumsType.EXOTIC,Gender.FEMALE );
        Snakes frankie= new Snakes("Dekay's Brown Snake", "frankie",1,25458,
                false,true, true,tobyB,true,EnumsType.EXOTIC,Gender.FEMALE );
        Spiders luna= new Spiders("Tarantulas  ", "Luna",6,20520,
                false,true, false,miloB,true,EnumsType.EXOTIC,Gender.FEMALE,List.of("2 mices", "three insects") );
        Spiders bolls= new Spiders("Jumping Spiders", "bolls",1,25400,
                false,true, true,archieBs,false,EnumsType.EXOTIC,Gender.MALE , List);
        Spiders jaja= new Spiders("Fishing Spiders", "jaja",1,32332,
                false,false, true,ollieBs,false,EnumsType.EXOTIC,Gender.FEMALE ,List.of("2 mices", "three insects"));
        Spiders gigs= new Spiders("Grass Spiders", "gigs",1,25456,
                false,true, true,tobyB,false,EnumsType.EXOTIC,Gender.FEMALE ,List.of("2 mices", "three insects");


        ArrayList<Cats>catsArrayList = new ArrayList<>();
        catsArrayList.add(allister);
        catsArrayList.add(varius);
        catsArrayList.add(bosko);
        catsArrayList.add(hecktor);
        System.out.println("Lambda and Filter = price 15000");
        List<Cats> catsList=catsArrayList.stream()
                .filter(m-> m.getPrice()>15000)
                .collect(Collectors.toList());
        System.out.println(catsList);
        System.out.println("count of  positions which costs more than 15000");
        System.out.println(catsList.stream()
                .filter(m-> m.getPrice()>15000)
        .count());
        System.out.println();
        System.out.println("count posotions of words that start  from  word  h ");
        long count =catsArrayList
                .stream()
                .filter(m->m.getBreedName().
                        toLowerCase()
                        .startsWith("h"))
                .distinct()
                .count();
        System.out.println(count);

   ArrayList<Dogs>dogsArrayList= new ArrayList<>();
        dogsArrayList.add(milo);
   dogsArrayList.add(archie);
   dogsArrayList.add(ollie);
   dogsArrayList.add(toby);
   dogsArrayList.add(moby);

       ///dogsArrayList.stream()
//                .filter(dogs-> dogs.getPrice()>7000 && dogs.getDogG()== Gender.MALE)
  ///              .collect(Collectors.toCollection());System.out.println( dogsArrayList);

        ArrayList<Parrot> parrotArrayList= new ArrayList<>();
        parrotArrayList.add(growsley);
        parrotArrayList.add(jack);
        parrotArrayList.add(junior);
        parrotArrayList.add(browls);
        System.out.println( "Using Map Multiple the price  in 3  per  parrot");
        List<Integer> parrotArrayList1= parrotArrayList.stream()
                .map (s-> s.getPrice() *3)
                .collect(Collectors.toList());
        System.out.println( parrotArrayList1);

Bonuses silver= new Bonuses("Pet Snacks", 2);
        Bonuses gold= new Bonuses("Pet Snacks", 10);
        Bonuses platinum= new Bonuses("Pet Snacks", 20);

        ArrayList<Snakes>snakesArrayList= new ArrayList<>();
        snakesArrayList.add(bella);
                snakesArrayList.add(molly);
        snakesArrayList.add(coco);
                snakesArrayList.add(frankie);
        System.out.println("making  complex map with  If");

        List<Bonuses> bonusesList= snakesArrayList.stream()
                .map(snakes-> { if (snakes.getPrice()<=16000){
                    return silver;}
                else if (snakes.getPrice()<=26000){
                    return gold;}
                else {
                    return platinum;
                        }

                }
                ).collect(Collectors.toList());
        System.out.println(bonusesList);
                }


    }



