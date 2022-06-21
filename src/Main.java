public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(150);
        boss.setProtect("магический");
        System.out.println("Boss " + boss.getHealth() + " " + boss.getDamage() + " " + boss.getProtect());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("hero" + i);
            System.out.println(createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getSuperPower());

        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(200, 250, ",mechom");
        Hero hero2 = new Hero(150, 350);
        Hero hero3 = new Hero(400, 550, ",nozh");
        Hero[] myArray = {hero1, hero2, hero3};
        return myArray;
    }
}