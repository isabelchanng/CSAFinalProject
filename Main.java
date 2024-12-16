import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<MuseumItem> fullMuseumCollection = museumCollectionInstallation();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to Isabel's Museum. You approach the guide");
        System.out.print("The guide taps you on your shoulder and asks: 'What is your name?' \n Enter your name: ");
        String name = scanner.nextLine();

        // Asking age
        System.out.println("The guide asks: 'And how old are you?'");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        // Asking how many artworks
        System.out.println("How many artworks would you like to see today?");
        System.out.print("Enter the number of artworks: ");
        int numArtworks = scanner.nextInt();
        scanner.nextLine();

        // Asking for the type of artworks
        System.out.println("What kind of artworks would you like to see? (Painting, Sculpture, or Artifact)");
        System.out.print("Enter the type of artworks: ");
        String artworkType = scanner.nextLine();

        // for debugging
        // int age = 16;
        // String name = "Isabel";
        // String artworkType = "Painting";
        // int numArtworks = 5;

        Viewer guest1 = new Viewer(name, age, artworkType, numArtworks);
        Recommender recommender1 = new Recommender("Gerald", 32, artworkType, numArtworks);
        recommender1.recommendArtworks(fullMuseumCollection);

        System.out.println("Welcome, " + guest1.getName() + "! You are " + guest1.getAge() + " years old.");
        System.out.println("You have chosen to see " + guest1.getNumOfArtworks() + " " + guest1.getTypeOfArtworks() + " artworks.");
        System.out.println("Your tour guide is " + recommender1.getName() + " an expert on " + recommender1.getTypeOfArtworks());
        System.out.println("Enjoy your visit at The Isabel Museum of International Intragenerational Art!");

        ArrayList<MuseumItem> recommendedCollection = recommender1.recommendArtworks(fullMuseumCollection);

        if (recommendedCollection.isEmpty()) {
            System.out.println("Sorry! " + recommender1.getName() + " has no recommendations for " + guest1.getTypeOfArtworks());
        } else {
            System.out.println(recommender1.getName() + " recommends the following art works for your tour");
            printMuseumCollections(recommendedCollection);
        }
    }

    public static void printMuseumCollections(ArrayList<MuseumItem> museumCollection){
        int counter = 1; 
        for(MuseumItem item : museumCollection) {
            System.out.println(String.format("%03d", counter) + ": " + item.exhibitHistory());
            counter++;
        }
    }

    public static  ArrayList<MuseumItem> museumCollectionInstallation(){
        // MuseumItem(String itemName, String itemContent, String itemContext, String itemTimePeriod, String itemFileName) {
        // Sculpture(String artName, String content, String context, String timePeriod, String fileName, String sculptor, String material)
        // Painting(String artName, String content, String context, String timePeriod, String fileName, String technique, String painter) 
        // Artifact(String artName, String content, String context, String timePeriod, String fileName, String discoveryTime, String discoveryPerson) 

        Painting Cotopaxi = new Painting("Cotopaxi", "Volcano", "Luminism. civil war", "18th century", "Cotopaxi.png", "invisible paint strokes", "Fredric Edwin Church");
        Sculpture theVolcanoThatleft = new Sculpture("The Volcano That Left", "Volcano", "Indigenous Futurism", "2023", "tvtl.png", "Beatriz Cortez", "beaten steel");
        Artifact venusOfWillendorf = new Artifact("Venus Of Willendorf", "fertility charm", "shamanism", "prehistory", "venus.png", "20th century", "Hugo Obermaier");
        Sculpture theBurghersOfCalais = new Sculpture("The Burghers of Calais", "six citizens awaiting death", "Hundred Years War", "19th century", "calais.png", "Auguste Rodin", "bronze");
        Painting nikeSamothrace = new Painting("Nike Samothrace", "Winged Victory", "Hellenistic Period", "2nd century BCE", "nike.png", "marble", "Unknown");
        Painting runningHornedWoman = new Painting("Running Horned Woman", "Depiction of a goddess or priestess", "Prehistoric African Art", "6000-4000 BCE", "running_woman.png", "Unknown", "unknown");
        Sculpture david = new Sculpture("David", "Biblical hero", "Italian Renaissance", "1504", "david.png", "Michelangelo", "marble");
        Painting oathOfTheHoratii = new Painting("Oath of the Horatii", "Brothers swearing loyalty", "Neoclassicism", "1784", "horatii.png", "bold colors and dramatic poses", "Jacques-Louis David");
        Sculpture androgyneIII = new Sculpture("Androgyne III", "Human suffering and vulnerability", "Contemporary Art", "1985", "androgyne.png", "Magdalena Abakanowicz", "burlap and resin");
        Artifact sunflowerSeeds = new Artifact("Sunflower Seeds", "Millions of porcelain seeds", "Chinese Contemporary Art", "2010", "seeds.png", "Ai Weiwei", "hand-painted porcelain");
        Painting andTheresNothingToBeDone = new Painting("And There's Nothing to Be Done", "War atrocities", "Romanticism", "1810", "theres_nothing.png", "dramatic contrast and despair", "Francisco Goya");
        Painting selfPortraitAsASoldier = new Painting("Self-Portrait as a Soldier", "Artist's personal torment", "Expressionism", "1915", "soldier_selfportrait.png", "distorted and emotional", "Ernst Ludwig Kirchner");
        Sculpture anavysosKouros = new Sculpture("Anavysos Kouros", "Idealized male youth", "Archaic Greek Art", "530 BCE", "kouros.png", "Unknown", "marble");
        Painting arnolfiniPortrait = new Painting("Arnolfini Portrait", "Marriage or partnership", "Northern Renaissance", "1434", "arnolfini.png", "incredible detail and symbolism", "Jan van Eyck");
        Painting slaveShip = new Painting("Slave Ship", "Condemnation of slavery", "Romanticism", "1840", "slave_ship.png", "fiery colors and chaotic waves", "J.M.W. Turner");
        Painting starryNight = new Painting("Starry Night", "Swirling night sky", "Post-Impressionism", "1889", "starry_night.png", "dynamic and textured brushstrokes", "Vincent van Gogh");
        Painting laGrandeOdalisque = new Painting("La Grande Odalisque", "Exotic female nude", "Romanticism", "1814", "odalisque.png", "elongated proportions", "Jean-Auguste-Dominique Ingres");
        Painting teteATete = new Painting("Tête à Tête", "Satirical marriage scene", "Rococo", "1743", "tete_a_tete.png", "humorous and detailed", "William Hogarth");
        Artifact paletteOfNarmer = new Artifact("Palette of Narmer", "Commemorative artifact depicting unification of Egypt", "Predynastic Egypt", "3000 BCE", "narmer_palette.png", "low relief carving", "Unknown");
        Artifact standardOfUr = new Artifact("Standard of Ur", "Depiction of war and peace", "Sumerian", "2600-2400 BCE", "standard_ur.png", "inlaid shell and lapis lazuli", "Unknown");
        Artifact codeOfHammurabi = new Artifact("Code of Hammurabi", "Babylonian legal text", "Babylonian", "1754 BCE", "hammurabi.png", "inscribed basalt stele", "Unknown");
        Artifact lamassu = new Artifact("Lamassu", "Winged bulls that guarded gates", "Assyrian", "720-705 BCE", "lamassu.png", "alabaster relief", "Unknown");
        Artifact bookOfTheDead = new Artifact("Book of the Dead", "Funerary text for the afterlife", "Ancient Egypt", "1275 BCE", "book_dead.png", "painted papyrus", "Unknown");
        Artifact peplosKore = new Artifact("Peplos Kore", "Archaic statue of a young woman", "Archaic Greek", "530 BCE", "peplos_kore.png", "painted marble", "Unknown");
        Artifact theDavidVases = new Artifact("The David Vases", "dragons and flowers", "Yuan Dynasty", "14th century", "davidvases.png", "unknown", "unknown");

        ArrayList<MuseumItem> fullMuseumCollection = new ArrayList<>();
        fullMuseumCollection.add(Cotopaxi);
        fullMuseumCollection.add(theBurghersOfCalais);
        fullMuseumCollection.add(theVolcanoThatleft);
        fullMuseumCollection.add(venusOfWillendorf);
        fullMuseumCollection.add(nikeSamothrace);
        fullMuseumCollection.add(runningHornedWoman);
        fullMuseumCollection.add(david);
        fullMuseumCollection.add(oathOfTheHoratii);
        fullMuseumCollection.add(androgyneIII);
        fullMuseumCollection.add(sunflowerSeeds);
        fullMuseumCollection.add(andTheresNothingToBeDone);
        fullMuseumCollection.add(selfPortraitAsASoldier);
        fullMuseumCollection.add(anavysosKouros);
        fullMuseumCollection.add(arnolfiniPortrait);
        fullMuseumCollection.add(slaveShip);
        fullMuseumCollection.add(starryNight);
        fullMuseumCollection.add(laGrandeOdalisque);
        fullMuseumCollection.add(teteATete);
        fullMuseumCollection.add(paletteOfNarmer);
        fullMuseumCollection.add(standardOfUr);
        fullMuseumCollection.add(codeOfHammurabi);
        fullMuseumCollection.add(lamassu);
        fullMuseumCollection.add(bookOfTheDead);
        fullMuseumCollection.add(peplosKore);
        fullMuseumCollection.add(theDavidVases);

        return fullMuseumCollection;
    }

//     public static ArrayList<MuseumItem> separateMuseumItems(int num) {
//     ArrayList<MuseumItem> allItems = museumCollectionInstallation();

//     ArrayList<Painting> paintings = new ArrayList<>();
//     ArrayList<Sculpture> sculptures = new ArrayList<>();
//     ArrayList<Artifact> artifacts = new ArrayList<>();

//     for (MuseumItem item : allItems) {
//         if (item instanceof Painting) {
//             paintings.add((Painting) item);
//         } else if (item instanceof Sculpture) {
//             sculptures.add((Sculpture) item);
//         } else if (item instanceof Artifact) {
//             artifacts.add((Artifact) item);
//         }
//     }
//     if (num == 0){
//         return ArrayList<Painting> paintings;
//     }
    
//     if (num == 1){
//         return ArrayList<Sculpture> sculptures;
//     }

//     else {
//         return ArrayList<Artifact> artifacts; 
//     }
// }
}
