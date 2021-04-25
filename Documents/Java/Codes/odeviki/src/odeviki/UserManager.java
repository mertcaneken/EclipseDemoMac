package odeviki;

public class UserManager {
	public void addUsers(User user)
	{
		System.out.println(user.name + " kullanıcısı sisteme eklendi...");
	}
	
	public void getUsersId(User user)
	{
		System.out.println(user.name + " adlı kullanıcının id'si: " + user.id);

	}
}
