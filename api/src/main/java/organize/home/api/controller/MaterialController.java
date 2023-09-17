package organize.home.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MaterialController 
{
    @GetMapping
    public String Material() {
        return "Hello i'm MATERIAL";
    }

}
