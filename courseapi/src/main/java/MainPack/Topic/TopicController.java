package MainPack.Topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
@Autowired	
private TopicService topicservice;

@RequestMapping("/topics")
public List <TopicTemp> topics()
{
 return topicservice.gettopic();
}

@RequestMapping("/topics/{id}")
public TopicTemp topic(@PathVariable String id)
{
 return topicservice.onetopic(id);
}

@RequestMapping(method=RequestMethod.POST, value = "/topics")
public void posttopic(TopicTemp t) 
{
	topicservice.addtopic(t);
}

}
