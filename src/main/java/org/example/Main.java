package org.example;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3,1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());


        System.out.println("*********************");


        Player player1 = new Player("Doğukan", 80, Weapon.SWORD);

        System.out.println("Başlangıç canı: " + player1.healthRemaining());

        player1.loseHealth(30);
        System.out.println("30 hasar sonrası: " + player1.healthRemaining());

        player1.restoreHealth(20);
        System.out.println("20 can sonrası: " + player1.healthRemaining());

        player1.restoreHealth(100);
        System.out.println("Fazla can sonrası: " + player1.healthRemaining());

        player1.loseHealth(120);
        System.out.println("120 hasar sonrası: " + player1.healthRemaining());

        System.out.println("Sword damage: " + Weapon.SWORD.getDamage());
        System.out.println("Sword attack speed: " + Weapon.SWORD.getAttackSpeed());

        Player player2 = new Player("Ahmet", 150, Weapon.SWORD);
        Player player3 = new Player("Mehmet", -20, Weapon.SWORD);


        System.out.println(player2.healthRemaining());
        System.out.println(player3.healthRemaining());
    }
}