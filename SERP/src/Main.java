import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException
    {

        int NumberOfRESULTS = 5;
        System.out.println("welcome!, what do you want to search for");
        Scanner query = new Scanner(System.in);
        String answer = query.nextLine();
        String searchURL2 = "https://www.google.com/search?q=" + answer + "&num=5&sxsrf=ALiCzsYS3M8ebrkFl7yG5UK1a-hxp7jdlg%3A1667883038161&source=hp&ei=HuBpY_yRB8n8sAfvhY_4CQ&iflsig=AJiK0e8AAAAAY2nuLhApbQHNWJwJ-e_RNiNJDEKclL_O&ved=0ahUKEwj8mI7A5J37AhVJPuwKHe_CA58Q4dUDCAg&uact=5&oq=dancing&gs_lcp=Cgdnd3Mtd2l6EAMyCAgAEIAEELEDMggIABCxAxCDATIICAAQsQMQgwEyDgguEIAEELEDEMcBEK8BMgsILhCABBCxAxDUAjIICAAQgAQQsQMyCAguELEDEIMBMggIABCABBCxAzIICAAQgAQQsQMyCwgAEIAEELEDEIMBOgQIIxAnOggILhCxAxCABDoICC4QgAQQsQM6CwguEIAEELEDEIMBOgUIABCABDoOCC4QsQMQgwEQxwEQ0QM6CwgAEIAEELEDEMkDOgUILhCABFAAWLgHYPYxaAFwAHgAgAGVAogBqgiSAQUwLjIuM5gBAKABAQ&sclient=gws-wiz";
        Document doc = Jsoup.connect(searchURL2).userAgent("Brave").get();

        Elements links = doc.select("span");

        for (Element link : links) {

            String text = link.text();

            searchThreading thread1 = new searchThreading(1, text);
            thread1.run();

            searchThreading thread2 = new searchThreading(2, text);
            thread2.run();

            searchThreading thread3 = new searchThreading(3, text);
            thread3.run();

            searchThreading thread4 = new searchThreading(4, text);
            thread4.run();

            searchThreading thread5 = new searchThreading(5, text);
            thread5.run();





        }
    }
}