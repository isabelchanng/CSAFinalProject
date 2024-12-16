class Artifact extends MuseumItem {
    private String discoveryTime;
    private String discoveryPerson;
    private final String type = "Artifact";

    // Constructor
    public Artifact(String artName, String content, String context, String timePeriod, String fileName, String discoveryTime, String discoveryPerson) {
        super(artName, content, context, timePeriod, fileName);
        this.discoveryTime = discoveryTime;
        this.discoveryPerson = discoveryPerson;
    }

    // Getters and Setters
    public String getDiscoveryTime() { return discoveryTime; }
    public void setDiscoveryTime(String discoveryTime) { this.discoveryTime = discoveryTime; }

    public String getDiscoveryPerson() { return discoveryPerson; }
    public void setDiscoveryPerson(String discoveryPerson) { this.discoveryPerson = discoveryPerson; }

    @Override
    public String exhibitHistory() {
    return "Artifact\n\tTitled: " + getArtName() + " discovered by " + getDiscoveryPerson() 
           + " in " + getDiscoveryTime() + ". Time period: " 
           + getTimePeriod() + "\n\tAdditional information--\n\tContent: " 
           + getContent() + "\n\tContext: " + getContext();
    }

    @Override
     public String getType(){
        return type;
    }
    
}