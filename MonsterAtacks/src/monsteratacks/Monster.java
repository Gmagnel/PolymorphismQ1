
package monsteratacks;


public class Monster {
    // protected instance variable
protected String name;
// Constructor
public Monster(String name) {
this.name = name;
}
// Define common behaviour for all its subclasses
public String attack() {
return "Err.. I don't know how to attack!";
// We have a problem here!
// We need to return a String; else, compilation error!
}
}
 class FireMonster extends Monster {
// Constructor
public FireMonster(String name) {
super(name);
}
// Subclass provides actual implementation
@Override
public String attack() {
return name + " Attack with fire!";
}
}
 class WaterMonster extends Monster {
// Constructor
public WaterMonster(String name) {
super(name);
}
// Subclass provides actual implementation
@Override
public String attack() {
return name + " Attack with water!";
}
}
 class StoneMonster extends Monster {
// Constructor
public StoneMonster(String name) {
super(name);
}
// Subclass provides actual implementation
@Override
public String attack() {
return name + " Attack with stones!";
}
}
