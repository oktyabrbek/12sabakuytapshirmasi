package com.company;

public class popugay {
    String name;
    int age;
    String habitablePlaces;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
        System.out.println("JAshi ter san bolboshu kerek");
    }else {
            this.age = age;
        }
    }

    public String getHabitablePlaces() {
        return habitablePlaces;
    }

    public void setHabitablePlaces(String habitablePlaces) {
        this.habitablePlaces = habitablePlaces;
    }
    void methodPopugay (String name, int age, String habitablePlaces){
        System.out.println("Bul janibarlardin maalimattari: " +"Ati: "+ " "+name+" "+" Jashi: "+ " "+ age+" "+"Jashagan jeri:"+" "+habitablePlaces);
    }
}
