package tictactoe;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

	Game game = new Game();
	@GetMapping("/tictactoe")
	public String greeting(Model model) {
		
			
		model.addAttribute("game", game);
		return "tictactoe";
	}
	
	@PostMapping("/tictactoe")
	public String moveMade(@ModelAttribute Game test, Model model) {
		
		System.out.println(test.getCellOne());
		//model.addAttribute("game", test);
		
		return "tictactoe";
	}

}
