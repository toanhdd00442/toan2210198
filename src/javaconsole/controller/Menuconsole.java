/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsole.controller;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Menuconsole {
    public static void main(String[] args) {
        Menuconsole menu = new Menuconsole();
        menu.createMenu();
    }
    public void createMenu(){
        while(true){
            System.out.println("=======Student Manage=======");
            System.out.println("1.Student list."); 
            System.out.println("2 Add Student.");
            System.out.println("3 Edit Student.");
            System.out.println("4 Delete Student.");
            System.out.println("5 Edit.");
            System.out.println("=============================");
            System.out.println("Please enter your choice:");
            Scanner scanner = new Scanner(System.in);
            //Yêu cầu nguời dùng nhập chuỗi kí tự,gán giá trị người dùng nhập vào
            //ra biến kiểu chuỗi là strChoice.
            String strChoice = scanner.nextLine();
            System.out.println(strChoice); 
            //kiểm tra dữ liệu người dùng nhập vào có phải số hay không
            //trong trường hợp không phải là số thì thông báo người dùng và bắt đầu lại vòng lặp
            int choice=0;
            try {
                //Ép kiểu của biến strChoice về int
                choice =Integer.parseInt(strChoice);
                System.out.println("Choice :" +choice);
               
            }catch (java.lang.NumberFormatException e){
                //Cần có phần lưu log ở đây.
                System.err.println("Please enter a number");
                continue;
            }
            StudentController studentController =new StudentController();
            if(choice==5){
                break;
                
            }else{
                
                
            switch (choice){
                case 1 :
                  
                    studentController.getList();
                    break;
                case 2:
                    studentController.editStudent();
                    break;
                    
                case 3:
                    studentController.editStudent();
                    break;
                case 4:
                    studentController.deleteStudent();
                    break;
                default:
                    System.out.println("Please enter number from 1 to 5.");
                    break;
                    
            }
            }
                
                
                
                
                
                
                
            
        }
    }
}

