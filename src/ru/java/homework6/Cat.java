package homework6;


    public class Cat extends Animals {
        {
            maxAnimalsWay= 200;
            maxAnimalsHeigh= 2;
        }

        public Cat(String type, String name){
            this.type = type;
            this.name = name;
        }
        public String getType(){
            return type;
        }
        public String getName(){
            return name;
        }
        @Override
        public void run (int maxRun){
            boolean result=maxRun <= maxAnimalsWay;
            if (result)maxRun=maxRun;
            System.out.print(getType()+" "+getName()+" бежит "+ maxRun+" метров - ");
            showResult(result);
            System.out.println(getType()+" бежит максимум - "+maxAnimalsWay+" м.;");
        }
        @Override
        public void jump(double maxJump) {
            boolean result=maxJump <= maxAnimalsHeigh;
            if (result)maxJump = maxJump;
            System.out.print(getType()+" "+getName()+" прыгает "+ maxJump+" метра - ");
            showResult(result);
            System.out.println(getType()+" прыгает максимум на - "+maxAnimalsHeigh+" м.;");



        }
        @Override
        public  void swim(int maxSwim){
            System.out.println("Кошки не плавают");
        }
    }

