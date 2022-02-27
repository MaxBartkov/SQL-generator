package hackathon.generation.tool.model.dto;


import lombok.Data;

import java.util.List;

@Data
public class FilterRequestDto {

    private List<String> tables;

    private List<Filter> filters;

    private Sort sort;

    private Pagination pagination;

    private boolean withSelectStatement = true;



}
