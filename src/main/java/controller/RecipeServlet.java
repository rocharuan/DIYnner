package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dao.RecipeDAO;
import model.Ingredient;
import model.Recipe;

@WebServlet("/recipe")
public class RecipeServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
	
	
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RecipeDAO dao = new RecipeDAO();
		Recipe recipe = new Recipe();
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		try {
			recipe = dao.getRecipe(id);
			
			ingredients = new ArrayList<Ingredient>();
			ingredients = dao.getIngredients(id);
			recipe.setIngredients(ingredients);
			
		} catch (NumberFormatException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String recipes_json = this.gson.toJson(recipe);
		
		PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(recipes_json);
        out.flush();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
