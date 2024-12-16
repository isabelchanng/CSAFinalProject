public abstract class MuseumItem {
    private final String artName; //artists(s). first name, last name.
    private final String content; // subject matter, symbolism, ideas that are represented in the artwork
    private final String context; // this includes the movements that they r a part of or circumstances of society or themselves. 
    private final String timePeriod; // art pieces are made over the course of several years or the exact time it was made can't be exactly located. 
    private final String fileName; //file location name >:(

    //Constructor
    public MuseumItem(String itemName, String itemContent, String itemContext, String itemTimePeriod, String itemFileName) {
        artName = itemName;
        content = itemContent;
        context = itemContext;
        timePeriod = itemTimePeriod;
        fileName = itemFileName;
    }

    //getter or accessors of da variables 
    public String getArtName() {
        return artName;
    }

    public String getContent() {
        return content;
    }

    public String getContext() {
        return context;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public String getFileName() {
        return fileName;
    }

    // public String toString(ArrayList<MuseumItem> recommendedList){
    //     String nameDetails; 

    // // Filter artworks by type
    // for (MuseumItem item : fullMuseumCollection) {
    //     nameDetails =+ item.getName;
    //     }
    // return nameDetails;
    // }

    public abstract String getType();

    public abstract String exhibitHistory();

    public static int compareTimePeriod(MuseumItem item1, MuseumItem item2) {
        return item1.timePeriod.compareTo(item2.timePeriod);
    }

    public static int calculateAge(MuseumItem item, int currentYear) {
        try {
            int creationYear = Integer.parseInt(item.timePeriod);
            return currentYear - creationYear;
        } catch (NumberFormatException e) {
            return -1; // Invalid timePeriod format
        }
    }

}