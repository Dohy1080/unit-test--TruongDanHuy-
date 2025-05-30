# 🎓 StudentAnalyzer

## 📌 Mô tả bài toán

Ứng dụng `StudentAnalyzer` gồm hai chức năng chính:

1. **Đếm số lượng học sinh đạt loại Giỏi**
    - Một học sinh được xem là **Giỏi** nếu có điểm **>= 8.0**
    - Bỏ qua các điểm không hợp lệ (`< 0` hoặc `> 10`)

2. **Tính điểm trung bình hợp lệ**
    - Chỉ tính trung bình các điểm **nằm trong khoảng từ 0 đến 10**
    - Bỏ qua các điểm sai

---

## 🛠 Cấu trúc project
StudentAnalyzer/
├── src/
│ ├── main/
│ │ └── java/
│ │ └── StudentAnalyzer.java
│ └── test/
│ └── java/
│ └── StudentAnalyzerTest.java
├── README.md
├── pom.xml (nếu dùng Maven)


---

## ▶️ Cách chạy chương trình

### Bước 1: Biên dịch chương trình

```bash

public class Main {
    public static void main(String[] args) {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        var scores = java.util.Arrays.asList(9.0, 8.5, 7.0, -1.0, 10.5, 8.0);

        int excellentCount = analyzer.countExcellentStudents(scores);
        double avg = analyzer.calculateValidAverage(scores);

        System.out.println("Số học sinh giỏi: " + excellentCount);
        System.out.println("Điểm trung bình hợp lệ: " + avg);
    }
}


javac Main.java
java Main

✅ Cách chạy kiểm thử (JUnit)
⚙️ Yêu cầu
Java 8+

JUnit 5

Maven hoặc IDE hỗ trợ JUnit (IntelliJ IDEA, Eclipse...)

✅ Nếu dùng Maven:
pom.xml (phần phụ thuộc):
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>

mvn test

🧪 Các ca kiểm thử đã thực hiện
Loại kiểm thử	Mô tả
Bình thường	Danh sách có điểm hợp lệ và không hợp lệ
Biên	Danh sách rỗng, chỉ chứa 0 hoặc 10
Ngoại lệ	Chứa điểm < 0 hoặc > 10 (bị bỏ qua)
Ví dụ:
assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);

