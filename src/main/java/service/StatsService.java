package service;


import java.util.Set;

import domaine.PointT;
import domaine.Stats;

public class StatsService {

	public Stats calcStats (Set<PointT> pointsT) {
		Stats stats = new Stats();
		stats.setN(pointsT.size());
		stats.setRangeT(calcRangeT(pointsT));
		stats.setPasT(calcPasT(stats.getN(),stats.getRangeT()));
		stats.setPasF(calcPasF(stats.getRangeT()));
		stats.setRangeF(calcRangeF(stats.getPasT()));
		return stats;
	}
	

	
	private double calcRangeT (Set<PointT> pointsT) {
		double distMax2 = 0;
		for(PointT p1:pointsT){
			for(PointT p2:pointsT){
				if((Math.pow(p1.getT()-p2.getT(), 2))>distMax2) {
					distMax2 = Math.pow(p1.getT()-p2.getT(), 2);
				}
			}
		}
		
		return Math.pow(distMax2,0.5);
	}
	
	private double calcPasT (int n, double rangeT) {
		return rangeT/(n-1);
	}
	
	private double calcPasF (double rangeT) {
		return 1/rangeT;
	}
	
	private double calcRangeF (double pasT) {
		return 1/pasT;
	}
	
}
