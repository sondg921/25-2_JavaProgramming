package Homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        try {
            FileReader fr = new FileReader("db.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                String id = line.strip();
                line = br.readLine();
                String key = line.strip();
                line = br.readLine();
                map.put(id, key);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = new Scanner(System.in).nextLine();
            id = id.trim();

            if(!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            }
            else {
                System.out.print("password : ");
                String pwd = new Scanner(System.in).nextLine();
                pwd = pwd.trim();
                if(!map.get(id).equals(pwd)) {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                }
                else{
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
            }
            System.out.println();
        }
    }
}
