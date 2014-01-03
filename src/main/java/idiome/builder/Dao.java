package idiome.builder;

public class Dao {
	
	public String getSQL(){
		final StringBuilder sql = new StringBuilder();
		sql.append("SELECT * ");
		sql.append("FROM table1 ");
		sql.append("WHERE column1 =':value1' ");
		sql.append("  AND column2 =':value2' ");
		return sql.toString();
	}

}
