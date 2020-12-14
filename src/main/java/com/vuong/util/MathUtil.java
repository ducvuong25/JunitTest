/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuong.util;

import java.util.ArrayList;
import java.util.List;

public class MathUtil {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "vuong", 20));
        users.add(new User(2, "dung", 15));
        users.add(new User(3, "nhi", 12));
    }

    public static int getTotal(int a, int b) {
        return a + b;
    }

    public static int getQuotient(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("loi chia cho khong");
        }
        return a / b;
    }

    public static boolean IsEvenNumber(int a) {
        return a % 2 == 0;
    }

    public static User getUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
// tinh tong cac so tu 1 den n

    public static int countCharacter(String string) {
        return string.length();
    }


}
