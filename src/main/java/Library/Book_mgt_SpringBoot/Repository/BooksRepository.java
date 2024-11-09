package Library.Book_mgt_SpringBoot.Repository;

import Library.Book_mgt_SpringBoot.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface BooksRepository extends JpaRepository<Books, Long> {

    public Books findByTitle(String title);
}
