package com.loto_builder.executor;

import org.sikuli.basics.Settings;
import org.sikuli.script.*;

import java.awt.*;
import java.util.List;

public class DesctopOperations {
    private static Screen screen = new Screen();
    private static App app = new App("C:/Users/usada/OneDrive/Desktop/Visual Studio Code");

    public static void fillOutData(List<String> list){
        try {
        String username = "dklokov";
        String password = "a87168814B!";

        Screen screen = new Screen(0);
        screen.setAutoWaitTimeout(10);

        App app = new App("C:/Users/usada/AppData/Local/Programs/Microsoft VS Code/Code.exe");
        app.open();

        Region appWindow = app.window();
        for (int i = 0; i < 200; i++) {
            Region reg = new Region(appWindow.x, appWindow.y, 100, 40);
//            reg.mouseMove();
            if (reg.text().contains("File")) {
                break;
            }
        }

        Pattern usernameInput = new Pattern();
        Pattern passwordInput = new Pattern();
        Pattern newLoto = new Pattern();
        Pattern lotoWithoutStandard = new Pattern();
        Pattern newIsolation = new Pattern();
        Pattern searchInput = new Pattern();
        Pattern searchButton = new Pattern();


            appWindow.find(usernameInput).click();
            screen.type(username);
            appWindow.find(passwordInput).click();
            screen.type(password+"\n");
            Thread.sleep(3000);
            screen.type("\n");

            appWindow.find(newLoto).click();
            appWindow.find(lotoWithoutStandard).click();

            for (String s : list) {
                appWindow.find(newIsolation).click();
                appWindow.find(searchInput).click();
                screen.type(s);
                appWindow.find(searchButton).click();
                appWindow.findText(s).doubleClick();
            }
        } catch (FindFailed e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void fillOutData2(List<String> list){
        try {
            String username = "dklokov";
            String password = "a87168814B!";

            Screen screen = new Screen(0);
            screen.setAutoWaitTimeout(10);

            App app = new App("C:/Users/usada/AppData/Local/Programs/Microsoft VS Code/Code.exe");
            app.open();

            Region appWindow = app.window();
            appWindow.setAutoWaitTimeout(10);
            for (int i = 0; i < 200; i++) {
                Region reg = new Region(appWindow.x, appWindow.y, 100, 40);
//            reg.mouseMove();
                if (reg.text().contains("File")) {
                    break;
                }
            }

            Pattern usernameInput = new Pattern("C:\\Users\\usada\\IdeaProjects\\LOTO_builder\\img.png");
            Pattern passwordInput = new Pattern("C:\\Users\\usada\\IdeaProjects\\LOTO_builder\\img_1.png");
            Pattern newLoto = new Pattern("C:\\Users\\usada\\IdeaProjects\\LOTO_builder\\img_2.png");
            Pattern text = new Pattern("C:\\Users\\usada\\IdeaProjects\\LOTO_builder\\img_3.png");


            appWindow.find(usernameInput).click();
            Thread.sleep(300);
            appWindow.find(passwordInput).click();
            appWindow.find(newLoto).click();
            appWindow.find(text).offset(30,15).click();

            for (String s : list) {
                screen.type(s+"\n");
            }
        } catch (FindFailed e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws Exception {
        Screen screen = new Screen(0);
        Screen screen1 = new Screen(1);
        screen.setAutoWaitTimeout(10);
        App app = new App("C:/Users/usada/AppData/Local/Programs/Microsoft VS Code/Code.exe");
        app.open();
        Thread.sleep(3000);
        Dimension size = screen.getBounds().getSize();
        Dimension size1 = screen1.getBounds().getSize();
        Region appWindow = app.window();
        System.out.println(size.width);
        System.out.println(appWindow.x+60);
        System.out.println(appWindow.y+13);
        for (int i = 0; i < 200; i++) {
            Region reg = new Region(appWindow.x,appWindow.y,100,40);
//            reg.mouseMove();
            if(reg.text().contains("File")){
                break;
            }
            System.out.println(reg.text());
        }

//        Region reg = new Region(appWindow.x+40,appWindow.y+13,40,40);
//        reg.mouseMove();
        Region regi = new Region(appWindow.getX(),appWindow.getY(), 300, appWindow.getH());
        Pattern p = new Pattern("C:\\Users\\usada\\IdeaProjects\\LOTO_builder\\img_4.png");
        regi.find(p).click();
//        regi.findText("MyProject").click();
//        Thread.sleep(300);
//        regi.findText("Draft").click();
//        Thread.sleep(300);
//        regi.findText("objects").click();
        Region r = appWindow.findText("FinishUp");
//        Region r = new Region(100,380,250,50);
//        for (int i = 0; i < 200; i++) {
//            if(r.text().contains("FinishUp")){
//                r.click();
//                break;
//            }
//            Thread.sleep(20);
//
//        }

// r.click();



    }
}
