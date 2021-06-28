package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file nguồn: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Nhập đường dẫn file copy: ");
        String targetFile = scanner.nextLine();

        ReadAndCopy readfileEx = new ReadAndCopy();
        readfileEx.readText(sourcePath, targetFile);
    }
}
