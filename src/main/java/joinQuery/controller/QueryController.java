package joinQuery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import joinQuery.dom.StudentDetail;
import joinQuery.model.StudentEntity;
import joinQuery.services.QueryService;

@RestController
@RequestMapping("/api")
public class QueryController {
	
	@Autowired
	QueryService queryservice;
	
	@GetMapping("/joinQuery")
	public List<StudentDetail> getQuery(){
		return queryservice.JPQLQuery();
	}
	
	@GetMapping("/studentData")
	public List<StudentEntity> getStudentData(){
		return queryservice.studentAllData();
	}

}
