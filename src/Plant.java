// this class shows static polymorphism by overloading the method "water"
class Plant {
    public void water(){
        System.out.println("Pflanze gegossen");
    }

    public void water(boolean fertiliser){
        System.out.println("Pflanze gegossen und gedüngt");
    }
}
