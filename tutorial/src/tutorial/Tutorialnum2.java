package tutorial;
import java.util.ArrayList;
import java.util.*;

public class Tutorialnum2 {
	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("macaroon");
		food.add("burger");
		
		food.set(0,  "sushi");
		food.remove(2);
		food.clear();
		
		for (int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Pasta");
		bakeryList.add("donut");
		bakeryList.add("garlic bread");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("celery");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		
		groceryList.add(produceList);
		groceryList.add(bakeryList);
		groceryList.add(drinksList);
		System.out.println(groceryList);
		System.out.println(groceryList.get(0));
		System.out.println(groceryList.get(0).get(2));	

	}
}
