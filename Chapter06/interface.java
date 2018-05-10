public interface iAnimal {
	public void eat();
	public void move();
}
public class MammalInt implements iAnimal {

   public void eat() {
      System.out.println("Mammal eats");
   }

   public void move() {
      System.out.println("Mammal moves");
   } 
}
