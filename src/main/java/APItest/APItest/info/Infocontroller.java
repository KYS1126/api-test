package APItest.APItest.info;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import APItest.APItest.info.model.Project;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Infocontroller {
	@GetMapping("/info")
	public Object projectinfo () {
		log.debug("/info start");
		
		Project project = new Project();
		project.projectName = "name:yongyong";
		project.author = "Hi~";
		project.creatDate = new Date();
		return project;
	}
}
