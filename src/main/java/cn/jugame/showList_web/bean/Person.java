package cn.jugame.showList_web.bean;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	private String name;
	private String pass;
	private Game game;
	private List<Game> list;
	private Set<Game> set = new HashSet<>();
	private Map<String, Game> map ;
	
	public Person() {
		set.add(new Game());
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "Person[name="+name+ ",pass="+ pass+ "]";
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public List<Game> getList() {
		return list;
	}

	public void setList(List<Game> list) {
		this.list = list;
	}
	
	public Set<Game> getSet(){
		return set;
	}
	
	public void setSet(Set<Game> set){
		this.set = set;
	}

	public Map<String, Game> getMap() {
		return map;
	}

	public void setMap(Map<String, Game> map) {
		this.map = map;
	}
	
	
}
