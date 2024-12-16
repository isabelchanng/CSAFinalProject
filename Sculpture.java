
public class Sculpture extends MuseumItem {
    private String sculptor;
    private String material;
    private final String type = "sculpture";
   
    // Constructor
    public Sculpture(String artName, String content, String context, String timePeriod, String fileName, String sculptor, String material) {
        super(artName, content, context, timePeriod, fileName);
        this.sculptor = sculptor;
        this.material = material;
    }

    // Getters and Setters
    public String getSculptor() { return sculptor; }
    public void setSculptor(String sculptor) { this.sculptor = sculptor; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    @Override
    public String exhibitHistory() {
        return "Sculpture\n\tCreated by " + sculptor + " made of " + material + " from time period: " 
           + getTimePeriod() + "\n\tAdditional information--\n\tContent: " 
           + getContent() + "\n\tContext: " + getContext();
    } 

    @Override
    public String getType(){
        return type;
    }

}
