package hackathon.generation.tool.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class Filter {

    private String tableName;

    private String columnName;

    private List<String> values;

    private Operation operation;

}
