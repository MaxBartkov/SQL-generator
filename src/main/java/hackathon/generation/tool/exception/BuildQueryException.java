package hackathon.generation.tool.exception;

import lombok.Data;

@Data
public class BuildQueryException extends RuntimeException {

    private String message;

    public BuildQueryException(String message) {
        this.message = message;
    }
}
