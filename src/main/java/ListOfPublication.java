import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListOfPublication {
    private static List<Publication> publicationsList;

    public ListOfPublication(List<Publication> publicationsList) {
        this.publicationsList = publicationsList;
    }

    public List<Publication> getPublicationsList() {
        return publicationsList;
    }

    public static boolean searchPublicationByWord(String word){
        for (Publication publication : publicationsList) {
            if (!Publication.getContent().toLowerCase().contains(word)){
                System.out.println("Aucune publication ne correspond au mot : " + word);
            } else {
                System.out.println(publication);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Publication> list = new ArrayList<Publication>();
        Publication post2 = new Publication("Hello everyone !", LocalDate.now());
        list.add(post2);
        System.out.println(searchPublicationByWord("Hello"));
    }
}
