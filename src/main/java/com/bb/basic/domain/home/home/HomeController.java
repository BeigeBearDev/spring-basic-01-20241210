package com.bb.basic.domain.home.home;

// home.home 으로 패키지를 구현한 이유는 나중에 사진 30,000개를 폴더 별로 구별하기 위함을 대비. 지금은 중요하지 않음.


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @Controller 어노테이션을 붙여주면 스프링부트가 이 클래스를 컨트롤러로 인식하게 된다.
@Controller
public class HomeController {
    // @GetMapping("/") 어노테이션을 붙여주면 이 메소드는 "/" 경로로 들어왔을 때 실행된다.
    @GetMapping("/")
    // @ResponseBody 어노테이션을 붙여주면 리턴값이 뷰 파일명이 아니라 응답 바디에 들어가게 된다.
    @ResponseBody
    public String showMain() {
        return "안녕하세요.";
    }
}

