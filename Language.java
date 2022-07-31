class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }

  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder + ".");
  }

  protected void setRegion(String inputRegion) {
    this.regionsSpoken = inputRegion;
  }

  protected void setNumSpeakers(int inputNumSpeakers) {
    this.numSpeakers = inputNumSpeakers;
  }

  protected void setWordOrder(String inputWordOrder) {
    this.wordOrder = inputWordOrder;
  }

  public static void main(String[] args) {
    Language japanese = new Language("Japanese", 128000000, "Japan", "subject-object-verb");
    japanese.getInfo();
    
    Mayan yucatec = new Mayan("Yucatec", 812633);
    yucatec.getInfo();

    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 920000000);
    SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
    mandarin.getInfo();
    burmese.getInfo();

    // Bonus task 1: Build an array or ArrayList of several language objects and loop through them to call getInfo().
    Language[] languages = {japanese, yucatec, mandarin, burmese};
    System.out.println("Looping through each language in the languages array to call getInfo().");
    for (Language language : languages) {
      language.getInfo();
    }

    // Bonus task 2: Add new methods that allow users to set a specific region, change the number of speakers, or modify the word order.
    // japanese.getInfo();
    // japanese.setRegion("Neo Tokyo");
    // japanese.getInfo();

    // yucatec.getInfo();
    // yucatec.setNumSpeakers(812733);
    // yucatec.getInfo();

    // mandarin.getInfo();
    // mandarin.setWordOrder("subject-object-verb");
    // mandarin.getInfo();
  }
}