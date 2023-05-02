package APItest.APItest.info;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@RestController
public class InfoController2 {

	@GetMapping("/info2")
	public String projectInfo2() {
		JsonObject jo = new JsonObject();
		
		jo.addProperty("projectName", "restapi");
		jo.addProperty("author", "yong");
		jo.addProperty("createDate", new Date().toString());
		
		JsonArray ja = new JsonArray();
		for(int i=0; i<5; i++) {
			JsonObject job = new JsonObject();
			job.addProperty("prop"+i, i);
			ja.add(job);
		}
		
		jo.add("array", ja);
		
		return jo.toString();
	}
	
	
}
