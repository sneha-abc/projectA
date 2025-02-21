package com.Operations;
//to access non static method from static method we need to create object
public class PersonRunner {
    Person[] persons = new Person[10];//array declaration
    public static void main(String[] args)
    {
        PersonRunner runner=new PersonRunner();//object creation
//Person is class person1 is object.

        System.out.println("object 1");
        //Person is class person1 is object.
        Person person1 = new Person(1,"sneha","haveri","sneha@gmail.com");//object creation with constructor initialization
        System.out.println(runner.saveDetails(person1));//saving details in index 0
        Person p1=runner.fetchDetailsByEmail("sneha@gmail.com");//storing  array in variable-to print all the properties we are storing in a variable
        System.out.println(p1.toString());//fetching p1 properties by using email


        System.out.println(runner.updateNameByEmail("sneha@gmail.com","sujay"));
        System.out.println(p1.getId());
        System.out.println(p1.getName());
        System.out.println(p1.getPlace());
        System.out.println(p1.getEmail());


        System.out.println(runner.deleteDetails("sneha@gmail.com"));
        Person d=runner.fetchDetailsByEmail("sneha@gmail.com");//we get null pointer exception
        //System.out.println(d.toString());

        System.out.println("object 2");

        Person person2 = new Person(2,"sagar","mysore","sagar@gmail.com");
        System.out.println(runner.saveDetails(person2));
        Person p2=runner.fetchDetailsByEmail("sagar@gmail.com");
        System.out.println(p2.toString());


        System.out.println("object 3");

        Person person3 = new Person(3,"ram","bangalore","ram@gmail.com");
        System.out.println(runner.saveDetails(person3));
        Person p3=runner.fetchDetailsByEmail("ram@gmail.com");
        System.out.println(p3.toString());

        System.out.println("object 4");

        Person person4 = new Person(4,"ramesh","hassan","ramesh@gmail.com");
        System.out.println(runner.saveDetails(person4));
        Person p4=runner.fetchDetailsByEmail("ramesh@gmail.com");
        System.out.println(p4.toString());

        System.out.println("object 5");

        Person person5 = new Person(5,"jim","Hakkins","jim@gmail.com");
        System.out.println(runner.saveDetails(person5));
        Person p5=runner.fetchDetailsByEmail("jim@gmail.com");
        System.out.println(p5.toString());


        System.out.println("object 6");

        Person person6 = new Person(6,"el","hubli","el@gmail.com");
        System.out.println(runner.saveDetails(person6));
        Person p6=runner.fetchDetailsByEmail("el@gmail.com");
        System.out.println(p6.toString());


        System.out.println("object 7");

        Person person7 = new Person(7,"will","dharwad","will@gmail.com");
        System.out.println(runner.saveDetails(person7));
        Person p7=runner.fetchDetailsByEmail("will@gmail.com");
        System.out.println(p7.toString());


        System.out.println("object 8");

        Person person8 = new Person(8,"lucus","harihar","lucus@gmail.com");
        System.out.println(runner.saveDetails(person8));
        Person p8=runner.fetchDetailsByEmail("lucus@gmail.com");
        System.out.println(p8.toString());

        System.out.println("object 9");

        Person person9 = new Person(9,"mike","hampi","mike@gmail.com");
        System.out.println(runner.saveDetails(person9));
        Person p9=runner.fetchDetailsByEmail("mike@gmail.com");
        System.out.println(p9.toString());


        System.out.println("object 10");

        Person person10 = new Person(10,"nancy","mangalore","nancy@gmail.com");
        System.out.println(runner.saveDetails(person10));
        Person p10=runner.fetchDetailsByEmail("nancy@gmail.com");
        System.out.println(p10.toString());



    }
    public boolean saveDetails(Person person)//(class object like p1/p2/p3..)
    {
        boolean isSaved=false;
        for(int i=0;i< persons.length;i++)
        {
            if(persons[i]==null)
            {
                persons[i]=person;
                isSaved=true;
                break;
            }
        }
        return isSaved;
    }
    public Person fetchDetailsByEmail(String email)
    {
        for(int i=0;i<persons.length;i++)
        {
            if(persons[i]!= null && persons[i].getEmail()==email)
            {
                return persons[i];
            }
        }
        return null;
    }
    public boolean updateNameByEmail(String email,String name)
    {
        for(int i=0;i< persons.length;i++)
        {
            if(persons[i] != null && persons[i].getEmail()==email)
            {
                persons[i].setName(name);
                return true;
            }
        }
        return false;
    }
    public boolean deleteDetails(String email)
    {
        for(int i=0;i< persons.length;i++)
        {
            if(persons[i] != null && persons[i].getEmail()==email)
            {
                persons[i] = null;
                return true;
            }
        }
        return false;
    }

}
