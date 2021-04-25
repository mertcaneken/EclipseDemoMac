package odeviki;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Doğancan", "dodo@gmail.com", "1907gs1907", 18);
		User user2 = new User(2, "Ergün Çamur", "erguncamur@gmail.com", "erguncamur41", 41);
		User user3 = new User(3, "Niyazi Durmuş", "niyazidurmus@gmail.com", "çamağacı", 48);
		
		Category category1 = new Category(1,"C# + Angular","Engin Demiroğ");
		Category category2 = new Category(2,"Java + React","Engin Demiroğ");
		Category category3 = new Category(3,"Proglamlamaya Giriş Temel Kursu","Engin Demiroğ");
		
		UserManager userManager = new UserManager();
				
		
		
		User[] users = {user1,user2,user3};
		Category[] categorys = {category1,category2,category3};
		
		for (User user : users) 
		{
			System.out.println(user.name);
		}
		
		System.out.println("---------------------------------------------------");
		
		
		for(Category category : categorys )
		{
			System.out.println(category.courseName);
		}
		
		System.out.println("---------------------------------------------------");
		
		userManager.addUsers(user2);
		userManager.addUsers(user1);
		
		System.out.println("---------------------------------------------------");
		
		userManager.getUsersId(user1);
		userManager.getUsersId(user3);
		
	}

}
