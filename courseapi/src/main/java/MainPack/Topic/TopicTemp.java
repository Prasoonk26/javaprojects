package MainPack.Topic;

public class TopicTemp {

	private String name;
	private String description;
	private String id;
	//{"name":"Spring full  course","description":"bbb","id":"Spring"}
	TopicTemp()
	{
		
	}
	TopicTemp(String name, String description, String id)
	{
		super();
		this.description=description;
		this.id=id;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
