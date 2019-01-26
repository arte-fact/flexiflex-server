package com.artefact.flexiflex.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Product.
 */
@Entity
@Table(name = "product")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    
    @Lob
    @Column(name = "urls", nullable = false)
    private String urls;

    @NotNull
    @Size(max = 255)
    @Column(name = "title", length = 255, nullable = false)
    private String title;

    
    @Lob
    @Column(name = "synopsis", nullable = false)
    private String synopsis;

    @Column(name = "tmdb_id")
    private Integer tmdbId;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrls() {
        return urls;
    }

    public Product urls(String urls) {
        this.urls = urls;
        return this;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public String getTitle() {
        return title;
    }

    public Product title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public Product synopsis(String synopsis) {
        this.synopsis = synopsis;
        return this;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getTmdbId() {
        return tmdbId;
    }

    public Product tmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
        return this;
    }

    public void setTmdbId(Integer tmdbId) {
        this.tmdbId = tmdbId;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        if (product.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), product.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + getId() +
            ", urls='" + getUrls() + "'" +
            ", title='" + getTitle() + "'" +
            ", synopsis='" + getSynopsis() + "'" +
            ", tmdbId=" + getTmdbId() +
            "}";
    }
}
