/* 1. Create interfaces Student and Sports. Create
a class Result implements Student and Sports.
Display the academic and sports score of a
student.*/

interface student{
	int score=10;
	void displayScore();
}

interface sports{
	int score=25;
	void displaySportsScore();
}

class result implements student,sports{
	public void displayScore(){
		System.out.println("Academic score =" + student.score);
}
	public void displaySportsScore(){
		System.out.println("Sports score =" +sports.score);
}
}

class SportsStudentResult{
	public static void main(String args[]){
		result obj1=new result();
		System.out.println("---sports student result---\n");
		obj1.displayScore();
		obj1.displaySportsScore();
		}
		}





/*OUTPUT

---sports student result---

Academic score =10
Sports score =25

