package it2e.waskin.lbb;

import java.util.Scanner;

public class IT2EWASKINLBB {
 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String response;

                        
            do{
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
            
            System.out.print("Enter action: ");
            int action = sc.nextInt();
            
            
            
            IT2EWASKINLBB student = new IT2EWASKINLBB();
            
            switch(action){
                case 1:
                   student.addStudents();
                   break;
                   
                case 2:
                    student.viewStudents();
                   break;
                
                case 3:
                    student.updateStudents();
                    student.viewStudents();
                    break;
                    
                case 4:
                    student.viewStudents();
                    student.deleteStudents();
                    student.viewStudents();
                    break;
                    
                case 5:
                    System.out.println("Existing....");
                    break;
                    
                default:
                    System.out.println("Invalid action.Please try again.");         
            }
            System.out.println("Do you want to contimue? (yes/no): ");
            response = sc.next();
            }while (response.equalsIgnoreCase("yes"));
            System.out.println("Thank you, See you soonest!");
           
        }
        
        public void addStudents(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print("Student id: ");
        int sid = sc.nextInt();
        
        System.out.print("Student name: ");
        String sname = sc.next();
        
        System.out.print("Student date: ");
        String sdate  = sc.next();
        
        System.out.print("Student program: ");
        String sprogram = sc.next();
        
        System.out.print("Student bookname: ");
        String sbookname = sc.next();
        
        System.out.print("Student status: ");
        String status = sc.next();

        String sql = "INSERT INTO students (s_id, s_name, s_date, s_program, s_bookname, s_status) VALUES (?, ?, ?, ?, ?, ?)";
        conf.addRecord(sql, sid, sname, sdate, sprogram, sbookname, status);
 }
        
        private void viewStudents(){
            config conf = new config();
            
            String qry = "SELECT * FROM students";
            String[] header = {"ID", "Name", "Date", "Program", "Bookname", "Status"};
            String[] column = {"s_id", "s_name", "s_date", "s_program", "s_bookname", "s_status"};
                    
            conf.viewsRecord(qry, header, column);
        }
        
        
        public void updateStudents(){
            Scanner scan = new Scanner (System.in);
            config conf = new config();
            
            System.out.print("Enter Id to update: ");
            int sid = scan.nextInt();
            
            System.out.print("Student name: ");
            String sname = scan.next();

            System.out.print("Student date: ");
            String sdate  = scan.next();

            System.out.print("Student program: ");
            String sprogram = scan.next();

            System.out.print("Student bookname: ");
            String sbookname = scan.next();

            System.out.print("Student status: ");
            String status = scan.next();
            
            String qry = "UPDATE students SET s_name = ?, s_date = ?, s_program = ?, s_bookname = ?, s_status = ?   WHERE s_id = ?";
            
            conf.updateRecord(sname, sdate, sprogram, sbookname, status);
        
        }
        public void deleteStudents(){
            Scanner scan = new Scanner (System.in);
            config conf = new config();
            
            System.out.print("Enter Id to update: ");
            int sid = scan.nextInt();
            
            String qry = "DELETE FROM students Where s_id = ?";
            conf.deleteRecord(qry, sid);
           
        }
        
}
       
