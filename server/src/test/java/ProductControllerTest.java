import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.gb.onlineShop.controller.ProductController;
import ru.gb.onlineShop.entity.Product;
import ru.gb.onlineShop.service.ProductService;
import java.util.List;

public class ProductControllerTest {
    @Test
    void shouldRetrieveProducts_whenHttpRequestComing_andThereAreExistingRecords() {
        ProductService productService = Mockito.mock(ProductService.class);

        Mockito.when(productService.findAll())
                .thenReturn(List.of(new Product(), new Product()));

        ProductController productController = new ProductController(productService);
        Assertions.assertThat(productController.findAll()).isNotEmpty();
    }

}
