# 📱 QuanlyVatTu_KhoDienThoai - Java MVC Project

![Java](https://img.shields.io/badge/Language-Java-red)
![Architecture](https://img.shields.io/badge/Architecture-MVC-blue)
![Database](https://img.shields.io/badge/Database-MySQL-orange)

Dự án phần mềm **Quản lý Vật tư Kho Điện thoại** được xây dựng trên nền tảng **Java** sử dụng mô hình kiến trúc **MVC (Model-View-Controller)**. Hệ thống cung cấp giải pháp quản lý nhập xuất kho và kiểm kê vật tư thiết bị một cách khoa học và tối ưu.

## 🏛️ Kiến trúc dự án (MVC)
Dự án được phân chia thành 3 lớp xử lý biệt lập nhằm tăng khả năng bảo trì và mở rộng:
- **Model:** Định nghĩa cấu trúc dữ liệu của đối tượng và thực hiện các thao tác truy xuất dữ liệu trực tiếp.
- **View:** Đảm nhận việc hiển thị dữ liệu và tiếp nhận các tương tác từ người dùng thông qua giao diện trực quan.
- **Controller:** Thành phần điều khiển trung tâm, xử lý các quy tắc nghiệp vụ (Business Logic) và điều phối luồng dữ liệu giữa Model và View.

## ✨ Tính năng nổi bật
- [x] Quản lý danh mục vật tư, linh kiện điện thoại thông minh.
- [x] Nghiệp vụ lập và quản lý phiếu nhập kho, phiếu xuất kho.
- [x] Theo dõi biến động và thống kê số lượng hàng tồn kho.
- [x] Chức năng tìm kiếm và bộ lọc dữ liệu đa tiêu chí.
- [x] Giao diện tương tác người dùng hiện đại và dễ sử dụng.

## 🛠️ Công nghệ và Công cụ
- **Ngôn ngữ:** Java (JDK 11+)
- **Nền tảng:** Java Swing Framework
- **Cơ sở dữ liệu:** MySQL / MariaDB
- **Kết nối:** JDBC (Java Database Connectivity)

## 🚀 Cách triển khai
1. **Clone dự án:** `git clone https://github.com/Tung1601-IT/QuanlyVatTu_KhoDienThoai.git`
2. **Cấu hình Database:** Import file SQL trong thư mục `/database` vào hệ quản trị cơ sở dữ liệu.
3. **Mở Project:** Sử dụng NetBeans hoặc IntelliJ IDEA để mở thư mục gốc của dự án.
4. **Thiết lập:** Cập nhật thông tin kết nối (Host, User, Password) trong file Controller.
