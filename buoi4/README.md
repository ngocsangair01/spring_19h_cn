# Buoi 6
## Kien thuc
1. Câu truy vấn data từ database (jpql)
2. Put mapping, Patch mapping
### Yêu cầu đầu bài: lấy thông tin các màu sắc có tên có chứa ký tự do, ví dụ nhập input là 'd', 'o' => đều in ra được kết quả
### Nhập vào 1 từ, gọi là keyword => tìm ra được tất cả các thông tin chứa nó (name,type,test)
### 1 câu query đơn giản sẽ có 3 mệnh đề: select, from, where
1. Select: chọn
2. From: từ
3. Where: điều kiện
## Kien thuc 
1. Put mapping vs patch mapping
2. Để chỉnh sửa đối tượng thì cần phải xác định được:id đối tượng cần chỉnh sửa,Các thuộc tính mình sẽ chỉnh sửa
3. Để chỉnh sửa đối tượng, có các cách:
4. Xóa đối tượng cũ, chèn đối tượng mới => Không tối ưu về hiệu năng, khi mà 1 đối tượng được xác định bởi id , sau khi xóa id và tạo đối tượng mới thì đối tượng mới không mang id của đối tượng cũ
5. Truyền từng thuộc tính,truyền đến đâu sửa đến đó 
6. Nhập 1 đói tượng mới chứa id của đối tượng cũ để đối tượng mới đè lên đối tượng cũ
7. Ví dụ chỉnh sửa 1 Color(1,'Red','nóng') => truyền vào thuộc tính tên là blue và type là lạnh; tạo 1 đối tượng Color (1,'Blue','lạnh');