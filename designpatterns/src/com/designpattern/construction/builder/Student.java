package com.designpattern.construction.builder;

public class Student {
	private int rollNo;
	private String name;
	private String email;
	private String courceName;
	private int rank;

	public Student(StudentBuilder builder) {
		this.rollNo = builder.rollNo;
		this.name = builder.name;
		this.email = builder.email;
		this.courceName = builder.courceName;
		this.rank = builder.rank;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getCourceName() {
		return courceName;
	}

	public int getRank() {
		return rank;
	}

	static class StudentBuilder {
		private int rollNo;
		private String name;
		private String email;
		private String courceName;
		private int rank;

		public StudentBuilder() {

		}

		public StudentBuilder setRollNo(int rollNo) {
			this.rollNo = rollNo;
			return this;
		}

		public StudentBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public StudentBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public StudentBuilder setCourceName(String courceName) {
			this.courceName = courceName;
			return this;
		}

		public StudentBuilder setRank(int rank) {
			this.rank = rank;
			return this;
		}

		public Student build() {
			return new Student(this);
		}

	}

}
