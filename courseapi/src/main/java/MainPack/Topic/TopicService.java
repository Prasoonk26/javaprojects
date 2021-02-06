package MainPack.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<TopicTemp>arr=new ArrayList<>(Arrays.asList(new TopicTemp("java course","aaa","JAVA"), 
			new TopicTemp("Spring full course","bbb","Spring"),
			new TopicTemp("Angular tutorial","ccc","Angular")));

    public List<TopicTemp> gettopic()
    {
    	return arr;
    }
    
    public TopicTemp onetopic(String id)
    {
    	return arr.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }
    
    public void addtopic(TopicTemp t)
    {
    	arr.add(t);
    }

}
