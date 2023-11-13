package solid.dependency.invercion;

public class LoginWeb implements Login {
	
	private final IDataService dataService;
	
	public LoginWeb(IDataService dataService) {
		this.dataService = dataService;
	}

	@Override
	public String login(String name, String pasword) {
		if(dataService.findUserByNameAndPassword(name, pasword)) {
		   return "produts.jsp";	
		}
		return "error.jsp";
	}
}









