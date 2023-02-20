package book.me;

public class Vip extends Member {
	int bonus;
	
	public Vip() {
	}

	public Vip(String id, String name, int age, int bonus) {
		super(id, name, age);
		this.bonus = bonus;
	}
	
	

	@Override
	public void rental(Book b) {
		super.rental(b);
		bonus += 10;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("보너스 점수: " + bonus);
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	

	
}
