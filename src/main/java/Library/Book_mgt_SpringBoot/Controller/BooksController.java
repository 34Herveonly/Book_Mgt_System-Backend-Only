package Library.Book_mgt_SpringBoot.Controller;

import Library.Book_mgt_SpringBoot.Entity.Books;
import Library.Book_mgt_SpringBoot.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;




@RestController
@Controller
public class BooksController {

@Autowired
    public BooksRepository booksRepository;


 //Api to Add Books to the Database

@PostMapping("/add")

    public ResponseEntity<Books> addBook(@RequestBody Books book) {
    Books saved = booksRepository.save(book);
        return ResponseEntity.ok(saved);
    }

//Api to Find a book in database by name.
@GetMapping("/getBook/{name}")

    public ResponseEntity<Books> getBookByName(@PathVariable String name ) {
   Books myBook= booksRepository.findByTitle(name);
   return ResponseEntity.ok(myBook);

}

//Api to Make an Update on a book

@PutMapping("/update/{name}")
    public ResponseEntity<Books> updateBook(@PathVariable String name, @RequestBody Books book) {
    Books updateBook = booksRepository.save(book);
    return ResponseEntity.ok(updateBook);

}

// Api to delete a Book from Database

@DeleteMapping("/delete/{name}")
public String  deleteBook(@PathVariable String name) {
    Books bookToDelete=booksRepository.findByTitle(name);
    booksRepository.delete(bookToDelete);
return bookToDelete +" Was deleted from Database Successfully";

}

}
