package Interface;
//1.설계도
interface Launch{
 int money = 10000;
 void eat();
}
//2.
class Burger implements Launch{
 int price;
 public Burger(){this.price = 3900;}

 @Override
 public void eat() { System.out.println("Burger 냠냠!"); }

 @Override
 public String toString() { return "Burger"; }
}
class KimchiStew implements Launch{
 int price;
 public KimchiStew(){this.price = 4000;}

 @Override
 public void eat() { System.out.println("KimchiStew 냠냠!"); }

 @Override
 public String toString() { return "KimchiStew"; }
}
class User {
 int money;
 Launch [] plate;
 int cnt = 0;
 User(){money = Launch.money; plate = new Launch[3];}

 // 리턴값 :  void  / 메서드명 : order  / 파라미터 : Launch
 // 부모(Launch)는 자식을 담을 수 있다.
 void order(Launch my){
     //System.out.println(my); // 들어간거 출력해보기 Buger [price=3900]
     int foodpricecheck = -1;

     //1. 잔액이 부족해 더이상 주문이 불가능합니다. -> 잔액(돈)   음식가격(my.price)
     //1-1. Burger (3900), KimchiStew(4000) 종류확인 후 음식가격 확인. - (instanceof)
     // my가 Burger라면 foodpricecheck = (Burger)my).price          = 3900
     // my가 KimchiStew foodpricecheck = (KimchiStew)my).price     = 4000
     // if - else if
     //1-2. 잔액이 음식가격보다 작다면 잔액이 부족해 더이상 주문이 불가능 합니다.
     // if(잔액(돈)이 음식가격보다 작다면){잔액이 부족해 더이상 주문이 불가능 합니다.}

     if (my instanceof Burger){
         foodpricecheck=((Burger) my).price;
     }else if (my instanceof KimchiStew){
         foodpricecheck=((KimchiStew) my).price;
     }


     //2. 잔액(돈) -= 음식가격(foodpricecheck) 빼기
     if (money < foodpricecheck){
         System.out.println("잔액이 부족해 " + my +" 더 이상 주문이 불가능 합니다."); return;
     }money-=foodpricecheck;

     //3. plate에 음식 추가 plate[cnt] = my
     plate[cnt++] = my;

 }
 // 리턴값 : void  메서드명 : show  파라미터 : X
 void show(){
     String items = "";
     int total = 0;
     Calendar today = Calendar.getInstance();
     //System.out.println(Arrays.toString(plate));

     for (int i =0; i<plate.length; i++){
         if (plate[i] == null ) {
             break;
         }
         items += plate[i] + ",";
         int temp = 0;
         if (plate[i] instanceof  Burger){
             temp = ((Burger) plate[i]).price;
         }else if (plate[i] instanceof KimchiStew){
             temp = ((KimchiStew) plate[i]).price;
         }
         total += temp;
     }
     System.out.println("주   문 : " + items);
     System.out.println("주문금액 : " + total);
     System.out.println("잔   액 : " + money);
     System.out.println("주문시간 : " + today.get(1) + "년\t" + (today.get(2)+1) + "월\t" + today.get(5) + "일");

     for (int i = 0; i<plate.length; i++){
         if (plate[i] == null){
             break;
         }
         plate[i].eat();
     }
 }

}

public class Interface002 {
 public static void main(String[] args) {
     User launchorder = new User();
     launchorder.order(new Burger()); // 리턴값 : void  메서드명 : order  파라미터 : Launch
     launchorder.order(new KimchiStew());
     launchorder.order(new Burger());
     launchorder.show(); // 리턴값 : void  메서드명 : show  파라미터 : X
 }
}