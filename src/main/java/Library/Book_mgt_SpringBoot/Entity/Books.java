package Library.Book_mgt_SpringBoot.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Books {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column
private String title;
@Column
private String author;
@Column
private String genre;

}
