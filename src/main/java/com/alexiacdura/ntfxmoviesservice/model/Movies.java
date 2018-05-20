package com.alexiacdura.ntfxmoviesservice.model;

import javax.persistence.*;
/**
 * Created by alexiacdura 13/05/2018
 *
 * @author Alexia C. Durá
 */

/**
 * Identify model class for JPA hibernate object mapping when accessing database
 */
@Entity
/**
 * Identify table name
 */
@Table(name = "movies")
public class Movies {

    /**
     * Identify primary key
     */
    @Id
    @GeneratedValue
    /**
     * Identify column name
     */
    @Column(name = "id")
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "posterUrl")
    private String posterUrl;
    @Column(name = "fileUrl")
    private String fileUrl;
    @Column(name = "publisher")
    private String publisher;


    /**
     * Empty constructor
     */
    public Movies() {
    }

    /**
     * Getters and Setters
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
