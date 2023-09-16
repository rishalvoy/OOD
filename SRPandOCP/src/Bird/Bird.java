package Bird;

public class Bird {

    private String name;

    private  double weight;

    private BirdType type;

    private Color color;

    private Size size;


    /*
    * Are we really liking this implementation?
    * This is called if else hell
    * Not Readable if there are 1000 if else conditions
    * Not easy to test
    * No Maintainable
    * There will be verbal and merge conflicts focus on verbal
    * Not Reusable
    * Fly Method is Doing To Many Things
    * Eventually Violating SRP - Single Responsibility Principle
    * When i import for eagle i should only get how a eagle fly don't give a shit about how other birds fly
    */

    /*WHAT THE HECK IS SRP?
    * A single code unit should always perform one responsibility.
    * One Method should have one function, one class should not have a lion in that
    * One Package should have one responsibility
    * How is it fly() breaking SRP?
    * In fly() we should only make the bird fly but we are also deciding which bird to fly
    * We should have only one reason to change the class
    * IN our case we have 2 reasons to change the fly method,
    * 2.A When there is adding or removing of any bird
    * 2.B Changing the implementation of fly()
    * Pro Tip
    * Whenever we have if else we might be violating SRP
    * Monster Methods/God Classes
    *
     */
    public void fly(){

        if(type==BirdType.Eagle)
        {
            System.out.println("Eagle is flying");
        }
        else if (type==BirdType.Parrot) {
            System.out.println("Parrot is flying");
        } else if (type==BirdType.Peacock) {

            System.out.println("Peacock is flying");
        } else if (type == BirdType.Sparrow) {
            System.out.println("Sparrow is flying");

        }

    }

    public void eat(){


        System.out.println("Feeling Hungry Let's Eat");
    }

    public void sleep(){
        System.out.println("I ate a lot let's sleep");
    }



    //We use setter instead of direct setting to have more control over the way we want to set the attributes value




    
}
