package waa.waa_lab1.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
    private String author;

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn(name = "id-Post")
    private List<Comment> commentList;

}
