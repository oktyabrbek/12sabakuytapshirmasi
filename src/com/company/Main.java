package com.company;

public class Main {

    public static void main(String[] args) {
	mishik mishik =new mishik();
    mishik.setName("Tom");
    mishik.setAge(15);
    mishik.setHabitablePlaces("Home");
    it it = new it();
    it.setName("Barsuk");
    it.setAge(6);
    it.setHabitablePlaces("Home");
    balik balik=new balik();
    balik.setName("Martin");
    balik.setAge(9);
    balik.setHabitablePlaces("water");
    popugay popugay =new popugay();
    popugay.setName("Nero");
    popugay.setAge(12);
    popugay.setHabitablePlaces("forest");
mishik.methodMishik(mishik.getName(), mishik.age, mishik.habitablePlaces);
it.methodIt(it.getName(), it.age, it.habitablePlaces);
balik.methodBalik(balik.getName(), balik.age, balik.habitablePlaces);
popugay.methodPopugay(popugay.getName(), popugay.age, popugay.habitablePlaces);





    }
}
