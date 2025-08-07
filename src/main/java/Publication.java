import java.time.LocalDate;

public class Publication {
    private static String content;
    private LocalDate publicationDate;

    public Publication(String content, LocalDate publicationDate) {
        this.content = content;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public static String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "content='" + content + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }

    static String postPublication(Publication post) {
        return post.toString();
    }

    public static void main(String[] args) {
        System.out.println(postPublication(new Publication("Hello everyone", LocalDate.of(2025, 12, 12) )));
    }
}
