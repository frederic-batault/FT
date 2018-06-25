package service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import domaine.PointF;
import domaine.PointT;
import domaine.Stats;

public class FtService {
	
	@Autowired
	private StatsService statsService;
	
	public Set<PointF> calcFt (Set<PointT> pointsT){
		Set<PointF> pointsF = new HashSet<PointF>();
		Stats stats =  statsService.calcStats(pointsT);
		Set<PointT> pointsTf = fenetrer(pointsT);	
		
		for(double f=0; f<stats.getRangeF();f=f+stats.getPasF()) {
			double yRe = 0;
			double yIm = 0;
			for(PointT pointT:pointsTf) {
				double dyRe=pointT.getY()*Math.cos(2*Math.PI*f*pointT.getT()/stats.getN());
				double dyIm=pointT.getY()*Math.sin(2*Math.PI*f*pointT.getT()/stats.getN());
				yRe = yRe + dyRe;
				yIm = yIm + dyIm;
			}
			
			double yMod = Math.pow(Math.pow(yRe,2)+Math.pow(yIm,2),0.5);
			PointF pointF = new PointF(f,yRe,yIm,yMod);
			pointsF.add(pointF);
		}
		return pointsF;
	}
	
	public Set<PointT> fenetrer (Set<PointT> pointsT){
		Set<PointT> pointsTfen = new HashSet<PointT>();
		for(PointT pointT:pointsT) {
			double yfen = pointT.getY()*(Math.cos(Math.PI*(pointT.getT()-(statsService.calcStats(pointsT).getRangeT()/2))/(statsService.calcStats(pointsT).getRangeT())));
			PointT pointTfen = new PointT(pointT.getT(),yfen);
			pointsTfen.add(pointTfen);
		}
		return pointsTfen;
	}
}
