package com.luiscacuango.jobsearch;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class JobPosition {
    // Campos mapeados de la API de Arbeitnow
    @SerializedName("slug")
    private String id;

    @SerializedName("url")
    private String url;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("company_name")
    private String company;

    @SerializedName("location")
    private String location;

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return String.format("Puesto: %s | Empresa: %s | Ubicación: %s | Link: %s",
                title, company, location, url);
    }

    // Los métodos equals y hashCode deben actualizarse con los nuevos campos

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        JobPosition that = (JobPosition) object;
        return Objects.equals(id, that.id) && Objects.equals(url, that.url) && Objects.equals(createdAt, that.createdAt) && Objects.equals(company, that.company) && Objects.equals(location, that.location) && Objects.equals(title, that.title) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, createdAt, company, location, title, description);
    }
}