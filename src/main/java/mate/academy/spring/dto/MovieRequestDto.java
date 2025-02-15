package mate.academy.spring.dto;

public class MovieRequestDto {
    private String description;
    private String title;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "MovieRequestDto{description='%s', title='%s'}"
                .formatted(description, title);
    }
}
