package collectionsAndStream;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Ingredients {
    CHEESE("cheese"),
    TOMATO("tomato"),
    PEPPERONI("pepperoni"),
    MUSHROOMS("mushrooms"),
    OLIVES("olives"),
    PEPPERS("peppers"),
    ONIONS("onions"),
    HAM("ham"),
    PINEAPPLE("pineapple");

    private final String ingredient;

    @Override
    public String toString() {
        return ingredient;
    }

}
