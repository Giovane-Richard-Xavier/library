package io.github.giovanerichard.pcaapi.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "author")
@Data
public class Author {

    @Id
    @Column(name = "uuid")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(name = "name", length = 200, nullable = false)
    private String name;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthdate;

    @Column(name = "nationality", length = 100, nullable = false)
    private String nationality;

//    @OneToMany(mappedBy = "autor")
//    private Set<Books> books = new HashSet<>();

    @ManyToMany(mappedBy = "authors", fetch = FetchType.LAZY)
    private Set<Books> books = new HashSet<>();

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Set<Books> getBooks() {
        return books;
    }

    public void setBooks(Set<Books> books) {
        this.books = books;
    }
}
