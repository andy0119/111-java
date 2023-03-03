public class Test33{
    public static void main(String[]args){
        Human human1 = new Human("man", 170, 75);
        Human human2 = new Human("man", 160, 70);
        human1.printHight();
        //human1.printWeight();
        human2.printHight();
        //human2.printWeight();
       
    }
}

/*
class Human{
    String sex;
    int heigth ;
    int weight ;

    public Human(String sex, int heigth, int weigth){
    this.sex = sex;
    this.heigth = heigth;
    this.weight = weight;
    }
    
    public void printHight(){
        System.out.println(heigth);
    }
    public void printWeight(){
        System.out.println(weight);
    }
}
*/