package hackathon.generation.tool.model.dto;

import lombok.Data;

@Data
public class Pagination {

    public static final int DEFAULT_PAGE_SIZE = 30;
    public static final int DEFAULT_PAGE_NUMBER = 0;

    private int pageSize = DEFAULT_PAGE_SIZE;
    private int pageNumber = DEFAULT_PAGE_NUMBER;

}
