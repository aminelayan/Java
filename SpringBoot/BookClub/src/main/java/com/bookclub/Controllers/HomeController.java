package com.bookclub.Controllers;

import com.bookclub.Models.Book;
import com.bookclub.Models.LoginUser;
import com.bookclub.Models.User;
import com.bookclub.Services.BookService;
import com.bookclub.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;
    @Autowired
    private BookService bookService;



    @GetMapping("/")
    public String index(Model model, HttpSession session) {

        if (session.getAttribute("userId")!=null) {
            return "redirect:/books";}

        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser,
                           BindingResult result, Model model, HttpSession session) {

        // TO-DO Later -- call a register method in the service
        // to do some extra validations and create a new user!
        User user=userService.register(newUser,result);

        if(result.hasErrors()) {
            // Be sure to send in the empty LoginUser before
            // re-rendering the page.
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }

        // No errors!
        // TO-DO Later: Store their ID from the DB in session,
        // in other words, log them in.
        session.setAttribute("userID",user.getId());
        return "redirect:/books";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin,
                        BindingResult result, Model model, HttpSession session) {

        // Add once service is implemented:
        User user = userService.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }

        // No errors!
        // TO-DO Later: Store their ID from the DB in session,
        // in other words, log them in.
        session.setAttribute("userId",user.getId());
        return "redirect:/books";
    }
    @GetMapping("/books")
    public String showHome(Model model, HttpSession session) {

        if (session.getAttribute("userId")!=null) {
            Long userId= (Long) session.getAttribute("userId");
            User currentUser=userService.findByID(userId);
            model.addAttribute("currentUser", currentUser);
            List<Book> books=bookService.allBooks();
            model.addAttribute("books", books);

            return "home.jsp";
        }
        return "redirect:/";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }

    @GetMapping("/books/new")
    public String createBook(@ModelAttribute("newBook") Book newBook, HttpSession session) {
        if (session.getAttribute("userId")!=null) {
            Long userId= (Long) session.getAttribute("userId");
            User currentUser=userService.findByID(userId);
            return "newBook.jsp";
        }
        return "redirect:/";
    }

    @PostMapping("/books/new")
    public String addNewBook(@Valid @ModelAttribute("newBook") Book newBook, BindingResult result,  HttpSession session) {

        if (result.hasErrors()) {
            return "newBook.jsp";
        }
        else {
            Long userId= (Long) session.getAttribute("userId");
            User currentUser=userService.findByID(userId);
            newBook.setPostedBy(currentUser);
            bookService.createBook(newBook);
            return "redirect:/books";
        }
    }

    @GetMapping("books/{id}")
    public String showProduct(@PathVariable("id") Long id, Model model, HttpSession session) {
        if (session.getAttribute("userId")!=null) {
            Long userId= (Long) session.getAttribute("userId");
            model.addAttribute("currentUserId", userId);
            Book theBook = bookService.findBook(id);
            Long postedById=theBook.getPostedBy().getId();
            model.addAttribute("postedByUserId", postedById);
            model.addAttribute("certainBook", theBook);
            return "showbook.jsp";
        }
        return "redirect:/";
    }

}


