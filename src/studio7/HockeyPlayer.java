package studio7;

public class HockeyPlayer {
	private String name;
	private int number;
	private String shootingSide;
	private int goals;
	private int assists;
	private int points;
	private int games;
	
	// Constructor
	public HockeyPlayer(String name, int number, String shootingSide, int goals, int assists, int games) {
		this.name = name;
		this.number = number;
		this.shootingSide = shootingSide;
		this.goals = goals;
		this.assists = assists;
		this.points = assists + goals;
		this.games = games;
	}
	
	// Getter methods
	
	public String getName() {
		return this.name;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getShootingSide() {
		return this.shootingSide;
	}
	
	public int getGoals() {
		return this.goals;
	}
	
	public int getAssists() {
		return this.assists;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public int getGames() {
		return this.games;
	}
	
	// setter methods
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setShootingSide(String side) {
		this.shootingSide = side;
	}
	
	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	public void setAssists(int assists) {
		this.assists = assists;
	}
	
	public void setPoints(int goals, int assists) {
		this.points = goals + assists;
	}
	
	public void setGames(int games) {
		this.games = games;
	}
	
}
