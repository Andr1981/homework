package homework6;

public class AnimalsMain {
    public static void main(String[] args){
        Animals cat = new Cat("Кот", "Мурзик");
        Animals dog1 = new Dog("Собака","Шарик");
        Animals dog2 = new Dog("Собака","Бобик");
        Animals dog3 = new Dog("Собака","Дворик");
        int changeRun = Math.random()>0.5 ? 400 : 600;

        cat.run(100);
        dog1.run(700);

        cat.jump(2);
        dog1.jump(0.5);

        dog1.swim(20);
        cat.swim(10);

        if(changeRun==400){
            System.out.println(dog2.type+ " "+dog2.name +" бежит "+changeRun+ " м.");
        }else {
            System.out.println(dog3.type+ " "+dog3.name +" бежит "+changeRun+ " м.");
        }




    }
}
