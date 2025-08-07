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
            if (Publication.getContent().toLowerCase().contains(word.toLowerCase())) {
                System.out.println(publication);
            } else {
                System.out.println("No publication match with : " + word);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListOfPublication listOfPublication = new ListOfPublication(publicationsList);
        Publication post = new Publication("Hello everyone", LocalDate.of(2025, 12, 12));
        Publication post2 = new Publication("Let's code today !", LocalDate.of(2025, 11, 10));

        publicationsList = new ArrayList<>();
        publicationsList.add(post);
        publicationsList.add(post2);

        System.out.println(listOfPublication.getPublicationsList());
        listOfPublication.searchPublicationByWord("Let's code today !");
    }
}
