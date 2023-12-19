//import java.util.ArrayList;
//import java.util.Scanner;
//import vn.edu.ptit.Invoice;
//import vn.edu.ptit.Rule;
//import vn.edu.ptit.Student;
//import vn.edu.ptit.Subject;
//
//
//public class PaymentController {
//    private Invoice invoice;
//    private Rule rule;
//    private Student student;
//    private Subject subject;
//
//    public PaymentController() {
//        Scanner scanner = new Scanner(System.in);
//
//        String maSV = scanner.nextLine();
//        String tenSV = scanner.nextLine();
//        int soMon = Integer.parseInt(scanner.nextLine());
//
//        student = new Student(maSV, tenSV);
//        double sum = 0;
//        String maMon;
//        String tenMon;
//        int soTC;
//        ArrayList<Subject> arr = new ArrayList<>();
//
//        while (soMon-- > 0) {
//            maMon = scanner.nextLine();
//            tenMon = scanner.nextLine();
//            soTC = Integer.parseInt(scanner.nextLine());
//            arr.add(new Subject(tenMon, maMon, soTC));
//        }
//
//        String maQuyDinh = scanner.nextLine();
//        String tenQuyDInh = scanner.nextLine();
//        double gia = Double.parseDouble(scanner.nextLine());
//        for(Subject ele : arr) {
//            sum += gia * ele.getCredit();
//        }
//        rule = new Rule(maQuyDinh, tenQuyDInh, sum);
//        invoice = new Invoice(rule);
//        invoice.setSt(student);
//        invoice.setAlSubject(arr);
//        invoice.setAmount(sum);
//    }
//
//    public Invoice getInvoice() {
//        return invoice;
//    }
//}
