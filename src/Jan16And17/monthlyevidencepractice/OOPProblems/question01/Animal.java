package Jan16And17.monthlyevidencepractice.OOPProblems.question01;


public class Animal {
    public void eat(){
        System.out.println("Animal eats!");
    }
}

class Cat extends Animal{
    private String food;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public void eat() {
        System.out.println("Cat eats"); //To change body of generated methods, choose Tools | Templates.
    }

}