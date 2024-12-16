import java.util.ArrayList;
class Viewer extends Person{
    private final ArrayList<MuseumItem> favorites;
    private final String typeOfArtworks;
    private final int numOfArtworks;

    //constructer
    public Viewer(String viewerName, int age, String typeOfArtworks, int numOfArtworks) {
        super(viewerName, age); 
        this.typeOfArtworks = typeOfArtworks;
        this.numOfArtworks = numOfArtworks;
        this.favorites = new ArrayList<>();  
    }

    public Viewer(String viewerName, int age) {
        super(viewerName, age);
        this.typeOfArtworks = "Painting";
        this.numOfArtworks = 5;
        this.favorites = new ArrayList<>();  
    }

    public String getTypeOfArtworks() {
        return typeOfArtworks;
    }

    public int getNumOfArtworks() {
        return numOfArtworks;
    }

    // Add  to favorites
    public void addToFavorites(MuseumItem item) {
        favorites.add(item);
    }

    // Get favorites
    public ArrayList<MuseumItem> getFavorites() {
        return favorites;
    }

    // // Digital exhibit of favs 
    // public ArrayList<String> digitalExhibit() {
    //     ArrayList<String> exhibitDetails = new ArrayList<>();
    //     for (MuseumItem item : favorites) {
    //         exhibitDetails.add(item.exhibitHistory(item));
    //     }
    //     return exhibitDetails;
    // }
}