package edu.uaslp.objetos.shoppingcart;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

public class Exercise3ShoppingItemCatalog {

    private final ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();

    @Test
    public void givenAValidCode_whenGetItem_thenShoppingItemIsReturned(){
        // Given:
        ShoppingCart shoppingCart = new ShoppingCart(shoppingItemCatalog);
        ShoppingItem item1 = shoppingItemCatalog.getItem("ABC3000");
        shoppingCart.add("ABC3000");


        // When:
        String itemCode = "9785";

        // Then:

    }

    @Test
    public void givenANotValidCode_whenGetItem_thenNullIsReturned(){
        // Given:
        ShoppingCart shoppingCart = new ShoppingCart(shoppingItemCatalog);
        ShoppingItem item1 = shoppingItemCatalog.getItem("ABC3000");
        shoppingCart.add("ABC3000");


        // When:
        String itemCode = "9785";

        // Then:
        assertThatThrownBy(() ->shoppingCart.add(itemCode))
                .isInstanceOf(ItemNotFoundException.class)
                .isInstanceOf(ShoppingCartException.class)
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Item with code 9785 not found");

    }
}
