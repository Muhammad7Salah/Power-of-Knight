import java.util.Scanner;

public class Proj {

	public static void main(String[] args){
	int NY=0;
	char NX=' ';
	int KY=0;
	char KX=' ';
	int QY=0;
	char QX=' ';
	String c = "";
    int RY = 0;
    char RX = ' ';
    String R = "NO";
    boolean res = false;
	
	Scanner sc=new Scanner(System.in);
			
	for(int i=8;i>0;i--){
	String in = sc.next();
	if(in.contains("N")){
		NX=(char)(in.indexOf("N")+65);
		NY=i;
		}
	if(in.contains("Q")){
		QX=(char)(in.indexOf("Q")+65);
		QY=i;
		}
	if(in.contains("K")){
		KX=(char)(in.indexOf("K")+65);
		KY=i;
		}
	}
	
	for (int i = -2; i < 3; i++)
    {
        for (int j = -2; j < 3; j++)
        {
            if (i == 0 || j == 0 || i == j || -i == j) { continue; }
            else
            {
                int tmpy = NY + j;
                char tmpx = (char)(NX + i);
                if (checkmate(tmpy, tmpx, KY, KX, QY, QX))
                {
                    RX = tmpx;
                    RY = tmpy;
                    R = "YES";
                    res = true;
                    break;
                }
                else
                {
                    res = false;
                    R = "NO";
                }
            }
        }
        if (res) break;
    }
    if (res)
    {
        System.out.print(R);
        System.out.print(" ");
        System.out.print(RY);
        System.out.print(RX);
    }
    else
    {
    	System.out.print(R);
    }

}

	private static boolean checkmate(int ny,char nx, int ky, char kx, int qy, char qx) {
		 boolean k = false;
         boolean q = false;

         if (nx < 65 || nx > 72 || ny < 1 || ny > 8) { k = false;q = false; }
         else
         {
             nx = (char) (nx + 2);
             ny += 1;
             if (nx == kx && ny == ky)
             {
                 k = true;
             }
             else if (nx == qx && ny == qy)
             {
                 q = true;
             }
             nx = (char)(nx - 2);
             ny -= 1;

             nx = (char)(nx + 2);
             ny -= 1;
             if (nx == kx && ny == ky)
             {
                 k = true;
             }
             else if (nx == qx && ny == qy)
             {
                 q = true;
             }
             nx = (char)(nx - 2);
             ny += 1;

             nx = (char)(nx - 2);
             ny += 1;
             if (nx == kx && ny == ky)
             {
                 k = true;
             }
             else if (nx == qx && ny == qy)
             {
                 q = true;
             }
             nx = (char)(nx + 2);
             ny -= 1;

             nx = (char)(nx - 2);
             ny -= 1;
             if (nx == kx && ny == ky)
             {
                 k = true;
             }
             else if (nx == qx && ny == qy)
             {
                 q = true;
             }
             nx = (char)(nx + 2);
             ny += 1;

             nx = (char)(nx + 1);
             ny += 2;
             if (nx == kx && ny == ky)
             {
                 k = true;
             }
             else if (nx == qx && ny == qy)
             {
                 q = true;
             }
             nx = (char)(nx - 1);
             ny -= 2;

             nx = (char)(nx + 1);
             ny -= 2;
             if (nx == kx && ny == ky)
             {
                 k = true;
             }
             else if (nx == qx && ny == qy)
             {
                 q = true;
             }
             nx = (char)(nx - 1);
             ny += 2;

             nx = (char)(nx - 1);
             ny += 2;
             if (nx == kx && ny == ky)
             {
                 k = true;
             }
             else if (nx == qx && ny == qy)
             {
                 q = true;
             }
             nx = (char)(nx + 1);
             ny -= 2;

             nx = (char)(nx - 1);
             ny -= 2;
             if (nx == kx && ny == ky)
             {
                 k = true;
             }
             else if (nx == qx && ny == qy)
             {
                 q = true;
             }
         }

         if (k && q)
             return true;
         else
             return false;
	}
	
}
