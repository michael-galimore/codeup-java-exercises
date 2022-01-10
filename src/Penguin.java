
//Create a class named "Penguin"
//Give your class the following private fields
//Name
//Weight
//Species
//Sex
//Give your class the following public methods
//getName
//getWeight
//getSpecies
//getSex
//setName
//setWeight
//setSpecies
//setSex
//Give your class a constructor method
//Give your class the following public static methods
//canFly (returns false)
//areEvil (returns true)



public class Penguin {
    private String name;
    private int weight;
    private String species;
    private String sex;

    public static boolean canFly(){
        return false;
    }

    public static boolean areEvil(){
        return true;
    }

    public Penguin(String name, int weight, String species, String sex) {
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getSpecies(){
        return species;
    }

    public void setSpecies(String species){
        this.species = species;
    }

    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex =sex;
    }



}
