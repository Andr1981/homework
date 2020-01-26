package homework6;

public abstract class Animals {

        protected String name;
        protected String type;
        protected int maxAnimalsWay;
        protected double maxAnimalsHeigh;
        protected int maxAnimalsSwimWay;




        protected Animals() {
        }

        protected abstract void run(int maxRun);
        protected abstract void jump(double maxJump);
        protected abstract void swim(int maxSwim);



            void showResult(boolean result) {

                    System.out.println(result);
        }


}
