package it2e.waskin.lbb;

import java.util.Scanner;

public class IT2EWASKINLBB {
 public void addStudents(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print("Student id: ");
        String sid = sc.next();
        System.out.print("Student name: ");
        String sname = sc.next();
        System.out.print("Student date: ");
        String sdate  = sc.next();
        System.out.print("Student program: ");
        String sprogram = sc.next();
        System.out.print("Student bookname");
        String sbookname = sc.next();
        System.out.print("Student status: ");
        String status = sc.next();

        String sql = "INSERT INTO students (s_id, s_name, s_date, s_program, s_bookname, s_status) VALUES (?, ?, ?, ?, ?, ?)";
        conf.addRecord(sql, sid, sname, sdate, sprogram, sbookname, status);
 }
 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
            
            System.out.print("Enter action: ");
            int action = sc.nextInt();
            
            switch(action){
                case 1:
                    IT2EWASKINLBB test = new IT2EWASKINLBB();
                    test.addStudents();
            }
            
        }
}

    

        
    
