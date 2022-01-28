public class ServerNameGenerator {
  static String[] adj = {"short", "brave", "panicky", "thundering", "itchy", "slimy", "pretty", "selfish", "crabby", "flashy"};
  static String[] nouns = {"aardvark", "alpaca", "barracuda", "mole", "jackal", "eel", "caterpillar", "ferret", "hedgehog", "crab"};

public static String getRand(String[] array){
  int random = (int)(Math.random() * array.length);
  return array[random];
}
    public static void main(String[] args){
    String adjective = getRand(adj);
    String noun = getRand(nouns);
        System.out.println("Here is your server name: \n"  + adjective + "-" + noun);

    }





}
