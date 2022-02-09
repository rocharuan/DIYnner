package model;

import java.util.List;

public class Recipe {
	
	private int id;
	
	private String name;
	
	private boolean is_favorited;
	
	private String photo;
	
	private String video;
	
	private String recipe_text;
	
	private int challenge_level;
	
	private List<Ingredient> ingredients;
	
	private Category category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIs_favorited() {
		return is_favorited;
	}

	public void setIs_favorited(boolean is_favorited) {
		this.is_favorited = is_favorited;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getRecipe_text() {
		return recipe_text;
	}

	public void setRecipe_text(String recipe_text) {
		this.recipe_text = recipe_text;
	}

	public int getChallenge_level() {
		return challenge_level;
	}

	public void setChallenge_level(int challenge_level) {
		this.challenge_level = challenge_level;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Recipe(int id, String name, boolean is_favorited, String photo, String video, String recipe_text,
			int challenge_level, List<Ingredient> ingredients, Category category) {
		this.id = id;
		this.name = name;
		this.is_favorited = is_favorited;
		this.photo = photo;
		this.video = video;
		this.recipe_text = recipe_text;
		this.challenge_level = challenge_level;
		this.ingredients = ingredients;
		this.category = category;
	}

	public Recipe() {
	}
	
}
