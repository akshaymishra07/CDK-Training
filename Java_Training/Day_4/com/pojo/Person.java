package com.pojo;

public class Person {
         private int id;
         private String name;
         
         public Person() {
			// TODO Auto-generated constructor stub
		}

		public Person(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + "]";
		}
         
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			
		Person	person = (Person) obj;
			
			if(this.id == person.getId()) {
				return true;
			}
			
			return false;
		}
         
}
