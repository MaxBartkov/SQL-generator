package hackathon.generation.tool.model.dto;

import lombok.Data;

@Data
public class Sort {

    private String columnName;

    private String tableName;

    private OrderDirection direction;

}

