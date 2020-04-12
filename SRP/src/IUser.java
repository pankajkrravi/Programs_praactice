
public interface IUser {
	boolean Login(String username, String pasword);

	boolean Register(String username, String password, String email);
}

interface ILogger {
	void LogError(String error);
}

interface IEmail {
	boolean SendEmail(String email);
}
