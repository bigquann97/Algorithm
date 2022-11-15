package sparta.week2;

public class Q10_2 {
    public static void main(String[] args) {
        String[] menus = new String[]{"떡볶이", "만두", "오뎅", "사이다", "콜라"};
        String[] orders = new String[]{"오뎅", "콜라", "만두", "사이다"};

        boolean result = logic(menus, orders);
        System.out.println("result = " + result);
    }

    private static boolean logic(String[] menus, String[] orders) {
        boolean orderable = false;

        for (String order : orders) {
            for (String menu : menus) {
                if(order.equals(menu)) {
                    orderable = true;
                    break;
                } else {
                    orderable = false;
                }
            }
            if(orderable == false) {
                break;
            }
        }
        return orderable;
    }
}
