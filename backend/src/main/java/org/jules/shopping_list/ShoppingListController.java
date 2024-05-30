package org.jules.shopping_list;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/shopping-list-items")
public class ShoppingListController {
    @GetMapping
    public List<String> get() {
        return List.of(
                "boter",
                "kaas",
                "eieren"
        );
    }
}
