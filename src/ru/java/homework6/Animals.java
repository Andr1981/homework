package homework6;

public abstract class Animals {

        protected String name;
        protected String type;
        private int maxRun;
        private double maxJump;
        protected int maxSwim;




        protected Animals() {
        }

        protected abstract void run(int maxRun);
        protected abstract void jump(double maxJump);
        protected abstract void swim(int maxSwim);



            void showResult(boolean result) {
            System.out.println(result);
        }


}
