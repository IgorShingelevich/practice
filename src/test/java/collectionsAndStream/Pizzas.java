package collectionsAndStream;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pizzas {
    private Integer id;
    private String name;
    private List<String> ingredients;

    public Pizzas(Integer id, String name, List<String> ingredients) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
    }
}
