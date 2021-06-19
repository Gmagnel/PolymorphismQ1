
package monsteratacks;


public class MonsterAtacks {

   
    public static void main(String[] args) {
     
     
// Declare references of the superclass
// and assign instances of subclasses.
Monster m1 = new FireMonster("Fire Lion"); // upcast
Monster m2 = new WaterMonster("Strike"); // upcast
Monster m3 = new StoneMonster("Blizzard"); // upcast
// Invoke the actual implementation
System.out.println(m1.attack()); // FireMonster's attack()
System.out.println(m2.attack()); // WaterMonster's attack()
System.out.println(m3.attack()); // StoneMonster's attack()
// m1 dies, generate a new instance and re-assign to m1.
m1 = new StoneMonster("Metamorphic"); // upcast
System.out.println(m1.attack()); // StoneMonster's attack()
// We have a problem here!!!
Monster m4 = new Monster("Green");
System.out.println(m4.attack()); // garbage!!!

}

    }
    

