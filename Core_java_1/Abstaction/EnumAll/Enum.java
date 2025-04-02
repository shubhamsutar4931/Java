package EnumAll;

enum Status {
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {
//         like that
//         int a=5;
//         Status s = Status.Running;
//         System.out.println(s);

        // Status[] ss = Status.values(); //array
        // // enhanced loop
        // for (Status sss : ss) {
        // System.out.println(sss + ":" + sss.ordinal());
        // }

        // working enum for if-else statement

//          Status s = Status.Success;
//          if (s == Status.Running) {
//          System.out.println("All good");
//          } else if (s == Status.Failed) {
//          System.out.println("Try again");
//          } else if (s == Status.Pending) {
//          System.out.println("Please wait");
//          } else {
//              System.out.println("winner..");
//          }


        // working enum with Switch statement
        Status s = Status.Success;
        switch (s) {
            case Running:
                System.out.println("All good");
                break;

            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("Wait");
                break;
            default:
                System.out.println("Done");
                break;

        }
    }
}
