package com.SpringBootWeb.SpringBootWebDemo;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }

    @RequestMapping("/")
    public String home(){
        System.out.println("In home method");
        return "index";
    }

    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session)
//    public String add(@RequestParam("num1") int num, int num2, HttpSession session)
//        public String add(int num1, int num2, Model model)
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {

        System.out.println("in add");
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));

        int result = num1 + num2;

//        session.setAttribute("result", result);
//        model.addAttribute("result", result);
        mv.addObject("result", result);
        mv.setViewName("result");


//        return "result";
        return mv;
    }
        @RequestMapping("addUser")
//        public ModelAndView addUser(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv) {
//            User user = new User();
//            user.setAid(aid);
//            user.setAname(aname);
//            mv.addObject("user", user);
//            mv.setViewName("result");
//            public String addAlien(@ModelAttribute User user)
        public String addAlien( User user){
            return "result";
        }
}