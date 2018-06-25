package exposition;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domaine.PointF;
import domaine.PointT;
import domaine.Stats;
import service.ExempleSerieT;
import service.FtService;
import service.StatsService;

@RestController
@RequestMapping("/fft")
public class Ws {

	@Autowired
	private ExempleSerieT exempleSerieT;
	
	@Autowired
	private StatsService statsService;
	
	@Autowired
	private FtService ftService;
	
	@GetMapping("/exemple")
	public Set<PointT> donnerExemple(){
		return exempleSerieT.creerSerie();
	}
	
	@PutMapping("/stats")
	public Stats donnerStats (@RequestBody Set<PointT> pointsT) {
		return statsService.calcStats(pointsT);
	}
	
	@PutMapping("/transform")
	public Set<PointF> donnerFt (@RequestBody Set<PointT> pointsT) {
		return ftService.calcFt(pointsT);
	}
	
	@PutMapping("/fenetre")
	public Set<PointT> donnerFenetre (@RequestBody Set<PointT> pointsT) {
		return ftService.fenetrer(pointsT);
	}
	
}
