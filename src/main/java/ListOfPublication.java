import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListOfPublication {
    private static List<Publication> publicationsList;

    public ListOfPublication(List<Publication> publications) {
        this.publicationsList = publications;
    }

    public List<Publication> getPublicationsList() {
        return publicationsList;
    }

    public static Publication searchPublicationByWord(String word){
        for (Publication publication : publicationsList) {
            if (!Publication.getContent().toLowerCase().contains(word)){
                System.out.println("Aucune publication ne correspond au mot : " + word);
            } else {
                return publication;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Publication> list = new ArrayList<Publication>();
        Publication post2 = new Publication("Hello everyone !", LocalDate.now());
        list.add(post2);
        System.out.println(searchPublicationByWord("Hello"));
    }
}
