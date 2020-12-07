package CodeReviewPkg.core.models;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.*;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;

@Model(adaptables=Resource.class, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class HeaderClass {
	@Inject
	String title;

	public String getTitle() {
		return title;
	}
	
	@Inject
	String login;

	public String getLogin() {
		return login;
	}
	
	@Inject
	String register;

	public String getRegister() {
		return register;
	}
	
	@Inject
	String contactus;

	public String getContactus() {
		return contactus;
	}
	
	List<String> str=new ArrayList<String>();
	@PostConstruct
	protected void init()
	{
	str.add("Hello");
	
	str.add("User");
	}
	
	public List<String> getList()
	{
		return str;
	}
}





