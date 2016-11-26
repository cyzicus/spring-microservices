package us.cyzic.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by jasoncmiller on 11/26/16.
 */
public class Greet extends ResourceSupport{

    @JsonProperty("message")
    private String message;

    @JsonCreator
    public Greet(@JsonProperty String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
