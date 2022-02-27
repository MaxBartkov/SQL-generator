# SQL-генераторо основанный на JOOQ (Java Object Oriented Querying)
```POST /query``` - Метод для генерации SQL-запроса на основе входящих таблиц в фильтров.

Пример Request:
```json 
{
  "tables": [
    "tb_statement_audit_async",
    "tb_statement_audit",
    "tb_statement_audit_async_one",
    "tb_statement_audit_async_two"
  ],
  "filters": [
    {
      "columnName": "total_count_parts",
      "tableName": "tb_statement_audit",
      "operation": "BETWEEN",
      "values": [
        "1",
        "2"
      ]
    }
  ]
}
``` 

