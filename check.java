import java.io.*;

class check {
    public static void main(String args[]) throws IOException {
        int g = 0, h = 0, j = 0, k = 0;
        int s = 0;

        // Read votes from UIT.txt
        try {
            FileInputStream f1 = new FileInputStream("UIT.txt");
            BufferedInputStream b1 = new BufferedInputStream(f1);
            int i;
            while ((i = b1.read()) != -1)
                s++;
            f1.close();
            System.out.println("Total vote of UIT=" + s);
        } catch (Exception e) {
            System.out.println(e);
        }

        // Read votes from UCER.txt
        try {
            FileInputStream f2 = new FileInputStream("UCER.txt");
            BufferedInputStream b2 = new BufferedInputStream(f2);
            int z;
            while ((z = b2.read()) != -1)
                g++;
            f2.close();
            System.out.println("Total vote of UCER=" + g);
        } catch (Exception e) {
            System.out.println(e);
        }

        // Read votes from UCEM.txt
        try {
            FileInputStream f3 = new FileInputStream("UCEM.txt");
            BufferedInputStream b3 = new BufferedInputStream(f3);
            int x;
            while ((x = b3.read()) != -1)
                h++;
            f3.close();
            System.out.println("Total vote of UCEM=" + h);
        } catch (Exception e) {
            System.out.println(e);
        }

        // Read votes from UIM.txt
        try {
            FileInputStream f4 = new FileInputStream("UIM.txt");
            BufferedInputStream b4 = new BufferedInputStream(f4);
            int c;
            while ((c = b4.read()) != -1)
                j++;
            f4.close();
            System.out.println("Total vote of UIM=" + j);
        } catch (Exception e) {
            System.out.println(e);
        }

        // Read votes from UIP.txt
        try {
            FileInputStream f5 = new FileInputStream("UIP.txt");
            BufferedInputStream b5 = new BufferedInputStream(f5);
            int v;
            while ((v = b5.read()) != -1)
                k++;
            f5.close();
            System.out.println("Total vote of UIP=" + k);
        } catch (Exception e) {
            System.out.println(e);
        }

        // Determine the winner
        if (s > g && s > j && s > h && s > k) {
            System.out.println("\t\t_____WINNER IS UIT_____");
        } else if (g > s && g > j && g > h && g > k) {
            System.out.println("____WINNER IS UCER____");
        } else if (h > s && h > g && h > j && h > k) {
            System.out.println("____WINNER IS UCEM____");
        } else if (j > s && j > g && j > h && j > k) {
            System.out.println("____WINNER IS UIM____");
        } else if (k > s && k > j && k > g && k > h) {
            System.out.println("____WINNER IS UIP_____");
        } else {
            System.out.println("____IT'S A TIE_____");
        }
    }
}