package com.Telstra;

import java.util.Objects;

public class Date1 {
   
	
	private int dd;
	private int mm;
	private int yyyy;
	
	
	public Date1(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}


	@Override
	public String toString() {
		return "Date1 [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(dd, mm, yyyy);
	}


	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date1 other = (Date1) obj;
		return dd == other.dd && mm == other.mm && yyyy == other.yyyy;
	}*/
	
	@Override
	public boolean equals(Object obj) {
	     
		Date1 date = (Date1)(obj);
		  
		 if(this.dd == date.dd  && this.mm == date.mm && this.yyyy == date.yyyy) return true;
		 
		 else return false;
	}
	
	
	
}
