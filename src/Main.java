public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задача1
        int i=1;
        while (i<=10){
            System.out.println(""+i);
            i++;
        }
        for ( i=10;i>0;i--){
            System.out.println(""+i);
        }
    //Задача2
                for (i=2;i<=31;i=i+7){
            System.out.println("Сегодня пятница " +i+ "-e число.Необходимо подготовить отчет.");
        }
        //Задача3
        int y=0;
          int year=2022;
          for (;y<year+100;y+=79){
              if(y>year-200)
                  System.out.println("Комета пролетела рядом с Землей "+y+ "году");
          }
    }
}