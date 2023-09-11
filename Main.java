class student
        {
            String name ;
            int age;
            public void Printinfo()
        {
            System.out.println(this.name);
            System.out.println(this.age);
        }
        public class Opps
        {
            public static void main ( String args[]){
                student a= new student();
                a.name="Ashutosh";
                a.age=22;
                a.Printinfo();
            }
        }
        }