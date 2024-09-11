// this class shows dynamic polymorphism by overwriting the inherited method "water"
class Monstera extends Plant {
    @Override
    public void water(boolean fertiliser){
        System.out.println("Monstera gegossen und gedüngt");
    }
}
