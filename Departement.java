package departementpackage;

import employeepackage.Admin;

public class Departement
{
  public int deptID;
  private String Deptname;
  public Departement(int deptID,String Deptname)
  {
    this.deptID = deptID;
    this.Deptname = Deptname;
}
  
public void display()
{
	System.out.println("departement id: "+deptID);
	System.out.println("departement name: "+Deptname);
}
}
