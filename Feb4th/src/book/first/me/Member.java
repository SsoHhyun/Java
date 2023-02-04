package book.first.me;

public class Member {
		String id;
		String name;
		String address;
		Book book;
		
		public Member() {
		}

		public Member(String id, String name, String address, Book book) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		
		
}
