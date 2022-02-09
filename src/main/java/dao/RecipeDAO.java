package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import model.Ingredient;
import model.Recipe;

public class RecipeDAO {
	
	private final String url = "jdbc:postgresql://localhost:5432/DYInner";
    private final String user = "postgres";
    private final String password = "4163";
	
	
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     * @throws java.sql.SQLException
     * @throws ClassNotFoundException 
     */
    public Connection connect() throws SQLException {
    	try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return DriverManager.getConnection(url, user, password);
    }
    
    public List<Recipe> getRecipes() throws NumberFormatException, ParseException {
    	
        String SQL = "SELECT * FROM public.\"Recipe\";";
        
        List<Recipe> recipes = new ArrayList<Recipe>();


        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(SQL)) {
        	       	while (rs.next()) {
        	       		Recipe rcp = new Recipe();
        	       		rcp.setId(Integer.parseInt(rs.getString("id")));
        	       		rcp.setIs_favorited(Boolean.parseBoolean(rs.getString("is_favorited")));
        	       		rcp.setName(rs.getString("name"));
        	       		rcp.setPhoto(rs.getString("photo"));
        	       		rcp.setVideo(rs.getString("video"));
        	       		rcp.setRecipe_text(rs.getString("recipe_text"));
        	       		rcp.setChallenge_level(Integer.parseInt(rs.getString("challenge_level")));
        	       		recipes.add(rcp);
		            }
        	       	
        	        rs.close();
        		    stmt.close();
           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return recipes;
    }
    
public List<Ingredient> getIngredients(int recipe_id) throws NumberFormatException, ParseException {
    	
        String SQL = "SELECT  public.\"Ingredient\".id, public.\"Ingredient\".name, public.\"Ingredient\".price, public.\"Recipe_Ingredient\".quantity, public.\"Recipe_Ingredient\".metric \r\n"
        		+ "FROM public.\"Ingredient\", public.\"Recipe\", public.\"Recipe_Ingredient\"\r\n"
        		+ "WHERE public.\"Ingredient\".id = public.\"Recipe_Ingredient\".id_ingredient\r\n"
        		+ "AND public.\"Recipe\".id = public.\"Recipe_Ingredient\".id_recipe\r\n"
        		+ "AND public.\"Recipe\".id = ?;";
        
        List<Ingredient> ingredients = new ArrayList<Ingredient>();
    	Connection conn;
    	
		try {
			conn = connect();
			
			PreparedStatement stmt = conn.prepareStatement(SQL);
		    stmt.setInt(1, recipe_id);
	    	
	    	ResultSet rs = stmt.executeQuery(); 
		    while(rs.next()) {
		    	Ingredient igt = new Ingredient();
		    	igt.setId(Integer.parseInt(rs.getString("id")));
		    	igt.setName(rs.getString("name"));
		    	String price_str = rs.getString("price");
		    	igt.setPrice(new BigDecimal(price_str));
		    	igt.setQuantity(Float.parseFloat(rs.getString("quantity")));
		    	igt.setMetric(rs.getString("metric"));
		       	ingredients.add(igt);
		    }
		    rs.close();
		    stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        return ingredients;
    }

public Recipe getRecipe(int recipe_id) throws NumberFormatException, ParseException {
	
    String SQL = "SELECT public.\"Recipe\".id, public.\"Recipe\".is_favorited, public.\"Recipe\".name, public.\"Recipe\".photo, public.\"Recipe\".video, public.\"Recipe\".recipe_text, public.\"Recipe\".challenge_level\r\n"
    		+ "FROM public.\"Recipe\"\r\n"
    		+ "WHERE public.\"Recipe\".id = ?;";
    
    Recipe rcp = new Recipe();
    
	Connection conn;
	
	try {
		conn = connect();
		
		PreparedStatement stmt = conn.prepareStatement(SQL);
	    stmt.setInt(1, recipe_id);
    	
    	ResultSet rs = stmt.executeQuery(); 
	    while(rs.next()) {
       		rcp.setId(Integer.parseInt(rs.getString("id")));
       		rcp.setIs_favorited(Boolean.parseBoolean(rs.getString("is_favorited")));
       		rcp.setName(rs.getString("name"));
       		rcp.setPhoto(rs.getString("photo"));
       		rcp.setVideo(rs.getString("video"));
       		rcp.setRecipe_text(rs.getString("recipe_text"));
       		rcp.setChallenge_level(Integer.parseInt(rs.getString("challenge_level")));
	    }
	    rs.close();
	    stmt.close();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
    return rcp;
}


}
