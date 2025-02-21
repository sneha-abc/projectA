package com.Exception;

public class StudentRunner {
    Student[] students=new Student[1];
    public static void main(String[] args){

        StudentRunner runner = new StudentRunner();

        Student student1 = new Student(1,"sneha","jnnce","ETE");
        System.out.println(runner.saveDetails(student1));

try {
    Student student2 = new Student(2, "sujay", "BMSE", "ME");
    System.out.println(runner.saveDetails(student2));
}
catch (ArrayIndexOutOfBoundsException e){
    e.printStackTrace();
}

        Student s1=runner.fetchDetailsById(1);
        System.out.println(s1.getName());

    }
    public boolean saveDetails(Student student) throws NoSpaceToAddStudentException
    {
        boolean isSaved=false;
        for(int i=0;i<=students.length;i++)
        {

            if(i>=students.length)
            {
            throw new NoSpaceToAddStudentException("array size is full");
            }



            if(students[i]==null)
            {
                students[i]=student;

                isSaved=true;
                break;
            }
        }
        return isSaved;
    }
    public Student fetchDetailsById(int id)
    {
        for(int i=0;i<students.length;i++)
        {
            if(students[i].getId()==id)
            {
                return students[i];
            }
        }
        return null;
    }

    public boolean updateNameById(int id,String name)
    {
        for(int i=0;i< students.length;i++)
        {
            if(students[i].getId()==id)
            {
                students[i].setName(name);
                return true;
            }
        }
        return false;
    }

    public boolean deleteDetails(int id)
    {
        for(int i=0;i< students.length;i++)
        {
            if(students[i].getId()==id)
            {
                students[i] = null;
                return true;
            }
        }
        return false;
    }

}
