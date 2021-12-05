
package ru.gb.onlineShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.gb.onlineShop.entity.User;
import ru.gb.onlineShop.service.UserDetailServiceImpl;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


@Controller
public class MainController {

    private final UserDetailServiceImpl userServiceImpl;
    private final User user;

    @Autowired
    public MainController(UserDetailServiceImpl userServiceImpl, User user) {
        this.userServiceImpl = userServiceImpl;
        this.user = user;
    }


    @GetMapping("/")
    public String homePage(Model model) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.getDefault());
        model.addAttribute("serverTime", dateFormat.format(new Date()));
        return "index";
    }

    @GetMapping("/login")
    public String authPage() {

        return "login";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("userDto", new User());
        return "register";
    }

    /*@PostMapping("/register")
    public String registerPage(@Valid @ModelAttribute("userDto") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "register";
        }
        if (!user.getPassword().equals(user.getRepeatPassword())) {
            bindingResult.rejectValue("password", "", "Пароли не совпадают");
            return "register";
        }

        userServiceImpl.create(user);

        return "redirect:/";*/
    }

