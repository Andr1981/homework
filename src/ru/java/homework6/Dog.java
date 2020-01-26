package homework6;

public class Dog extends Animals {
    final int maxRun1 = 500;
    final double maxJump1 = 0.5;
    final int maxSwim1 = 10;


    public Dog(String type, String name){
        this.type  =type;
        this.name = name;

    }

    public String getType(){
        return type;
    }
    public  String getName(){
        return  name;
    }



    @Override
    public void run(int maxRun) {
       boolean result = maxRun <= 500;
       if(result)maxRun=maxRun;
        System.out.print(getType()+" "+getName()+" бежит "+ maxRun+" метров - ");
       showResult(result);
        System.out.println(getType()+" бежит максимум - "+maxRun1+" м.;");

    }
    @Override
    public void jump(double maxJump){
    boolean result=maxJump <=0.5;
        if(result)maxJump=maxJump;
        System.out.print(getType()+" "+getName()+" прыгает "+ maxJump+ " метра - ");
        showResult(result);
        System.out.println(getType()+" прыгает максимум - "+maxJump1+" м.;");


        }

        @Override
        public void swim(int maxSwim){
        boolean result=maxSwim <=10;
        if(result)maxSwim=maxSwim;
            System.out.print(getType()+" "+getName()+" плавает "+ maxSwim+ " метров - ");
            showResult(result);
            System.out.println(getType()+" плавает максимум - "+maxSwim1+" м.;");
    }




}
