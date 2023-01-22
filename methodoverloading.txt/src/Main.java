class Animal {
    String name;

    public void eat() {
        System.out.println("I can eat meat");
    }
}
class lion extends Animal{
    public void eat(){
        super.eat();
        System.out.println("I eat dog food");
    }
    public void dispaly(){
        System.out.println("the name of the lion is " + name);
    }
}
class Main{
    public static void main(String[] args){
        lion obj=new lion();
        obj.name="BLACK LION";
        obj.eat();
        obj.dispaly();

    }
}