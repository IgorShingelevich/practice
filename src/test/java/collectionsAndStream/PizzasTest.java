package collectionsAndStream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class PizzasTest {
    String [] allIngredients = {"cheese", "tomato", "pepperoni", "mushrooms", "olives", "peppers", "onions", "ham", "pineapple"};
    List<String> allIngredientsList = List.of(Ingredients.CHEESE.toString(), Ingredients.TOMATO.toString(), Ingredients.PEPPERONI.toString(), Ingredients.MUSHROOMS.toString(), Ingredients.OLIVES.toString(), Ingredients.PEPPERS.toString(), Ingredients.ONIONS.toString(), Ingredients.HAM.toString(), Ingredients.PINEAPPLE.toString());

    public static Pizzas hawaiian = Pizzas.builder()
//            .id(1)
            .name("Hawaiian")
            .ingredients(List.of(Ingredients.CHEESE.toString(), Ingredients.TOMATO.toString(), Ingredients.HAM.toString(), Ingredients.PINEAPPLE.toString()))
            .build();

    public static Pizzas vegetarian = new Pizzas(2, "Vegetarian", List.of(Ingredients.CHEESE.toString(), Ingredients.TOMATO.toString(), Ingredients.MUSHROOMS.toString(), Ingredients.OLIVES.toString(), Ingredients.PEPPERS.toString(), Ingredients.ONIONS.toString()));

    @Test
    public void test() {
        System.out.println(hawaiian);
        System.out.println(vegetarian);
    }
}
