import java.util.ArrayList;
class Recommender extends Person{
    public ArrayList<MuseumItem> recommendations;
    String typeOfArtworks;
    int numOfArtworks;

    //constructer
    public Recommender(String viewerName, int age, String typeOfArtworks, int numOfArtworks){
        super(viewerName, age); 
        this.typeOfArtworks = typeOfArtworks;
        this.numOfArtworks = numOfArtworks;
        this.recommendations = new ArrayList<>();  
    }

    public String getTypeOfArtworks() {
        return typeOfArtworks;
    }
    
    // Add  to recommendations
    public void addToRecommendations(MuseumItem item) {
        recommendations.add(item);
    }

    // Get recommendations
    public ArrayList<MuseumItem> getRecommendations() {
        return recommendations;
    }

    // public ArrayList<MuseumItem> recommendArtworks(ArrayList<MuseumItem> fullMuseumCollection) {
    //     if (typeOfArtworks.equalsIgnoreCase("sculpture")) {
    //         recommendations.addAll(1 , fullMuseumCollection);
    //     } else if (typeOfArtworks.equalsIgnoreCase("painting")) {
    //         recommendations.addAll(2, fullMuseumCollection);
    //         recommendations.addAll(3, fullMuseumCollection);
    //     } else if (typeOfArtworks.equalsIgnoreCase("artifact")) {
    //         recommendations.addAll(4, fullMuseumCollection);
    //         recommendations.addAll(5, fullMuseumCollection);
    //     } 
    //     return recommendations;
    // }

    public ArrayList<MuseumItem> recommendArtworks(ArrayList<MuseumItem> fullMuseumCollection) {

        if (recommendations.size() >= numOfArtworks)
            return recommendations;

        // count the number of artworkds added to the recommendation list
        int i = recommendations.size(); 

        // Filter artworks by type
        for (MuseumItem item : fullMuseumCollection) {
            if (item.getType().equalsIgnoreCase(typeOfArtworks)) {
                recommendations.add(item);
                i++;
                if (i >= numOfArtworks)
                    break;
            }
        }
        
        return recommendations;
    }


    // public String recommendArtworksExhibit(ArrayList<MuseumItem> fullMuseumCollection, String typeOfArtworks, int numberOfItems) {
    //     String recommendationExhibit = "";

    //     // Filter artworks by type
    //     ArrayList<MuseumItem> filteredArtworks = new ArrayList<>();
    //     for (MuseumItem item : fullMuseumCollection) {
    //         if (item.getType().equalsIgnoreCase(typeOfArtworks)) {
    //             filteredArtworks.add(item);
    //         }
    //     }
        
    //     // Limit the number of items based on user input
    //     int itemsToAdd = Math.min(numberOfItems, filteredArtworks.size());
        
    //     // Add the specified number of artworks to the recommendations
    //     for (int i = 0; i < itemsToAdd; i++) {
    //         recommendations.add(filteredArtworks.get(i));
    //         //recommendationExhibit += exhibitHistory(filteredArtworks.get(i) + "/n");
    //     }
    //     return recommendationsExhibit;
    // }

}