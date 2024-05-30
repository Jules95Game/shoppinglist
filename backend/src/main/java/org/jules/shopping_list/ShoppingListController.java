package org.jules.shopping_list;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("api/v1/shopping-list-items")
public class ShoppingListController {
    @GetMapping
    public List<String> get() {
//        todo add tastier food
        return List.of(
                "boter",
                "kaas",
                "eieren"
        );
    }
}
