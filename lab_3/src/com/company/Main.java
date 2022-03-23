package com.company;

public class Main {

    public static void main(String[] args) {
        Folder disk = new Folder(":/D");
        disk.add(new Folder("Bsuir"));
        disk.add(new Folder("Downloads"));

        String content;

        disk.getChild(0).add(new Folder("AiSD"));
        disk.getChild(0).getChild(0).add(new File("task6.cpp"));
        content = "int main() { printf(\"Code for 6th task\"); }";
        disk.getChild(0).getChild(0).getChild(0).setContent(content);


        disk.getChild(0).getChild(0).add(new File("smth.cpp"));
        content = "int main() { printf(\"text for this file\"); }";
        disk.getChild(0).getChild(0).getChild(1).setContent(content);


        disk.getChild(0).add(new Folder("M4A"));
        disk.getChild(0).getChild(1).add(new File("8.py"));
        content = "print(\"something for 8 task\")";
        disk.getChild(0).getChild(1).getChild(0).setContent(content);

        disk.getChild(0).getChild(1).add(new File("stuff.py"));
        content = "print(\"common! u r the best!\")";
        disk.getChild(0).getChild(1).getChild(1).setContent(content);

        disk.getChild(1).add(new Folder("Photoshop"));
        disk.getChild(1).getChild(0).add(new File("Photoshop.exe"));
        disk.getChild(1).add(new Folder("Photoshop Premium"));
        disk.getChild(1).getChild(1).add(new File("Photoshop Premium.exe"));
        disk.getChild(1).add(new Folder("Photoshop VIP"));
        disk.getChild(1).getChild(2).add(new File("Photoshop VIP.exe"));
        disk.getChild(1).add(new Folder("Photoshop Community"));
        disk.getChild(1).getChild(3).add(new File("Photoshop Community.exe"));
        disk.getChild(1).add(new Folder("Photoshop Standart"));
        disk.getChild(1).getChild(4).add(new File("Photoshop Standart.exe"));

        disk.printContent();
        disk.delete("Bsuir/AiSD");
        System.out.println("\n");
        disk.printContent();
        System.out.println("\n");
        disk.delete("Downloads/Photoshop Standart");
        disk.printContent();
        System.out.println("\n");
        disk.printOne("Bsuir/M4A");
        System.out.println("\n");

        disk.printOne("Bsuir/M4A/8.py");
        System.out.println("\n");

        disk.getByPath("Bsuir/M4A/8.py").setName("8(RENAMED).py");
        disk.printContent();
        System.out.println("\n");

        disk.getByPath("Downloads/Photoshop Community").setContent((disk.getByPath("Bsuir/M4A")).getContent());
        disk.printContent();
        System.out.println("\n");
    }
}
