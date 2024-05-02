

public class Main {
    public static void main(String[] args) {
        // Mảng số
        int[] arr = {5, 3, 10, 45, 77, 23, 36};

        // 1. Tìm số lớn nhất
        int max = findMax(arr);
        System.out.println("Số lớn nhất trong mảng là: " + max);

        // 2. Tìm số nhỏ nhất
        int min = findMin(arr);
        System.out.println("Số nhỏ nhất trong mảng là: " + min);

        // Chuỗi số
        String numbers = "3,5,1,7,3,8";

        // 3. Sắp xếp tăng dần
        String sortedAscending = sortAscending(numbers);
        System.out.println("Chuỗi sắp xếp tăng dần: " + sortedAscending);

        // 4. Sắp xếp giảm dần
        String sortedDescending = sortDescending(numbers);
        System.out.println("Chuỗi sắp xếp giảm dần: " + sortedDescending);

        // 5. Giải phương trình bậc 2
        solveQuadraticEquation(4, -2, -6);

        // Chuỗi ký tự
        String str = "Java";

        // 6. In các ký tự xuất hiện nhiều hơn một lần
        printRepeatedCharacters(str);

        // 7. Kiểm tra đảo ngược chuỗi
        String str1 = "word";
        String str2 = "drow";
        checkIfReversed(str1, str2);

        // 8. Tìm ký tự unique
        findUniqueCharacter("abacddbe");

        // 9. Kiểm tra chuỗi có chứa chữ số hay không
        checkContainsDigit("abc123def");

        // 10. Xóa số cuối chuỗi
        removeLastNumber("thanglx81");

        // 11. Cộng 2 số
        addTwoNumbers("3", "1/2");

    }

    // Hàm tìm số lớn nhất trong mảng

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Hàm tìm số nhỏ nhất trong mảng
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Hàm sắp xếp chuỗi số tăng dần
    public static String sortAscending(String numbers) {
        String[] arr = numbers.split(",");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[j])) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return String.join(",", arr);
    }

    // Hàm sắp xếp chuỗi số giảm dần
    public static String sortDescending(String numbers) {
        String[] arr = numbers.split(",");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Integer.parseInt(arr[i]) < Integer.parseInt(arr[j])) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return String.join(",", arr);
    }

    // Hàm giải phương trình bậc 2
    public static void solveQuadraticEquation(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

    // Hàm in ra các ký tự xuất hiện nhiều hơn một lần
    public static void printRepeatedCharacters(String str) {
        str = str.toLowerCase();
        int[] count = new int[256];
        for (char c : str.toCharArray()) {
            count[c]++;
        }
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > 1) {
                System.out.println(str.charAt(i) + " xuất hiện " + count[str.charAt(i)] + " lần");
                found = true;
                count[str.charAt(i)] = 0;
            }
        }
        if (!found) {
            System.out.println("NO");
        }
    }

    // Hàm kiểm tra đảo ngược chuỗi
    public static void checkIfReversed(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("KO");
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(str2.length() - 1 - i)) {
                System.out.println("KO");
                return;
            }
        }
        System.out.println("OK");
    }

    // Hàm tìm ký tự unique
    public static void findUniqueCharacter(String str) {
        int[] count = new int[256];
        for (char c : str.toCharArray()) {
            count[c]++;
        }
        for (char c : str.toCharArray()) {
            if (count[c] == 1) {
                System.out.println("Ký tự duy nhất đầu tiên là: " + c);
                return;
            }
        }
        System.out.println("NO");
    }

    // Hàm kiểm tra chuỗi có chứa chữ số hay không
    public static void checkContainsDigit(String str) {
        boolean containsDigit = false;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                containsDigit = true;
                break;
            }
        }
        System.out.println(containsDigit);
    }

    // Hàm xóa số cuối chuỗi
    public static void removeLastNumber(String str) {
        int lastIndex = str.length() - 1;
        while (lastIndex >= 0 && Character.isDigit(str.charAt(lastIndex))) {
            lastIndex--;
        }
        System.out.println("Chuỗi sau khi xóa số cuối: " + str.substring(0, lastIndex + 1));
    }

    // Hàm cộng 2 số
    public static void addTwoNumbers(String num1, String num2) {
        if (num1.contains("/") || num2.contains("/")) {
            String[] parts1 = num1.split("/");
            String[] parts2 = num2.split("/");

            // Chuyển đổi các phần tử của phân số thành số nguyên
            int numerator1 = parts1.length == 1 ? Integer.parseInt(parts1[0]) : Integer.parseInt(parts1[0]);
            int denominator1 = parts1.length == 1 ? 1 : Integer.parseInt(parts1[1]);
            int numerator2 = parts2.length == 1 ? Integer.parseInt(parts2[0]) : Integer.parseInt(parts2[0]);
            int denominator2 = parts2.length == 1 ? 1 : Integer.parseInt(parts2[1]);

            int lcm = lcm(denominator1, denominator2);

            numerator1 *= lcm / denominator1;
            numerator2 *= lcm / denominator2;

            int numeratorSum = numerator1 + numerator2;

            double result = (double) numeratorSum / lcm;
            System.out.println(result);
        } else {

            int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
            System.out.println(sum);
        }
    }

    private static int lcm(int denominator1, int denominator2) {
        int gcd = gcd(denominator1, denominator2);
        return (denominator1 * denominator2) / gcd;
    }


    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

//        1.	Tìm số lớn nhất trong mảng sau: 5, 3, 10, 45, 77, 23, 36
//        2.	Tìm số bé nhất trong mảng sau: 5, 3, 10, 45, 77, 23, 36
//        3.	Sắp xếp chuỗi sau theo tăng dần: 3,5,1,7,3,8.
//        4.	Sắp xếp chuỗi sau theo giảm dần: 3,5,1,7,3,8.
//        5.	Giải phương trình bậc 2: 4x2 - 2x - 6 = 0
//        6.	Tìm và in ra các ký tự xuất hiện nhiều hơn một lần trong String cho trước không phân biệt chữ hoa hay chữ thường. Nếu các ký tự trong chuỗi đều là duy nhất thì xuất ra “NO”. Ví dụ chuỗi “Java” thì có ký tự ‘a’ hoặc String “JaVA” cũng có kết quả tương tự.
//        7.	Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không. Nếu có xuất ra “OK” ngược lại “KO”. Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
//        8.	Tìm ký tự chỉ xuất hiện một lần trong chuỗi, nếu có nhiều hơn một thì xuất ra màn hình ký tự đầu tiên. Nếu không có ký tự nào unique xuất ra “NO”.
//        9.	Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
//        10.	Kiểm tra một chuỗi nếu phát hiện số lại cuối chuỗi thì xóa đi. Ví dụ: nhập vào thanglx81 sau khi xử lý in ra chuỗi thanglx
//        11.	Cho một chuỗi sau “a b” mặc định a và b là kí tự string. Hãy cộng 2 số đó lại với nhau: Ví dụ “3 1/2” in ra 3.5 nếu nhập “1/2” in ra 0.5.
//        Dữ liệu mẫu

