/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan33.user.login;
import java.util.Scanner;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program User Login
 */
public class IF0110118016Latihan33UserLogin {

    private static String username;
    private static String password;
        
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
                            
        System.out.print("Masukkan Username = ");
        username = scanner.nextLine();
                            
        System.out.print("Masukkan Password = ");
        password = scanner.nextLine();
                            
        //proses
        User user = new User();
        user.pengecekanLogin(username, password);
    }
    
}
