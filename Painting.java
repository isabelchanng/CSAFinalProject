class Painting extends MuseumItem {
    private String technique;
    private String painter;
    private final String type = "Painting";

    // Constructor
    public Painting(String artName, String content, String context, String timePeriod, String fileName, String technique, String painter) {
        super(artName, content, context, timePeriod, fileName);
        this.technique = technique;
        this.painter = painter;
    }

    // Getters and Setters
    public String getTechnique() {
        return technique; 
    }

    public void setTechnique(String technique) {
        this.technique = technique; 
    }

    public String getPainter() {
        return painter; 
    }

    public void setArtist(String painter) {
        this.painter = painter;
    }


    @Override 
    public String exhibitHistory() {
        return "Painting\n\tTitled :" + getArtName() + " by " + getPainter() 
           + " created using " + getTechnique() + " technique. Time period: " 
           + getTimePeriod() + "\n\tAdditional information--\n\tContent: " 
           + getContent() + "\n\tContext: " + getContext();
    }

    @Override
    public String getType(){
        return type;
    }
}
