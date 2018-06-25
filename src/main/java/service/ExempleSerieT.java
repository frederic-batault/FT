package service;

import java.util.HashSet;
import java.util.Set;

import domaine.PointT;

public class ExempleSerieT {
	
	public Set<PointT> creerSerie (){
		Set<PointT> serie = new HashSet<PointT>();
		PointT p1 = new PointT (0,10);
		PointT p2 = new PointT (1,20);
		PointT p3 = new PointT (2,10);
		serie.add(p1);
		serie.add(p2);
		serie.add(p3);
		return serie;
	}
}
