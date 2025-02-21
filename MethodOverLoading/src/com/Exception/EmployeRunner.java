package com.Exception;

public class EmployeRunner {

        Employe[] employes=new Employe[1];
        public static void main(String[] args)
        {
            EmployeRunner runner=new EmployeRunner();
            Employe emp1=new Employe(1,"ram","development","bangalore");

            System.out.println(runner.saveDetails(emp1));
            Employe emp2=new Employe(2,"raj","development","bangalore");

            System.out.println(runner.saveDetails(emp2));
            Employe e1=runner.fetchDetailsById(1);

        }
        public boolean saveDetails(Employe employe)
        {
            boolean flag=false;
            for(int i=0;i<employes.length;i++)
            {
//                if(employes[i]==)
//                {
//                    throw new NoSpaceToAddEmployeException("array size is full to add details");
//                }
                if(employes[i]==null)
                {
                    employes[i]=employe;

                    flag=true;
                    break;
                }
            }
            return flag;
        }
        public Employe fetchDetailsById(int number)
        {
            for(int i=0;i<employes.length;i++)
            {
                if(employes[i].getEmpId()==number)
                {
                    return employes[i];
                }
            }
            return null;
        }
        public boolean updateDepartmentById(int number,String dept)
        {
            for(int i=0;i< employes.length;i++)
            {
                if(employes[i].getEmpId()==number)
                {
                    employes[i].setDept(dept);
                    return true;
                }
            }
            return false;
        }
        public boolean deleteDetails(int id)
        {
            for(int i=0;i< employes.length;i++)
            {
                if(employes[i].getEmpId()==id)
                {
                    employes[i] = null;
                    return true;
                }
            }
            return false;
        }
    }

