package inheritanceFreestyle;

public class EnemyTester {
    public static void main(String[] args) {
        Enemy enemy = new Enemy("Basic Enemy", "Land", "Medium");
        System.out.println(enemy.getName());
        System.out.println(enemy.getType());
        System.out.println(enemy.getSize());
        enemy.move(25);
        enemy.attack();

        Tortoise largeTortoise = new Tortoise("Large Tortoise", "Land", "Big", 500);
        System.out.println(largeTortoise.getName());
        System.out.println(largeTortoise.getType());
        System.out.println(largeTortoise.getSize());
        System.out.println(largeTortoise.getDefense());
        largeTortoise.move(10);
        largeTortoise.block();
        largeTortoise.charge();

        Bird phoenix = new Bird("Phoenix", "Air", "Medium", 4);
        System.out.println(phoenix.getName());
        System.out.println(phoenix.getType());
        System.out.println(phoenix.getSize());
        System.out.println(phoenix.getWings());
        phoenix.move(250);
        phoenix.fly();
        phoenix.land();
    }
}
