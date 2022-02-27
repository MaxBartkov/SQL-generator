package hackathon.generation.tool.mapper;

import hackathon.generation.tool.model.ForeignKeysViewTree;
import hackathon.generation.tool.model.tables.pojos.ForeignKeysView;

import java.util.ArrayList;
import java.util.List;

public final class ForeignKeysMapper {

   public static List<ForeignKeysViewTree> foreignKeysViewToTrees(List<ForeignKeysView> foreignKeys) {
       List<ForeignKeysViewTree> result = new ArrayList<>();
       for(ForeignKeysView value : foreignKeys) {
           result.add(foreignKeyViewToTree(value));
       }
       return result;
   }

    public static ForeignKeysViewTree foreignKeyViewToTree(ForeignKeysView foreignKey) {
        return ForeignKeysViewTree
                .builder()
                .parentTable(foreignKey.getTableName())
                .parentColumn(foreignKey.getColumnName())
                .foreignTable(foreignKey.getForeignTableName())
                .foreignColumn(foreignKey.getForeignColumnName())
                .build();

    }
}
