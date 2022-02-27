package hackathon.generation.tool.controller;

import hackathon.generation.tool.model.dto.FilterRequestDto;
import hackathon.generation.tool.service.BaseGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneratedViewController {

    private final BaseGeneratorService generatedViewRepository;

    @Autowired
    public GeneratedViewController(BaseGeneratorService generatedViewRepository) {
        this.generatedViewRepository = generatedViewRepository;
    }

    @PostMapping("/query")
    public String generateQueryBasedOnTablesAndFilters(@RequestBody FilterRequestDto filters) {
        return generatedViewRepository.buildAndCacheHeadQuery(filters);
    }
}
