package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController
{
  private final JokeService jokeService;

  public JokeController(JokeService _jokeService)
  {
    jokeService = _jokeService;
  }

  @RequestMapping({"/", ""})
  public String showJoke (Model _model)
  {
    _model.addAttribute("joke", jokeService.getJoke());

    return "index";
  }
}
