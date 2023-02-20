package video.me;

public class VideoMain {
	public static void main(String[] args) {
	Video v = new Video(2, "친절한 금자씨", "이영애");
//	m.rental(v);
//	m.show();
	Video v2 = new Video(3, "올드보이", "최민식");
	
	Member[] arr = {
			new Member("dfdf", "김소현", 28),
			new Vip("dddd", "김민주", 21, 30)
	};
	
	for(int i = 0; i < arr.length; i++) {
		arr[i].rental(v);
		arr[i].show();
	}

	}
}
