package hackathon.generation.tool.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ForeignKeysViewTree {

    private String parentTable;

    private String parentColumn;

    private String foreignColumn;

    private String foreignTable;

    private boolean isNotParent = false;

    private List<ForeignKeysViewTree> childs;

    public void addChild(ForeignKeysViewTree child){
        if(childs == null) {
            childs = new ArrayList<>();
        }
        if(!childs.contains(child)) {
            childs.add(child);
        }
    }

    public static ForeignKeysViewTree deepCopy(ForeignKeysViewTree tree) {
        return ForeignKeysViewTree
                .builder()
                .parentTable(tree.getParentTable())
                .parentColumn(tree.getParentColumn())
                .foreignTable(tree.getForeignTable())
                .foreignColumn(tree.getForeignColumn())
                .isNotParent(tree.isNotParent())
                .build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForeignKeysViewTree that = (ForeignKeysViewTree) o;

        if (parentTable != null ? !parentTable.equals(that.parentTable) : that.parentTable != null) return false;
        if (parentColumn != null ? !parentColumn.equals(that.parentColumn) : that.parentColumn != null) return false;
        if (!foreignColumn.equals(that.foreignColumn)) return false;
        return foreignTable.equals(that.foreignTable);
    }

    @Override
    public int hashCode() {
        int result = parentTable != null ? parentTable.hashCode() : 0;
        result = 31 * result + (parentColumn != null ? parentColumn.hashCode() : 0);
        result = 31 * result + foreignColumn.hashCode();
        result = 31 * result + foreignTable.hashCode();
        return result;
    }

    public String getParentTable() {
        return parentTable;
    }

    public String getParentColumn() {
        return parentColumn;
    }

    public String getForeignColumn() {
        return foreignColumn;
    }

    public String getForeignTable() {
        return foreignTable;
    }

    public boolean isNotParent() {
        return isNotParent;
    }

    public void setParentTable(String parentTable) {
        this.parentTable = parentTable;
    }

    public void setParentColumn(String parentColumn) {
        this.parentColumn = parentColumn;
    }

    public void setForeignColumn(String foreignColumn) {
        this.foreignColumn = foreignColumn;
    }

    public void setForeignTable(String foreignTable) {
        this.foreignTable = foreignTable;
    }

    public void setNotParent(boolean notParent) {
        isNotParent = notParent;
    }

    public void setChilds(List<ForeignKeysViewTree> childs) {
        this.childs = childs;
    }

    public List<ForeignKeysViewTree> getChilds() {
        return childs;
    }

}
