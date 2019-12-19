/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphExampleDijkstra;


/**
 * @author: https://github.com/Satshabad/Simple-Graph-Implementation/blob/master/src/Graph.java
 * @version Dec 15, 2018
 * (c) HAN University 
 * Instituut Toegepaste Biologie en Chemie
 * Bio-informatica
 * 
 */

import java.util.ArrayList;


public class Edge<V> {

	private V vertex;
	
	private int weight;
	
	public Edge(V vert, int w) {
		vertex = vert;
		weight = w;
	}

	public V getVertex() {
		return vertex;
	}

	public void setVertex(V vertex) {
		this.vertex = vertex;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString(){
		
		return "( "+ vertex + ", " + weight + " )";
	}

}