package video.me;

public class Vip extends Member {
	int bonus;
	
	public Vip() {
	}

	public Vip(String id, String name, int age, int bonus) {
		super(id, name, age);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("보너스 적립: " + bonus);
	}

	@Override
	public void rental(Video video) {
		super.rental(video);
		bonus += 10;
	}
	
	
	
	
	
	
}
