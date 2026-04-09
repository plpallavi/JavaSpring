package com.pallavikri.JobApplication;

import com.pallavikri.JobApplication.model.JobPost;
import com.pallavikri.JobApplication.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @Controller
    public class TestController {

        @GetMapping("/test")
        @ResponseBody
        public String test(){
            return "WORKING";
        }
    }

    @GetMapping({"/","/home" })
    public String home(){
        System.out.println("hit");
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        System.out.println("hit1");
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewJobs(Model m){
        List<JobPost> jobs = service.getAllJobs();
        m.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }
}
