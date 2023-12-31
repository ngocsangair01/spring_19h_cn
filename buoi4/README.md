# Buoi 4
## Kien thuc
### Ket noi database thong qua jpa va driver
1. Database co 2 loai: structure query language, no sql
2. Ví dụ thực tế: định nghĩa 1 người thông qua id -> id là khóa chính của người đó(primary key)
3. 1 trường có nhiều học sinh, 1 học sinh thì chỉ học tại 1 trường -> trường học 1 - n học sinh -> primary key của trường học sẽ là foreign key của học sinh 
4. trong 1 trường học: 1 giáo viên có thể dạy  nhiều lớp học, 1 lớp học có thể được dạy bởi nhiều giáo viên -> lớp học n - n giáo viên (pfk: primary foreign key)
5. Để kết nối database thì mình cần dùng jpa và driver (driver posgreSQL)

## Cấu trúc 
1. database -> backend -> frontend (đang nói về các cổng mặc định)
2. database postgre có cổng là 5432 để backend connect
3. backend có cổng là 8080 để frontend connect


## Get, put, post, patch, delete với 1 table
## authentication, authorization, upload file (cloudinary), validation(validate định dạng email, số điện thoại), mail sender
## bài tập về nhà 
1. Tạo 1 class User(name, address,school)
2. Lấy thông tin tất cả user, lấy thông tin user theo id, lấy thông tin user theo name like (ví dụ tên Sáng, có thể tìm khi ấn kí tự S, Sa,...)(gợi ý ở jpa là findAllBy...Like)
3. Lấy thông tin theo cả 3 trường dữ liệu: name, school, address like, nếu có trường thông tin nào thì tìm theo thông tin đó, ví dụ nếu có name và address thì tìm theo name và address, nếu có name thì tìm theo name,...