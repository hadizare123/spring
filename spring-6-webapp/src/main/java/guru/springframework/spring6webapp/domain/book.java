package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Set;

@Entity
public class book {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
   private long id;
   private String title;
   private String isbn;
   @ManyToMany
   @JoinTable(name = "author_book",joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns =@JoinColumn(name = "author_id"))

   private Set<Author> author;

    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
