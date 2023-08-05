package br.com.alura.aluratube.domain.video;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Video")
@Table(name = "videos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String url;

    @Enumerated(EnumType.STRING)
    private Category category;

    public Video(DataCreateVideo data) {
        this.title = data.title();
        this.description = data.description();
        this.url = data.url();
        this.category = data.category();
    }
}
